package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper {
  private WebDriver driver;

  public GroupHelper(WebDriver driver) {
    this.driver = driver;
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

  public void returnToGroupPage() {
    driver.findElement(By.linkText("group page")).click();
  }

  public void newGroup() {
    driver.findElement(By.name("new")).click();
  }
}
