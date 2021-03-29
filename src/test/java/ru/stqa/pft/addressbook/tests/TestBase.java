package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();

  ///
  public TestBase() {
    System.out.println("===create TestBase object===");
  }
  ///

  @BeforeMethod
  public void setUp() throws Exception {
    ///
    System.out.println("===@BeforeMethod void setUp()===");
    ///
    app.init();
  }


  @AfterMethod
  public void tearDown() throws Exception {
    ///
    System.out.println("===@AfterMethod void tearDown()===");
    ///
    app.stop();
  }

}
