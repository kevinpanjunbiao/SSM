package com.pjb.ssm.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 日志功能测试类
 * @author pan_junbiao
 **/
public class LogTest
{
    Logger logger = LogManager.getLogger(LogTest.class);

    @Before
    public void setUp() throws Exception
    {
        logger.info("测试开始@Before");
    }

    @After
    public void tearDown() throws Exception
    {
        logger.info("测试结束@After");
    }

    @Test
    public void writeLogInfo()
    {
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");
    }
}