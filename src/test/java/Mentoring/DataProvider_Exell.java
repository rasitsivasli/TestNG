package Mentoring;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.DataProviderBase;
import utilities.TestBase;

public class DataProvider_Exell extends TestBase {
    //farkli bir class dan datalarimizi da alarak kullanbilirz, bunun icin data provider olan
    //methodu dogru sekilde parametre olarak test methoduna entegre etmeliyiz.

    @Test(dataProviderClass = DataProviderBase.class, dataProvider = "dataName")
    public void dataProviderTest(String name) {
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
        driver.findElement(By.id("firstname")).sendKeys(name);
        driver.findElement(By.id("age")).sendKeys("18");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Test(dataProviderClass = DataProviderBase.class, dataProvider = "dataFullName")
    public void dataProvideFullName(String name, String lastName) {
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
        driver.findElement(By.id("firstname")).sendKeys(name);
        driver.findElement(By.id("surname")).sendKeys(lastName);
        driver.findElement(By.id("age")).sendKeys("18");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Test(dataProvider = "fakerData", dataProviderClass = DataProviderBase.class)
    public void dataProviderFakerTest(String lastName, String name) {
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
        driver.findElement(By.id("firstname")).sendKeys(name);
        driver.findElement(By.id("surname")).sendKeys(lastName);
        driver.findElement(By.id("age")).sendKeys("18");
        driver.findElement(By.xpath("//input[@type='submit']")).click();


    }
}
