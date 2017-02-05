package com.taxi4u.resources;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DriverTest extends BaseTest{

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testGet() {
        String responseMsg = super.target.path("drivers").request().get(String.class);
        assertEquals("List All Drivers", responseMsg);
    }
}
