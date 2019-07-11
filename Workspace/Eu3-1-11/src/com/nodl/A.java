package com.nodl;

public class A {
	int max(int x, int y)  
	{ 
		if (x>y) 
			return x; 
		else 
			return y; 
		}
}
class B extends A{
	  int max(int x, int y)  {  
		  return 2 * super.max(x, y) ; }
	}
	class C extends B{
	  int max(int x, int y)  { 
		  return super.max( 2*x, 2*y);}
	}

