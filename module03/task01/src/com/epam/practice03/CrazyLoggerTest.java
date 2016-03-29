package com.epam.practice03;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Created by vrama on 22.03.2016.
 */
public class CrazyLoggerTest {

    private CrazyLogger cL = new CrazyLogger();

    @Test
    public void getDataTest() {
        Assert.assertNotNull(cL.getAllLogs());
    }

    @Test
    public void findInLogTest() {
        System.out.println(cL.findInLog("To be"));
        System.out.println(cL.findInLog("God"));
        System.out.println(cL.findInLog("Today"));

    }

    @Before
    public void setUp() throws Exception {
        cL.logAMessage("Today I thought about JavaMemoryModel");
        cL.logAMessage("Or do not");
        cL.logAMessage("To be or not to be!");
        cL.logAMessage("");
    }
}
