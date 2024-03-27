package test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import utilities.Listeners;

public class C27_AllureTest {

    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void test1(){
        Assert.assertTrue(true);
        System.out.println("testcase1 dogru sekilde calismistir");
    }
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void test2(){
        Assert.assertTrue(false);
        System.out.println("testcase2 dogru sekilde calismamistir");
    }
    @Description("Bu test methodu skip edilecek")
    @Test
    public void test3(){
        throw new SkipException("test3 skip edilecek");
    }
    @Description("Bu test methodu skip edilecek")
    @Test
    public void test4(){
        throw new SkipException("test4 skip edilecek");
    }
}
