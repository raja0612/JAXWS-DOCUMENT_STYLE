package com.jaxws.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.jaxws.soap.BasicCalculator;

/** JAX-WS client for BasicCalculator.
 * @author RAJASHEKHAR
 *
 */
public class CalculatorClient {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:9080/ws/calculator?wsdl");
        QName qname = new QName("http://soap.jaxws.com/", "BasicCaluculatorImplService");
 
        Service service = Service.create(url, qname);
 
        BasicCalculator calc = service.getPort(BasicCalculator.class);
         
        System.out.println("Addition is...."+calc.add(1, 2));
        System.out.println("Subtraction is...."+calc.sub(2, 2));
        System.out.println("Multiplication is...."+calc.mul(1, 2));
        System.out.println("Division is...."+calc.div(4, 2));
 
         

	}

}
