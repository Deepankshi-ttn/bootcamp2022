package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Testing {

    @Test
    public void HelloWorld() {
        System.out.println("Hello World");
    }

    @Test
    public void TestSum() {

        int result = org.example.Test.sum(2, 3);
        Assert.assertEquals(5, result);
    }
}