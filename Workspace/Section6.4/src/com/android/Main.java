package com.android;

public class Main {
	
	/**
	 * 
	 * Determine when casting is necessary.
	 * Casting is changing the reference of a compatible object.
	 */

	public static void main(String[] args) {
		
		
		//PRIMITIVE CASTING: 
		
		byte bnum = 3;
		
		int num=bnum;
		
		//You can cast here, but DONT HAVE TO, because a byte csan fit inside an int.
		num=(int)bnum;
		
		int number = 689999;
		byte newB = (byte)number;
		
		System.out.println(newB);
		
		double dnum = 0.999999;
		number = (int)dnum;
		
		System.out.println(number);
		
		char myChar = (char)number;
		
		//cant cast a boolean to be anythin else.
		boolean myBool = true;
		
		//---------------------------------------------
		
		/*
		 * You cant cast incompatible data types. 
		 * There has to be some form of inheritence or implementation relationship.
		 * Dogs and Cats have no relationship so cant be cast to eachother.
		 */
		
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++
		
		//EXCEPTIONS:
		
		/*
		try {
			
		}
		catch() {
			
		}
		finally {
			
		}
		*/
		

	}

}
