package com.gretb;

public class Main {

	public static void main(String[] args) {
		
		//+++++++++++++++++++++++++++++++++++++++++
		//Question 1:
	
		int bottles = 10;
		String sentence1 = "";
		String sentence2 = "and if one green bottle should accidently fall\nthere'll be ";
		String sentence3 = "";
		
		
		while(bottles > 0) {
			
			while (bottles > 1) {
				sentence1 = " green bottles standing on the wall";
				sentence3 = sentence1;
				
				System.out.println("\n");
				
				
				System.out.println(bottles + sentence1);
				System.out.println(bottles + sentence1);
				bottles--;
				
				if (bottles == 1) {
					sentence3 = " green bottle standing on the wall";
				}
				System.out.println(sentence2 + bottles + sentence3);
				
			} 
			
			
			System.out.println("\n");
			sentence3 = " green bottle standing on the wall";
			System.out.println(bottles + sentence3);
			System.out.println(bottles + sentence3);
			bottles--;
			System.out.println(sentence2 + bottles + sentence1);
			
		}
		
		
		System.out.println("\n");
		
		

		//farmer object for question 3:
		/////////Farmer farmer = new Farmer("Bob" , 56, true);
		
		
		//+++++++++++++++++++++++++++++++++++++++++
		//Question 2:
		
		
		int rowSize1 = 4, colSize1 = 6;
		
		for(int i=1;i<=rowSize1; i++) {
			
			for(int j=1;j<=colSize1;j++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		
		
		int rowSize2 = 4, colSize2 = 7;
		
		for(int i=0;i<=rowSize2; i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
	
	}
	
	

}



