package homeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class H33_DependsOnMethods {

        /*
Create tests that depend on each other
Create beforeClass and set up settings.
By creating interdependent tests;
First go to Facebook.
Then go to Google depending on Facebook,
Then go to Amazon depending on Google
Close the driver.
 */
WebDriver driver = new ChromeDriver();
    @Test
    void faceBook(){
        driver.get("https:www.facebook.com");
        System.out.println("facebook.com adresine gidildi");

    }

    @Test (dependsOnMethods = {"faceBook"})
    void google(){
        driver.get("https:www.google.com");
        System.out.println("goggle a gidildi");
    }

    @Test(dependsOnMethods = {"google"})
    void amazon(){
        driver.get("https:www.amazon.com");
        System.out.println("son durak Amazon");
        driver.quit();
    }
}