package com.noel;

public class Super { 
	static String ID = "QBANK"; 
	}

class Sub extends Super{
   static { 
	   System.out.print("In Sub"); 
   }
}

class Statics{
	static{
		System.out.println("statics 1 called");
	}
	static{
		System.out.println("statics 2 called");
	}
	
	static int statNum=4;
	Statics(){
		System.out.println("statics constructor");
	}
}
