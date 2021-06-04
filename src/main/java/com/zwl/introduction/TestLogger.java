package com.zwl.introduction;

import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author zwl
 * @date 2021/6/4 13:58
 * @describe 入门案例...
 */
public class TestLogger {
    /**
     * 入门案例
     *
     * @throws Exception
     */
    @Test
    public void testQuick() throws Exception {
        // 1.创建日志记录器对象，每一个日志记录器都需要一个唯一标识,一般以当前类的全限定类名作为唯一标识
        Logger logger = Logger.getLogger("com.zwl.introduction.TestLogger");
        // 2.日志记录输出
        logger.info("hello jul");

        //通用方法进行日志输出
        logger.log(Level.WARNING, "这是WARNING级别的日志...");
        logger.log(Level.INFO, "这是info级别的日志...");

        //通过占位符方式输出日志
        String name = "jack";
        Integer age = 18;
        logger.log(Level.INFO, "用户信息：{0},{1}", new Object[]{name, age});

    }
}
