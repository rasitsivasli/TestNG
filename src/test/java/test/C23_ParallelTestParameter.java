package test;

import org.testng.annotations.Test;

public class C23_ParallelTestParameter {
    @Test
    public void test1(){
        System.out.println("thread id: "+Thread.currentThread().getId());
    }
}
