package com.gretb;

public class Main {

	public static void main(String[] args) {
		
		//+++++++++++++++++++++++++++++++++++++++++
		//Question 1:
		
		int bottles = 10;
		String bottleString = "";
		//String sentence1 = Integer.toString(bottles) + " green bottles standing on the wall";
		String sentence1 = "";
		String sentence2 = "and if one green bottle should accidently fall,\nthere'll be ";
		String sentence3 = " no ";
		
		
		
		while(bottles > 0) {
			
			
			if (bottles != 1) {
				
				sentence1 = " green bottles standing on the wall,";
			}else {
				sentence1 = " green bottle standing on the wall,";
			}
			
			System.out.println("\n");
			
		
			System.out.println(bottles + sentence1);
			System.out.println(bottles + sentence1);
			bottles--;
			System.out.println(sentence2 + bottles + sentence1);
			
		}
		
		
		
		
		
		
		
		
		

		//farmer object for question 3:
		////Farmer farmer = new Farmer("Bob" , 56, "Male");
		
	
	}
	
	

}



