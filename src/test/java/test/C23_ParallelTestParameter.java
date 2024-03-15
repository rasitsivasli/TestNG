package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class C23_ParallelTestParameter {
    // Bir methodu birden fazla defa paralel kosturmak icin kac thread calisacegini threadPoolSize ile beliliyoruz
    // Test methodunu kac deva kosacagini invocationCount ile beliliyoruz
    // timeOut = bir kosuma ayrilmis max. süreyi gösterir
    @Test(threadPoolSize = 8, invocationCount = 8)
    public void test1() {
        System.out.println("thread id: " + Thread.currentThread().getId());
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com./");}
    }

