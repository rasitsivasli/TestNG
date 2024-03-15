package Mentoring;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.DataProviderBase;
import utilities.TestBase;

public class DataProvider_xml extends TestBase {
    //farkli bir class dan datalarimizi da alarak kullanbilirz, bunun icin data provider olan
    //methodu dogru sekilde parametre olarak test methoduna entegre etmeliyiz.

    @Test(groups = "A")
    @Parameters({"name","lastname","age"})
    public void dataProvideFullName(String name, String lastName,String age) {
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
        driver.findElement(By.id("firstname")).sendKeys(name);
        driver.findElement(By.id("surname")).sendKeys(lastName);
        driver.findElement(By.id("age")).sendKeys(age);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    @Test(groups = "B")
    @Parameters({"name","lastname","age"})
    public void dataProvideFullName2(String name, String lastName,String age) {
        driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
        driver.findElement(By.id("firstname")).sendKeys(name);
        driver.findElement(By.id("surname")).sendKeys(lastName);
        driver.findElement(By.id("age")).sendKeys(age);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
}
