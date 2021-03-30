package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class ApplicationManager {
  protected WebDriver driver;
  
  private ContactHelper contactHelper;
  protected String baseUrl;
  protected boolean acceptNextAlert = true;
  protected StringBuffer verificationErrors = new StringBuffer();

  public void initDriver() {
    System.setProperty("webdriver.chrome.driver", "C://stud//maven_java_pft//src//test//resources//chromedriver89.0.4389.23.exe");
    driver = new ChromeDriver();
    contactHelper = new ContactHelper(driver);
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  public void stopDriver() {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  public void login() {
    driver.get("http://localhost/addressbook/edit.php");
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys("admin");
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys("secret");
    driver.findElement(By.xpath("//input[@value='Login']")).click();
  }


  public void goToNewGroup() {
    driver.findElement(By.name("new")).click();
  }

  public void fillGroupFields(GroupData groupData) {
    driver.findElement(By.name("group_name")).click();
    driver.findElement(By.name("group_name")).clear();
    driver.findElement(By.name("group_name")).sendKeys(groupData.getGroupName());
    driver.findElement(By.name("group_header")).click();
    driver.findElement(By.name("group_header")).clear();
    driver.findElement(By.name("group_header")).sendKeys(groupData.getGroupHeader());
    driver.findElement(By.name("group_footer")).click();
    driver.findElement(By.name("group_footer")).clear();
    driver.findElement(By.name("group_footer")).sendKeys(groupData.getGroupFooter());
  }

  public void submitGroupCreation() {
    driver.findElement(By.name("submit")).click();
  }

  public void returnToTheGroupPage() {
    driver.findElement(By.linkText("group page")).click();
  }


  public void goToNewContact() {
    driver.findElement(By.linkText("add new")).click();
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
}
