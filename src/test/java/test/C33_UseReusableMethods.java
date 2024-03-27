package test;

import org.testng.annotations.Test;
import utilities.JavaScriptExecutorUtils;
import utilities.ReusableMethods;
import utilities.TestBase;

import static utilities.JavaScriptExecutorUtils.scrollDownByJS;


public class C33_UseReusableMethods extends TestBase {
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.amazon.com/");

        // 1. cagirma yöntemi
        ReusableMethods.amazonCaptcha(driver);

        // 2. cagirma yöntemi
        // import yaparak direk ulasabiliriz
        scrollDownByJS(driver);

        // 3. cagirma yöntemi, obje üreterek
        JavaScriptExecutorUtils js = new JavaScriptExecutorUtils();
        Thread.sleep(2000);
        js.scrollAllUpByJS(driver);





    }
}
