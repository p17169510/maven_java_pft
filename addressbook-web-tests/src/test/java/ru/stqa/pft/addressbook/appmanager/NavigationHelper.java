package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends BaseHelper {

  public NavigationHelper(WebDriver driver) {
    super(driver);
  }

  public void goToGroupsPage() {
    click(By.linkText("groups"));
  }

  public void goToNewContact() {
    click(By.linkText("add new"));
  }

  public void goToHomePage() {
    click(By.linkText("home"));
  }
}
