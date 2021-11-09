package com.heqing.maven.impl;

import com.heqing.maven.model.Demo;
import com.heqing.maven.service.DemoSerice;

/**
 * @author heqing
 * @date 2021/8/2 16:21
 */
public class DemoSericeImpl implements DemoSerice {

    @Override
    public String hello(Demo demo) {
        String str = "test";
        if(demo != null && demo.getName() != null) {
            str = demo.getName();
        }
        return "hello " + str;
    }
}
