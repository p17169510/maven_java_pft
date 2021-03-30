package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
  private WebDriver driver;

  public NavigationHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void goToNewGroup() {
    driver.findElement(By.name("new")).click();
  }

  public void goToNewContact() {
    driver.findElement(By.linkText("add new")).click();
  }
}
