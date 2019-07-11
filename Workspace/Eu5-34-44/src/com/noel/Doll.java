package com.noel;

public class Doll {
	 String name;
	 //constructor
	    Doll(String nm){
	        this.name = nm;
	    }
}
class Barbie extends Doll{
	static int count=0;
/*	Barbie(){
		super();
	};*/
    Barbie(){
    //	this();
    	this("unknown");
    }
    Barbie(String nm){
    	super("unknown");
    }
}
