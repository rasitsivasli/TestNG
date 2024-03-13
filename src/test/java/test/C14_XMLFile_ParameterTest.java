package test;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.testng.annotations.DataProvider;
import utilities.ReusableMethods;
import utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C14_XMLFile_ParameterTest extends TestBase  {
    //Go to URL: https://www.amazon.com
    //Search words: Java, Selenium
    //Assert get text result test that the result text contains the searched Word.
    //Run tests from XML file.
    @Test
    public void test1(){
        driver.navigate().to("https://www.amazon.com");
        ReusableMethods.amazonCaptcha(driver);// method la astik. methoda da try acatch

        // searchBox
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Java",Keys.ENTER);

        //Assert get text result test that the result text contains the searched Word.
        WebElement verify = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        Assertions.assertTrue(verify.getText().contains("Java"));

        driver.navigate().back();
        WebElement searchBox2 = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox2.sendKeys("Selenium",Keys.ENTER);

        //Assert get text result test that the result text contains the searched Word.
        WebElement verifySelenium = driver.findElement(By.xpath("//span[.='\"Selenium\"']"));
        Assertions.assertTrue(verifySelenium.getText().contains("Selenium"));


    }
    @Test
    @Parameters("arananKelime")
    public void test2(String keyword){
        driver.navigate().to("https://www.amazon.com");
        ReusableMethods.amazonCaptcha(driver);// method la astik. methoda da try acatch

        // search Word java ve selenium
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(keyword,Keys.ENTER);

        //Assert get text result test that the result text contains the searched Word.
        WebElement verify = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        Assertions.assertTrue(verify.getText().contains(keyword));

    }

}
