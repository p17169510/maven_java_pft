package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeHelper extends BaseHelper{

  public HomeHelper(WebDriver driver) {
    super(driver);
  }

  public void select() {
    click(By.xpath("(//input[@type='checkbox'])"));
  }

  public void submitDeletion() {
    click(By.xpath("(//input[@value='Delete'])"));
  }

  public int getCountOfContacts() {
    return Integer.parseInt(driver.findElement(By.xpath("(//span[@id='search_count'])")).getText());
  }

  public void confirmDeletion() {
    driver.switchTo().alert().accept();
  }
}
