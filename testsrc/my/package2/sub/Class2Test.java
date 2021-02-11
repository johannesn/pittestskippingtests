package my.package2.sub;

import org.junit.Assert;
import org.junit.Test;

public class Class2Test {

    @Test
    public void method1() {
        Assert.assertEquals(new Class2().method1(), "abc");
    }
}