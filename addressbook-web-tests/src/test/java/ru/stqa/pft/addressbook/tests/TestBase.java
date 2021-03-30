package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {

  protected final ApplicationManager applicationManager = new ApplicationManager();

  @BeforeMethod
  public void setUp() throws Exception {
    applicationManager.initDriver();
  }



  @AfterMethod
  public void tearDown() throws Exception {
    applicationManager.stopDriver();
  }



  public ApplicationManager getApplicationManager() {
    return applicationManager;
  }
}
