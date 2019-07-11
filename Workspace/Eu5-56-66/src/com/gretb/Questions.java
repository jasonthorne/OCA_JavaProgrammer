package com.gretb;

public class Questions {
	static void q56(){
		/*
		 * 1 2 4 5 is the answer
		 * this is a two dimensional array
		 * first row has three elements
		 * and two elements in second row
		 */
		int[][] ab = { {1, 2, 3}, {4, 5} };
		for(int i=0; i<ab.length; i++){
			for(int j=0; j<ab[i].length; j++){
				System.out.print(ab[i][j]+" ");
				/*
				 *2 is already printed out
				 *when this check is carried
				 *out, so it breaks out of 
				 *the INNER loop, the number
				 *3 is skipped
				 */
				if(ab[i][j] == 2){
					break;
					}
				}
			continue;
			}
	}
	
	static void q57(){
		/*
		 * an array of 4 strings is an array
		 * of 4 objects, if we do not give
		 * a value to each element of the 
		 * array then each value will be
		 * null. in this example dataArra[0]
		 * is not given any explicit value
		 * so it will take the default 
		 * value of null
		 */
		String[] dataArr = new String[4];
		dataArr[1] = "Bill"; 
		dataArr[2] = "Steve"; 
		dataArr[3] = "Larry";
		/*
		 * so this prints out null,
		 * Bill,Steve,Larry
		 */
		try{ 
			for(String data : dataArr){
				System.out.print(data+" ");
				//data.charAt(1);
				} 
			}catch(Exception e){ 
				System.out.println(e.getClass());
				}
		
		Object[]myObjArray=new Object[4];
		myObjArray[0]=4;
		myObjArray[1]=new int[]{2,4,5};
	}
	
	static void q58(){
		String myNum="123";
		int num=Integer.parseInt(myNum);
		/*
		 parseBoolean()returns a PRIMITIVE boolean.
		 with parseBoolean() case is ignored but 
		 spaces ARE NOT
		 so this is false
		 */
		Boolean.parseBoolean(" true ");
		/*
		 * this returns a PRIMITIVE boolean and 
		 * NOT A WRAPPER BOOLEAN
		 */
		Boolean.parseBoolean("true");
		/*
		 * returns true wrapper object
		 */
		Boolean.valueOf(true);
		/*
		 * returns true, case is ignored
		 */
		Boolean.valueOf("trUE");
		/*
		 * all wrapper classes have static final
		 * variables for instance
		 */
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Boolean.TRUE);	
	}
	
	static void q59(){
		/*
		 * have to have the same method signature
		 * and can be less restrictive but NOT 
		 * MORE
		 * see Animal class
		 */
	}
	
	static void q60(){
		/*
		 * variable from the reference
		 * method from object
		 * if you have same name reference
		 * and method in both classes
		 */
		Car c = new SportsCar();
		System.out.println( c.gearRatio+"  "
				+ ""+c.accelerate() );
	}
	
	static void q61(){
		/*
		 * an if()statement has to evaluate
		 * a boolean, if it does'nt then it
		 * WILL NOT compile
		 */
	}
	
	static void q62(){
		/*
		 * you can't use any floating point number
		 * in a switch statement
		 * also if you use only variables
		 * that use only whole numbers,
		 * (byte, short, int) in a calculation 
		 * by default the product will be 
		 * promoted to int(unless there is 
		 * a long present then you your 
		 * product will be promoted to long)
		 */
		byte bnum=2;
		//short snum=bnum+bnum;
		//this is an int
		//byte bnum2=3*bnum;
		//have to cast it
		byte bnum3=(byte)(3*bnum);
		//or assign it to int
		int sum=3*bnum;
		long lnum=4;
		/*
		 * the sum is promoted to the
		 * largest data type present
		 * which is a long
		 * you can cast it, but the
		 * results can be unpredictable
		 */
		//sum=lnum+2;
		long lsum=lnum+2;
		/*
		 * literal values will work as
		 * long as they are in the 
		 * correct range, if not
		 * you have to cast them
		 */
		byte bsum=3*5;
		byte bsum2=(byte) (3*10*20);
	}
	
	static void q63(){
		/*
		 *underscores are ignored
		 *by the compiler
		 *but can't be at start
		 *or end of a value or
		 *directly before or
		 *after a decimal point
		 */
		int x = 1____3;//1          
		long y = 1_3;//2          
		float z = 3.234_567f;//3          
		System.out.println(x+" "+y+" "+z);
		/*
		 * can't have a underscore before
		 * or after the 0x or before or
		 * after the f
		 */
		int hex = 0xCAFE_BABE; 
		float f = 9898_7878.333_333f; 
		int bin = 0b1111_0000_1100_1100;	
	}
	
	static void q64(){
		System.out.println(Boolean.parseBoolean("true"));
		/*
		 * any text other than "true"(case not matter),
		 * will produce the boolean value "false".
		 * there is a constructor in the Boolean
		 * wrapper class that takes a string
		 */
		System.out.println(new Boolean("muck"));
		/*
		 * constructors of the Boolean wrapper
		 * can take a null and a boolean value
		 */
		System.out.println(new Boolean(null));
		System.out.println(new Boolean(false));
		/*
		 * there is no constructor in the boolean
		 * wrapper class that takes no arguments
		 */
		//System.out.println(new Boolean());
		//case does not matter
		System.out.println(new Boolean("trUE"));	
	}
	
	static void q65(){
		String fullPhoneNumber="999-111-2222";
		String shortPhone=new StringBuilder(fullPhoneNumber)
				.substring(0, 8)+"xxxx";
		System.out.println(shortPhone);
		shortPhone=new StringBuilder(fullPhoneNumber)
				.replace(8, 12, "xxxx").toString();
		System.out.println(shortPhone);
		
		//will produce indexOutOfBoundsException
	//	shortPhone=new StringBuilder(fullPhoneNumber)
				/*
				 * this is trying to append
				 * ot our shortPhone string from
				 * positions 8 to 12 in the 
				 * string "xxxx"
				 */
	//			.append("xxxx", 8, 12).toString();
		/*
		 * this appends to XXXX
		 */
		shortPhone=new StringBuilder("xxxx")
				.append(fullPhoneNumber, 0, 8).toString();
		System.out.println(shortPhone);
		shortPhone=new StringBuilder("xxxx")
				.insert(0, fullPhoneNumber, 0, 8).toString();
		System.out.println(shortPhone);	
	}
	
	

}
