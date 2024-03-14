package homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class H34_DataProvider extends TestBase {

    //Login with that http://opencart.abstracta.us/index.php?route=account/login
    //Email: clarusway@gmail.com
    //Password: 123456789
    //Using the Search function do it with Data Provider for Mac, iPad and Samsung.
    @Test(dataProvider = "getdata")
    public void test(String email, String password) {
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");
        WebElement emailAdresse = driver.findElement(By.xpath("//input[@id='input-email']"));
        emailAdresse.sendKeys(email);
        WebElement passWord = driver.findElement(By.xpath("//input[@id='input-password']"));
        passWord.sendKeys(password);
        WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
        login.click();

    }

    @DataProvider
    public static Object[][] getdata() {
        return new Object[][]{{"clarusway@gmail.com", "123456789"}};
    }

    @Test(dataProvider = "getdata2")
    public void test2(String search) {
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");
            WebElement computer = driver.findElement(By.xpath("//input[@placeholder='Search']"));
            computer.sendKeys(search, Keys.ENTER);

    }
    @DataProvider
    public static Object[][] getdata2() {
        return new Object[][]{{"Mac"}, {"iPad"}, {"Samsung"}};
    }
}
