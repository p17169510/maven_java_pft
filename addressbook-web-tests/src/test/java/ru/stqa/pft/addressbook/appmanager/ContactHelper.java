package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper  extends BaseHelper {

  public ContactHelper(WebDriver driver) {
    super(driver);
  }

  public void fillContactFields(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstname());
    type(By.name("middlename"),contactData.getMiddleName());
    type(By.name("lastname"), contactData.getLastName());
    type(By.name("nickname"), contactData.getNickName());
    type(By.name("title"), contactData.getTitle());
    type(By.name("company"), contactData.getCompany());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getHomePhoneNum());
    type(By.name("mobile"), contactData.getMobilePhoneNum());
    type(By.name("work"),contactData.getWorkPhoneNum());
    type(By.name("fax"), contactData.getFaxPhoneNum());
    type(By.name("email"), contactData.getEmail());
    type(By.name("email2"), contactData.getEmail2());
    type(By.name("email3"), contactData.getEmail3());
    type(By.name("homepage"), contactData.getHomePage());
    click(By.name("bday"));
    selectElementDropDown(By.name("bday"), contactData.getBirthDay());
    click(By.name("bmonth"));
    selectElementDropDown(By.name("bmonth"), contactData.getBirthMonth());
    type(By.name("byear"), contactData.getBirthYear());
    click(By.name("aday"));
    selectElementDropDown(By.name("aday"), contactData.getAnniversaryDay());
    click(By.name("amonth"));
    selectElementDropDown(By.name("amonth"), contactData.getAnniversaryMonth());
    type(By.name("ayear"), contactData.getAnniversaryYear());
    click(By.name("theform"));
    click(By.name("new_group"));
    selectElementDropDown(By.name("new_group"), contactData.getGroup());
    type(By.name("address2"), contactData.getSecondaryAddress());
    type(By.name("phone2"), contactData.getSecondaryHome());
    type(By.name("notes"), contactData.getSecondaryNotes());
  }

  public void submitCreatingContact() {
    driver.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
  }

  public void returnToHomePage() {
    driver.findElement(By.linkText("home")).click();
  }
}
