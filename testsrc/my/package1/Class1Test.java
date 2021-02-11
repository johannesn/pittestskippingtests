package my.package1;

import my.package1.Class1;
import org.junit.Assert;
import org.junit.Test;

public class Class1Test {

    @Test
    public void method1() {
        Assert.assertEquals(new Class1().method1(), "abc");
    }
}