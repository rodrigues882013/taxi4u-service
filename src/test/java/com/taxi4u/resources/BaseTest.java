package com.taxi4u.resources;

import com.taxi4u.App;
import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;


public abstract class BaseTest {
    protected HttpServer server;
    protected WebTarget target;

    @Before
    public void setUp() throws Exception {
        // start the server
        server = App.startServer();
        // create the client
        Client c = ClientBuilder.newClient();

        // uncomment the following line if you want to enable
        // support for JSON in the client (you also have to uncomment
        // dependency on jersey-media-json module in pom.xml and App.startServer())
        // --
        // c.configuration().enable(new org.glassfish.jersey.media.json.JsonJaxbFeature());

        target = c.target(App.BASE_URI);
    }

    @After
    public void tearDown() throws Exception {
        server.stop();
    }
}
