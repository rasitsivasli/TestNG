package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class C10_SoftAssertion extends TestBase {
    //Test Case2: Negative Username Test
    //Open page https://practicetestautomation.com/practice-test-login/
    //Type username incorrectUser into Username field.
    //Type password Password123 into Password field.
    //Click Submit button.
    //Verify error message is displayed.
    //Verify error message text is Your username is invalid!


    @Test
    public void negativeUserNameTestSoft(){
        SoftAssert softAssert = new SoftAssert();
        //Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //Type username incorrectUser into Username field.
        WebElement userName = driver.findElement(By.cssSelector("input#username"));
        userName.sendKeys("Rasit");

        //Type password Password123 into Password field
        WebElement passWord = driver.findElement(By.cssSelector("input#password"));
        passWord.sendKeys("Password123");

        //Click Submit button.
        WebElement login = driver.findElement(By.cssSelector("button#submit"));
        login.click();

        //Verify error message is displayed.
        WebElement verify = driver.findElement(By.cssSelector("div#error"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(verify));// until bis anlamina geliyor
        softAssert.assertTrue(verify.isDisplayed());

        //Verify error message text is Your username is invalid!
        softAssert.assertEquals(verify.getText(), "Your username is invalid!");
        softAssert.assertAll();

    }
}
