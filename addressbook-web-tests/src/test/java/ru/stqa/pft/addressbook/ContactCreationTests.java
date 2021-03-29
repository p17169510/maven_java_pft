package ru.stqa.pft.addressbook;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactCreationTests {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C://stud//maven_java_pft//src//test//resources//chromedriver89.0.4389.23.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testContactCreationTests() throws Exception {
        login();
        newContact();
        fillContactFields();
        enter();
        returnToTheHomePage();
    }

    private void returnToTheHomePage() {
        driver.findElement(By.linkText("home")).click();
    }

    private void enter() {
        driver.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    private void fillContactFields() {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("Name");
        driver.findElement(By.name("middlename")).click();
        driver.findElement(By.name("middlename")).clear();
        driver.findElement(By.name("middlename")).sendKeys("MiddleNeme");
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("LastName");
        driver.findElement(By.name("nickname")).click();
        driver.findElement(By.name("nickname")).clear();
        driver.findElement(By.name("nickname")).sendKeys("NickName");
        driver.findElement(By.name("title")).click();
        driver.findElement(By.name("title")).clear();
        driver.findElement(By.name("title")).sendKeys("mr");
        driver.findElement(By.name("company")).click();
        driver.findElement(By.name("company")).clear();
        driver.findElement(By.name("company")).sendKeys("CompName");
        driver.findElement(By.name("address")).click();
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys("My Home address");
        driver.findElement(By.name("home")).click();
        driver.findElement(By.name("home")).clear();
        driver.findElement(By.name("home")).sendKeys("+79130000000");
        driver.findElement(By.name("mobile")).click();
        driver.findElement(By.name("mobile")).clear();
        driver.findElement(By.name("mobile")).sendKeys("+777777777");
        driver.findElement(By.name("work")).click();
        driver.findElement(By.name("work")).clear();
        driver.findElement(By.name("work")).sendKeys("+495100100");
        driver.findElement(By.name("fax")).click();
        driver.findElement(By.name("fax")).clear();
        driver.findElement(By.name("fax")).sendKeys("+495999999");
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("lolkek@gmai.com");
        driver.findElement(By.name("email2")).click();
        driver.findElement(By.name("email2")).clear();
        driver.findElement(By.name("email2")).sendKeys("loleskekes@gmail.com");
        driver.findElement(By.name("email3")).click();
        driver.findElement(By.name("email3")).clear();
        driver.findElement(By.name("email3")).sendKeys("loles1kekes1@gmail.com");
        driver.findElement(By.name("homepage")).click();
        driver.findElement(By.name("homepage")).clear();
        driver.findElement(By.name("homepage")).sendKeys("www.homepage.com");
        driver.findElement(By.name("bday")).click();
        new Select(driver.findElement(By.name("bday"))).selectByVisibleText("1");
        driver.findElement(By.name("bmonth")).click();
        new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText("January");
        driver.findElement(By.name("byear")).click();
        driver.findElement(By.name("byear")).clear();
        driver.findElement(By.name("byear")).sendKeys("1990");
        driver.findElement(By.name("aday")).click();
        new Select(driver.findElement(By.name("aday"))).selectByVisibleText("2");
        driver.findElement(By.name("amonth")).click();
        new Select(driver.findElement(By.name("amonth"))).selectByVisibleText("March");
        driver.findElement(By.name("ayear")).click();
        driver.findElement(By.name("ayear")).clear();
        driver.findElement(By.name("ayear")).sendKeys("2001");
        driver.findElement(By.name("theform")).click();
        driver.findElement(By.name("new_group")).click();
        new Select(driver.findElement(By.name("new_group"))).selectByVisibleText("test99999");
        driver.findElement(By.name("address2")).click();
        driver.findElement(By.name("address2")).clear();
        driver.findElement(By.name("address2")).sendKeys("secondary address");
        driver.findElement(By.name("phone2")).click();
        driver.findElement(By.name("phone2")).clear();
        driver.findElement(By.name("phone2")).sendKeys("secondary home");
        driver.findElement(By.name("notes")).click();
        driver.findElement(By.name("notes")).clear();
        driver.findElement(By.name("notes")).sendKeys("secondary notes");
    }

    private void newContact() {
        driver.findElement(By.linkText("add new")).click();
    }

    private void login() {
        driver.get("http://localhost/addressbook/edit.php");
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys("admin");
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys("secret");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
