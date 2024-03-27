package Mentoring;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
// Goto page: https://clarusway.com/ get title
//Goto page: https://www.ikea.com/ get title
//Goto page: https://www.eviltester.com/page/tools/testpages/ get title

public class ParallelTest {

    @DataProvider(parallel = true , name = "getData")

    @Test(dataProvider = "getData")
    public void test1(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        long id = Thread.currentThread().getId();
        System.out.println("bu test1 icin calisan thread - " + id);
        driver.get("https://clarusway.com/");}

    @Test(dataProvider = "getData")
    public void test2(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        long id = Thread.currentThread().getId();
        System.out.println("bu test2 icin calisan thread - " + id);
        driver.get("https://www.ikea.com/");}

    @Test(dataProvider = "getData")
    public void test3(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        long id = Thread.currentThread().getId();
        System.out.println("bu test3 icin calisan thread - " + id);
        driver.get("https://www.eviltester.com/page/tools/testpages/");}
}
