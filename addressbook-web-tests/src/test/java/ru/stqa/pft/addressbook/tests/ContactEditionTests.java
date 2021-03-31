package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactEditionTests extends TestBase{
  @Test
  public void contactDeleteTest() {
    //creating contact before deleting
    applicationManager.getContactHelper().createContact(
        new ContactData("name", "MiddleName", "LastName", "NickName", "mr",
            "CompName", "My Home address",
            "+79130000000", "+777777777", "+495100100", "+495999999",
            "email@gmail.com", "email2@gmail.com", "email3@gmail.com", "www.homepage.com",
            "1", "January", "1990",
            "2", "March", "2001",
            "test99999",
            "secondary address", "secondary home", "secondary notes"));

    //deleting contact
    applicationManager.getNavigationHelper().goToHomePage();
    int countOfContactsBeforeDeletion = applicationManager.getHomeHelper().getCountOfContacts();
    applicationManager.getHomeHelper().select();
    applicationManager.getHomeHelper().submitDeletion();
    applicationManager.getHomeHelper().confirmDeletion();
    applicationManager.getNavigationHelper().goToHomePage();
    int countOfContactsAfterDeletion = applicationManager.getHomeHelper().getCountOfContacts();
//    System.out.printf("Assertion: %d and %d", countOfContactsAfterDeletion, countOfContactsBeforeDeletion - 1);
    log.info("Assertion: " + countOfContactsAfterDeletion + " and " + (countOfContactsBeforeDeletion - 1));
    Assert.assertEquals(countOfContactsAfterDeletion, countOfContactsBeforeDeletion - 1); }
}
