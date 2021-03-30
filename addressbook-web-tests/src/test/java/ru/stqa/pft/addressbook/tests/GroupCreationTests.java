package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    applicationManager.login();
    applicationManager.goToNewGroup();
    applicationManager.fillGroupFields(new GroupData("name1", "header1", "footer1"));
    applicationManager.submitGroupCreation();
    applicationManager.returnToTheGroupPage();
  }

}
