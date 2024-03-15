package test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class C27_AllureTest {

    @Test
    public void test1(){
        Assert.assertTrue(true);
        System.out.println("testcase1 dogru sekilde calismistir");
    }
    @Test
    public void test2(){
        Assert.assertTrue(false);
        System.out.println("testcase2 dogru sekilde calismamistir");
    }
    @Test
    public void test3(){
        throw new SkipException("test3 skip edilecek");
    }


    @Test
    public void test4(){
        throw new SkipException("test4 skip edilecek");
    }
}
