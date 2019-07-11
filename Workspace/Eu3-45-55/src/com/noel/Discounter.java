package com.noel;

public class Discounter {
	/*
	 * percent is given the default value
	 * of 1
	 */
	static double percent=1; //1     
	int offset = 10, base= 50; //2
	public static double calc(double value) {
		/*
		 * these are local variables and not 
		 * given any value
		 * and they have to be given a 
		 * DEFINATE value
		 */
		int coupon; //3 	
		Discounter dis=new Discounter();
		//coupon is given a DEFINATE value
		coupon=dis.offset;
		System.out.println(coupon);
	//	System.out.println(offset);
		
		/*
		 * this does not definately give
		 * a value to coupon, offset and
		 * base. as if percent is greater
		 * than 10 then no value will be
		 * given to our local variables
		 * coupon, offset and base
		 */
		int offset;
		int base;
		//System.out.println(base);
		if(percent <10){ //4             
			coupon = 15;
			offset = 20;
			base = 10;
			}
		//return coupon;
		/*
		 * the error only occurs if we try to access
		 * values of the references in some way
		 */
	//	return coupon*offset*base*value/100; //5
		return 0.0;
		}
	}


