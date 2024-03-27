package test;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.EmptyListeners;

@Listeners(EmptyListeners.class)   //1.yöntemle Listeners classımızı Test Classımıxa bağladık
                                        // Classımızı run ettiğimizde raporlara ulaşırız.
public class C29_UseEmptyListenersClassViaListenersAnnotation {
    @Test(dependsOnMethods = "successTest")// 4. test metodunun calismasina bagladik, cünkü önce burada data olusuyor.
    public void successfulTest(ITestContext context){// ITestContext context test metodlari arasinda data alis verisi yapiyor
        Assert.assertEquals(1,1);
        int i = (int) context.getAttribute("data");
        System.out.println("i = " + i);
    }

    @Test
    public void failedTest(){
        Assert.assertEquals(1,2);
    }

    @Test (timeOut = 1000)
    public void failedTestTimeout() throws InterruptedException {
        Thread.sleep(1001);
        System.out.println("I'm inside the failedTestTimeout test method");
    }

    @Test
    public void successTest(ITestContext context){
        System.out.println(context.getFailedTests().size());
        Assert.assertTrue(true);
        context.setAttribute("data",10);
        int x = (int) context.getAttribute("data");
        System.out.println("x = " + x);
    }
}
