package test;

import utilities.TestBase;
import org.testng.annotations.Test;

public class C22_ParallelTest extends TestBase {
    @Test
    public void test1() {
        driver.get("https://www.amazon.com./");
        long id = Thread.currentThread().getId();
        System.out.println("bu test1 icin calisan thread - " + id);


    }

    @Test
    public void test2() {
        driver.get("https://www.n11.com/");
        long id = Thread.currentThread().getId();
        System.out.println("bu test2 icin calisan thread - " + id);

    }

    @Test
    public void test3() {
        driver.get("https://www.trendyol.com/");
        long id = Thread.currentThread().getId();
        System.out.println("bu test3 icin calisan thread - " + id);

    }

    @Test
    public void test4() {
        driver.get("https://www.amazon.com./");
        long id = Thread.currentThread().getId();
        System.out.println("bu test4 icin calisan thread - " + id);

    }
}
