package com.hcl.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Order")
public class Order{
	
	
	private int orderId;
	
	private String orderName;
	
	public Order(int orderId,String orderName){
		this.orderId = orderId;
		this.orderName = orderName;
		
	}
	
	public void setOrderId(int orderId){
		this.orderId = orderId;
		
	}
	@XmlElement(name="orderid")
	public int getOrderId(){
		return orderId;
		
	}
	
	public void setOrderName(String orderName){
		this.orderName = orderName;
		
	}
	@XmlElement(name="ordername")
	public String getOrderName(){
		return orderName;
		
	}
	
}
