package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {
  protected WebDriver driver;

  private SessionHelper sessionHelper;
  private  NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private ContactHelper contactHelper;
  protected String baseUrl;
  protected boolean acceptNextAlert = true;
  protected StringBuffer verificationErrors = new StringBuffer();

  public void initDriver() {
    System.setProperty("webdriver.chrome.driver", "C://stud//maven_java_pft//src//test//resources//chromedriver89.0.4389.23.exe");
    driver = new ChromeDriver();
    navigationHelper = new NavigationHelper(driver);
    contactHelper = new ContactHelper(driver);
    groupHelper = new GroupHelper(driver);
    sessionHelper = new SessionHelper(driver);
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    sessionHelper.login("admin", "secret");
  }

  public void stopDriver() {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }


  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }

  public ContactHelper getContactHelper() {
    return contactHelper;
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
