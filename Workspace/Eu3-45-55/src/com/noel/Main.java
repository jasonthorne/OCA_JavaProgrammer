package com.noel;

public class Main {

	public static void main(String[] args) {
	//	Questions.q45();
		
		//for question 47
		 boolean hasParams = 	 
				 (args == null ? 
						 false : true);
		 /* if nothing is passed
				  * into main then print out
				  * "has params".
				  * args is the array into
				  * which we pass string aruguments
				  * from the command prompt
				  * but args is NEVER null
				  * if we don't pass in any
				  * strings the array length
				  * is set to 0
				  */
	        if(hasParams){
	            System.out.println("has params");
	        }
	        /*
	         * this will always print out regardless
	         * of whether hasParams is true or
	         * false as this is just a block of
	         * code that follows the if statement
	         */
	        {
	            System.out.println("no params");
	        }
	        
	       // Questions.q51();
	        Questions.q53();
	        
	        

	}
	
	

}
