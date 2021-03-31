package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

import java.util.logging.Logger;

public class TestBase {

  public Logger log;

  public static final ApplicationManager applicationManager = new ApplicationManager();

  @BeforeClass
  public void beforeClass() {
    log = Logger.getLogger(ContactEditionTests.class.getName());
  }

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
