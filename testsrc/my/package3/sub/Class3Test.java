package my.package3.sub;

import org.junit.Assert;
import org.junit.Test;

public class Class3Test {

    @Test
    public void method1() {
        Assert.assertEquals(new Class3().method1(), "abc");
    }

}