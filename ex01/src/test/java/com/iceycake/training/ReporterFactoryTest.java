package com.iceycake.training;

import org.junit.Assert;

public class ReporterFactoryTest {

    private ReporterFactory reporterFactory;

    @org.junit.Before
    public void setUp() throws Exception {
        reporterFactory = new ReporterFactory();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testGetReporterByName() throws Exception {
        Reporter reporter = reporterFactory.getReporter("csvReporter");

        Assert.assertNotNull(reporter);
    }

    @org.junit.Test
    public void testGetReporterByType() throws Exception {

    }
}