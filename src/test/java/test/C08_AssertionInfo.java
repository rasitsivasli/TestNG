package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;


public class C08_AssertionInfo {
    @Test
    public void hard(){
        //hard assertionlar Assert classi uzerinden cagirdigimiz ve biildigimiz methodlardir..
        //test executioni sirasinda herhangi bir assertion failed olursa trest execution o anda durur
        System.out.println("checking 1=2");
        Assert.assertEquals(1,2);

        System.out.println("checking 1=1");
        Assert.assertEquals(1,1);// passed


    }

    @Test
    public void soft(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("checking 1=2");
        softAssert.assertEquals(1,2);// bu asasertion fail olsa bile java assertAll'a kadar executiona devam eder.

        System.out.println("checking 1=1");
        softAssert.assertEquals(1,1);// bu asasertion fail olsa bile java assertAll'a kadar executiona devam eder.

        System.out.println("Hala AsserAll calismadigi icin bu yazi konsola cikar");
        softAssert.assertAll();
        System.out.println("Bu yazi konsolda cikacak mi?");
    }
}
