package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper {
  protected WebDriver driver;

  public ContactHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void fillContactFields(ContactData contactData) {
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).clear();
    driver.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
    driver.findElement(By.name("middlename")).click();
    driver.findElement(By.name("middlename")).clear();
    driver.findElement(By.name("middlename")).sendKeys(contactData.getMiddleName());
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).clear();
    driver.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
    driver.findElement(By.name("nickname")).click();
    driver.findElement(By.name("nickname")).clear();
    driver.findElement(By.name("nickname")).sendKeys(contactData.getNickName());
    driver.findElement(By.name("title")).click();
    driver.findElement(By.name("title")).clear();
    driver.findElement(By.name("title")).sendKeys(contactData.getTitle());
    driver.findElement(By.name("company")).click();
    driver.findElement(By.name("company")).clear();
    driver.findElement(By.name("company")).sendKeys(contactData.getCompany());
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("address")).clear();
    driver.findElement(By.name("address")).sendKeys(contactData.getAddress());
    driver.findElement(By.name("home")).click();
    driver.findElement(By.name("home")).clear();
    driver.findElement(By.name("home")).sendKeys(contactData.getHomePhoneNum());
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).clear();
    driver.findElement(By.name("mobile")).sendKeys(contactData.getMobilePhoneNum());
    driver.findElement(By.name("work")).click();
    driver.findElement(By.name("work")).clear();
    driver.findElement(By.name("work")).sendKeys(contactData.getWorkPhoneNum());
    driver.findElement(By.name("fax")).click();
    driver.findElement(By.name("fax")).clear();
    driver.findElement(By.name("fax")).sendKeys(contactData.getFaxPhoneNum());
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys(contactData.getEmail());
    driver.findElement(By.name("email2")).click();
    driver.findElement(By.name("email2")).clear();
    driver.findElement(By.name("email2")).sendKeys(contactData.getEmail2());
    driver.findElement(By.name("email3")).click();
    driver.findElement(By.name("email3")).clear();
    driver.findElement(By.name("email3")).sendKeys(contactData.getEmail3());
    driver.findElement(By.name("homepage")).click();
    driver.findElement(By.name("homepage")).clear();
    driver.findElement(By.name("homepage")).sendKeys(contactData.getHomePage());
    driver.findElement(By.name("bday")).click();
    new Select(driver.findElement(By.name("bday"))).selectByVisibleText(contactData.getBirthDay());
    driver.findElement(By.name("bmonth")).click();
    new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText(contactData.getBirthMonth());
    driver.findElement(By.name("byear")).click();
    driver.findElement(By.name("byear")).clear();
    driver.findElement(By.name("byear")).sendKeys(contactData.getBirthYear());
    driver.findElement(By.name("aday")).click();
    new Select(driver.findElement(By.name("aday"))).selectByVisibleText(contactData.getAnniversaryDay());
    driver.findElement(By.name("amonth")).click();
    new Select(driver.findElement(By.name("amonth"))).selectByVisibleText(contactData.getAnniversaryMonth());
    driver.findElement(By.name("ayear")).click();
    driver.findElement(By.name("ayear")).clear();
    driver.findElement(By.name("ayear")).sendKeys(contactData.getAnniversaryYear());
    driver.findElement(By.name("theform")).click();
    driver.findElement(By.name("new_group")).click();
    new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    driver.findElement(By.name("address2")).click();
    driver.findElement(By.name("address2")).clear();
    driver.findElement(By.name("address2")).sendKeys(contactData.getSecondaryAddress());
    driver.findElement(By.name("phone2")).click();
    driver.findElement(By.name("phone2")).clear();
    driver.findElement(By.name("phone2")).sendKeys(contactData.getSecondaryHome());
    driver.findElement(By.name("notes")).click();
    driver.findElement(By.name("notes")).clear();
    driver.findElement(By.name("notes")).sendKeys(contactData.getSecondaryNotes());
  }

  public void submitCreatingContact() {
    driver.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
  }

  public void returnToHomePage() {
    driver.findElement(By.linkText("home")).click();
  }
}
