package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends BaseHelper {

  public SessionHelper(WebDriver driver) {
    super(driver);
  }

  public void login(String login, String password) {
    driver.get("http://localhost/addressbook/edit.php");
    type(By.name("user"), login);
    type(By.name("pass"), password);
    click(By.xpath("//input[@value='Login']"));
  }
}
