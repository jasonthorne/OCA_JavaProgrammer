package com.noel;

class CorbaComponent{
    String ior;
    CorbaComponent(){
    	/*
    	 * if creating a sub class object
    	 * the startUp from the sub class
    	 * OrderManager will be called
    	 */
    	startUp("IOR"); 
    	}
    void startUp(String s){
    	ior  =  s;
    	}
    void print(){
    	System.out.println(ior);
    	}
}

class OrderManager extends CorbaComponent{
   OrderManager(){  }
   void startUp(String s){
	   ior = getIORFromURL(s);
	   }
   String getIORFromURL(String s){
	   return "URL://"+s;
	   }
}
