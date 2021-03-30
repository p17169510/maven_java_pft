package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseHelper {
  protected WebDriver driver;

  public BaseHelper(WebDriver driver) {
    this.driver = driver;
  }

  protected void type(By locator, String sendText) {
    driver.findElement(locator).click();
    driver.findElement(locator).clear();
    driver.findElement(locator).sendKeys(sendText);
  }

  protected void click(By locator) {
    driver.findElement(locator).click();
  }

  protected void selectElementDropDown(By locator, String data) {
    new Select(driver.findElement(locator)).selectByVisibleText(data);
  }
}
