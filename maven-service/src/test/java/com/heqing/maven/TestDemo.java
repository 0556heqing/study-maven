package com.heqing.maven;

import com.heqing.maven.impl.DemoSericeImpl;
import com.heqing.maven.model.Demo;
import com.heqing.maven.service.DemoSerice;
import org.junit.Test;

public class TestDemo {

    @Test
    public void testDemo() {
        Demo demo = new Demo();
        demo.setName("maven");

        DemoSerice demoSerice = new DemoSericeImpl();
        String str = demoSerice.hello(demo);

        System.out.println("--> " + str);
    }
}
