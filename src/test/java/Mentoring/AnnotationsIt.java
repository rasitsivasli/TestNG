package Mentoring;

import org.testng.annotations.*;

public class AnnotationsIt {
    //create 6 test method
    //Create 2 groups for tests name it A and B
    //Give priority "-1" for the last test(6)
    //6 th test dependsOn Group A
    //Create @BeforeGroups and After Groups Annotations
    @Test(groups = "A")
    public void test1() {
        System.out.println("test1 çalıştı");
    }

    @Test(groups = "A")
    public void test2() {
        System.out.println("test2 çalıştı");
    }

    @Test(groups = "A")
    public void test3() {
        System.out.println("test3 çalıştı");
    }

    @Test(groups = "B")
    public void test4() {
        System.out.println("test4 çalıştı");
    }

    @Test(groups = "B")
    public void test5() {
        System.out.println("test5 çalıştı");
    }

    @Test(groups = "B")
    public void test6() {
        System.out.println("test6 çalıştı");
    }

    @BeforeGroups(groups = {"A", "B"})
    public void beforeMethod() {
        System.out.println("before method");
    }

    @AfterGroups(groups = {"A", "B"})
    public void afterMethod() {
        System.out.println("after method");
    }

}
