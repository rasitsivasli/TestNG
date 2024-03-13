package test;

import utilities.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class C17_DataProviderFaker extends TestBase {
    //Go to URL: https://opensource-demo.orangehrmlive.com/
    //Login with negative credentilas by Data Provider.
    //Then assert that ‘’Invalid credentials’’ is displayed.
    @Test(dataProvider = "getData")
    public void test(String username, String password){
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement invalidWE = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
        Assert.assertTrue(invalidWE.isDisplayed());
    }
    @DataProvider
    public Object[][] getData(){
        Faker faker = new Faker();
        Object[][] data= new Object[3][2];
        data[0]= new Object[]{faker.name().username(), faker.internet().password()};
        data[1]= new Object[]{faker.name().username(), faker.internet().password()};
        data[2]= new Object[]{faker.name().username(), faker.internet().password()};
        return data;
    }
    @Test(dataProvider = "getData")
    public void test2(String username, String password){
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement invalidWE = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
        Assert.assertTrue(invalidWE.isDisplayed());
    }
    @DataProvider
    public Object[][] getData2() {
        Faker faker = new Faker();
        Object[][] data = new Object[3][];
        for (int i = 0; i < 3; i++) {
            Object username = faker.name().username();
            Object password = faker.internet().password();
            data[i] = new Object[]{username,password};
        }
        return data;
    }
}

