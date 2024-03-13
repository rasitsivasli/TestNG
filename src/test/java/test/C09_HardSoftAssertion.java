package test;

import org.openqa.selenium.WebElement;
import utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C09_HardSoftAssertion extends TestBase {
        /*
    Test Case1: Positive Login Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username student into Username field
    Type password Password123 into Password field
    Click Submit button.
    Verify new page URL contains practicetestautomation.com/logged-in-successfully/
    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
    Verify button Log out is displayed on the new page.
     */

    @Test
    public void testLoginHard() {

        //Test Case1: Positive Login Test
        // Open page
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Type username student into Username field
        WebElement userName = driver.findElement(By.cssSelector("input#username"));
        userName.sendKeys("student");

        //Type password Password123 into Password field
        WebElement passWord = driver.findElement(By.cssSelector("input#password"));
        passWord.sendKeys("Password123");

        //Click Submit button.
        WebElement login = driver.findElement(By.cssSelector("button#submit"));
        login.click();

        //Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));

        //Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        String text = driver.findElement(By.tagName("strong")).getText();
        Assert.assertTrue(text.contains("Congratulations")||text.contains("successfully logged in"));

        //Verify button Log out is displayed on the new page.
        Assert.assertTrue(driver.findElement(By.xpath("//a[.='Log out']")).isDisplayed());
    }

    @Test
    public void testLoginSoft() {

        //Test Case1: Positive Login Test
        // Open page
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Type username student into Username field
        WebElement userName = driver.findElement(By.cssSelector("input#username"));
        userName.sendKeys("student");

        //Type password Password123 into Password field
        WebElement passWord = driver.findElement(By.cssSelector("input#password"));
        passWord.sendKeys("Password123");

        //Click Submit button.
        WebElement login = driver.findElement(By.cssSelector("button#submit"));
        login.click();

        //Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));

        //Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        String text = driver.findElement(By.tagName("strong")).getText();
        softAssert.assertTrue(text.contains("Congratulations") || text.contains("successfully logged in"));

        //Verify button Log out is displayed on the new page.
        softAssert.assertTrue(driver.findElement(By.xpath("//a[.='Log out']")).isDisplayed());
        softAssert.assertAll();
    }
}
