package com.noel;

class A{
	   public void m1() {   }
	}
	class B extends A{
	   public void m1() {   }
	}
	class C extends B{
		/*
		 * the ONLY way you can access
		 * the A class m1()method is
		 * to create a object of the 
		 * A class
		 */
		A myA=new A();
	   public void m1(){
		   myA.m1();
		   /*
		    * B is a super class of C so
		    * you can access the m1()method
		    * from that class by
		    */
		   super.m1();
		   
	   }
	   /*
	    * both of these call the m1 method
	    * from the C class as this is the 
	    * class we are currently inside
	    */
	   {
		   m1();
		   this.m1();
	   }
	   
	}
