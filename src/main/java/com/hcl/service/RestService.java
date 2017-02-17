package com.hcl.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.hcl.model.Customer;
import com.hcl.model.Order;

@Path("/access")
public class RestService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/cust")
	public Response getCustDetails(){
		List<Customer> customers = new ArrayList<>();
		
		Customer cust1 = new Customer(1, "Einstein");
		Customer cust2 = new Customer(2, "Edison");
		Customer cust3 = new  Customer(3, "Ramanujan");
		
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		
		Gson gson = new Gson();
		String customers2 = gson.toJson(customers);
		return Response.ok(customers2).build();	
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/order")
	public Response getOrderList(){
		
		List<Order> orders = new ArrayList<>();
		Order ord1 = new Order(111, "Laptop accessories");
		Order ord2 = new Order(222, "Mobile accessories");
		Order ord3 = new Order(333, "Wireless Bluetooth");
		
		orders.add(ord1);
		orders.add(ord2);
		orders.add(ord3);
		
		Gson gson = new Gson();
		String orders2 = gson.toJson(orders);
		
		return Response.ok(orders2).build();	
	}
}
