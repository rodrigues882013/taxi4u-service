package com.taxi4u.resources;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class UserTest extends BaseTest{

    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testGet() {
        String responseMsg = super.target.path("users").request().get(String.class);
        assertEquals("Got it!", responseMsg);
    }
}
