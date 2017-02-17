package com.hcl.test;
import com.hcl.service.RestService;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Test;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

public class Tester extends JerseyTest{
	@Override
    public Application configure() {
        enable(TestProperties.LOG_TRAFFIC);
        enable(TestProperties.DUMP_ENTITY);
        return new ResourceConfig(RestService.class);
    }
	
	
	
	@Test
    public void testGetCustDetails() {
		try{
        Response output = target("/access/cust").request().get();
       assertEquals("200", 200, output.getStatus());
        assertNotNull("Should return list", output.getEntity());
		}catch(Exception e){
			e.printStackTrace();
			
		}
    }

    @Test
    public void testGetOrderList(){
		try{
        Response output = target("/access/order").request().get();
        assertEquals("200", 200, output.getStatus());
       assertNotNull("Should return list", output.getEntity());
	   }catch(Exception e){
			e.printStackTrace();
			
		}
    }

}
