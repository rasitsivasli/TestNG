package test;

import net.bytebuddy.implementation.bytecode.Throw;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class C05_Enabled {
    //  enabled = false  methodu : Testi gormezden gelmek icin @Test in yanina
    //  (enabled = false) fonksiyonunu kullaniriz.
    // default deger true dur yazmaya gerek yoktur.

    // enabled = false olursa testimiz pasif hale gelir ve calismaz
    @Test
    void test1() {
        System.out.println("test1");
    }

    @Test()
    void test2() {
        System.out.println("test2");
        throw  new RuntimeException();
    }

    @Test()
    void test3() {
        System.out.println("test3");
        throw  new SkipException("skip");
    }

    @Test
    void test4() {
        System.out.println("test4");
    }

    @Test
    void test5() {
        System.out.println("test5");
    }

    @Test()
    void test6() {
        System.out.println("test6");
    }

    /*bu kod satirina kadar cikti :
    test1
    test4
    test5
     */
    @Test(priority = -3000)
    void b() {
        System.out.println("b");
    }

    @Test(priority = -2001, dependsOnMethods = {"test6", "c"})
    void a() {
        System.out.println("a");
    }

    @Test
    void c() {
        System.out.println("c");
    }
}
/*
c
test1
test4
test5
b
 */