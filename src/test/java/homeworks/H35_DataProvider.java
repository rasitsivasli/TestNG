package homeworks;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.DataProviderBase;
import utilities.TestBase;

public class H35_DataProvider extends TestBase {
    //Go to URL: https://opensource-demo.orangehrmlive.com/
    //Login with negative credentilas by Data Provider.
    //Then assert that ''Invalid credentials'’ is displayed.

    @Test(dataProviderClass = DataProviderBase.class,dataProvider = "getdataHW35")
    public void test(String email, String password) {
        //Go to URL: https://opensource-demo.orangehrmlive.com/
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //Login with negative credentilas by Data Provider.
        WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        userName.sendKeys(email);
        WebElement passWord = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passWord.sendKeys(password);
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        //Then assert that ''Invalid credentials'’ is displayed.
        WebElement verify = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
        Assertions.assertTrue(verify.getText().contains("Invalid credentials"));
    }
}
