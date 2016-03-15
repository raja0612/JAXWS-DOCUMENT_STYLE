package com.jaxws.soap;

import javax.jws.WebService;

/**
 * Service Implementation defined in DOCUMENT style.
 * @author RAJASHEKHAR
 *
 */
@WebService(endpointInterface="com.jaxws.soap.BasicCalculator")
public class BasicCaluculatorImpl implements BasicCalculator {
	@Override
	public int add(int a, int b) {
		return a+b;
		
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		return a/b;
	}

}
