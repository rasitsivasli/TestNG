package test;

import utilities.ReusableMethods;
import utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_DataProvider extends TestBase {
            /*
    @DataProvider bir TestNG annotation’idir.
    Dolayisiyla sadece TestNG ile kullanilir.
    Veri sağlamak için kullanılır/ TestNG'deki verilerin listesini almak için kullanılır
    DDT (Data Driven Test) yapilir
    Cucumber’daki Scenario Outline ile ayni isleve sahiptir
    DataProvider ile bir yöntemden test yöntemine veri nasıl geçirilir?
    -Test yönteminde dataProvider kullanın ve acıklamayı yöntem adına eşit olarak ayarlayın
       name ="alternative name" kullanarak alternatif isim verebiliriz.
     */
    //Go to URL: https://www.amazon.com
    //Search for java, javascript, phython

    @Test(dataProvider = "getData")
    public void test1(String kelime) {
        driver.get("https://www.amazon.com/");
        ReusableMethods.amazonCaptcha(driver);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(kelime + Keys.ENTER);
    }

    @DataProvider
    public Object[] getData() {
        return new Object[]{
                "java",
                "javascript",
                "phython",
        };
    }
    @Test(dataProvider = "getData")
    public void test2(String kelime) {
        driver.get("https://www.amazon.com/");
        ReusableMethods.amazonCaptcha(driver);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(kelime + Keys.ENTER);
    }

    @DataProvider(name ="aranacakKelime")
    public ArrayList<String> getData2() {
        return new ArrayList<>(Arrays.asList("java", "javascript", "phython"));
    }

    @Test(dataProvider = "getData")
    public void test3(String kelime) {
        driver.get("https://www.amazon.com/");
        ReusableMethods.amazonCaptcha(driver);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(kelime + Keys.ENTER);
    }

    @DataProvider
    public Object[][] getDat3() {
         Object[][] data = new Object[3][1];
                data[0]=new Object[]{"java"};
                data[1]=new Object[]{"javascript"};
                data[2]=new Object[]{"phython"};

        return data;
    }
}