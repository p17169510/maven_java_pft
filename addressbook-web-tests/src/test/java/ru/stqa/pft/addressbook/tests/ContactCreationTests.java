package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    applicationManager.login();
    applicationManager.getNavigationHelper().goToNewContact();
    applicationManager.getContactHelper().fillContactFields(
        new ContactData("name", "MiddleName", "LastName", "NickName", "mr",
            "CompName", "My Home address",
            "+79130000000", "+777777777", "+495100100", "+495999999",
            "email@gmail.com", "email2@gmail.com", "email3@gmail.com", "www.homepage.com",
            "1", "January", "1990",
            "2", "March", "2001",
            "test99999",
            "secondary address", "secondary home", "secondary notes"));

    applicationManager.getContactHelper().submitCreatingContact();
    applicationManager.getContactHelper().returnToHomePage();
  }

}
