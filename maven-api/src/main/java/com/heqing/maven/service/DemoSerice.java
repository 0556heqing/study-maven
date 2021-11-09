package com.heqing.maven.service;

import com.heqing.maven.model.Demo;

/**
 * @author heqing
 * @date 2021/8/2 16:21
 */
public interface DemoSerice {

    /**
     * 测试 maven 方法
     * @param demo 测试
     * @return 测试输出
     */
    String hello(Demo demo);

}
