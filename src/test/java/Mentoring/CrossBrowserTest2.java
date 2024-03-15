package Mentoring;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.ParameterBrowserTestBase;
//Goto Page:https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
//Send title, text and click add buttton (5 times)
//CrossBrowser Test (Chrome,FireFox,Edge)

public class CrossBrowserTest2 extends ParameterBrowserTestBase {

    @Test
    @Parameters({"name","age"})
    public void test1(String baslik, String note) {
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");
        driver.findElement(By.xpath("//input[@id='note-title-input']")).sendKeys(baslik);
        driver.findElement(By.xpath("//textarea[@id='note-details-input']")).sendKeys(note);
        driver.findElement(By.xpath("//button[@id='add-note']")).click();
    }



    //bu test methodlari class seviyesinde calistirildiginda hepsi chrome browser da calisir,
    //cunku extends edilen ParametersBrowserClass da default olarak chrome browser secilidir
    //farkli browserlarda islem yapmak icin xml dosyasinda browserin parametre olarak belirtilmesi gerekir
}
