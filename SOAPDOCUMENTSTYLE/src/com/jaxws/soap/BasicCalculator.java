package com.jaxws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

/** Service Interface defined in DOCUMENT style.
 * @author RAJASHEKHAR
 *
 */
@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
public interface BasicCalculator {
	
	@WebMethod
	public int add(int a , int b);
	@WebMethod
	public int sub(int a , int b);
	@WebMethod
	public int mul(int a , int b);
	@WebMethod
	public int div(int a , int b);

}
