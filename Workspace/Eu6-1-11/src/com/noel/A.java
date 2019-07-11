package com.noel;

class A {
    public int getCode(){ return 2;}
}
/*
 * when you are overriding methods and the
 * return types are primitive they must
 * match EXACTLY
 */
class AA extends A { 
	/*
	 * this is overriding the getCode
	 * method from the A class so it 
	 * HAS to return a int
	 */
 // public byte getCode(){ return 3;}
	
	public long retLong(){
		byte bnum=2;
		return bnum;
	}
}
