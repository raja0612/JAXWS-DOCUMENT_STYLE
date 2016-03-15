package com.jaxws.endpoint;

import javax.xml.ws.Endpoint;

import com.jaxws.soap.BasicCaluculatorImpl;

/** 
 * Endpoint publisher for Basic Calculator.
 * @author RAJASHEKHAR
 *
 */
public class BasicCalculatorPublisher {
	public static void main(String[] args) {
		   Endpoint.publish("http://localhost:9080/ws/calculator", new BasicCaluculatorImpl());
 }
}
