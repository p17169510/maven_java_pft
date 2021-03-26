package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {
    public GroupCreationTests() {
        System.out.println("===create GroupCreationTests object===");
    }

    @Test
    public void testGroupCreation() throws Exception {
        ///
        System.out.println("====run test method testGroupCreation()===");
        ///

        app.goToGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
