package com.noel;
class Game{
	/*
	 * if this method is called it needs
	 * to be put in a try/catch block
	 * or whatever is calling it has
	 * to have a throws clause in its
	 * method signature
	 */
	public void play() throws Exception{
	    System.out.println("Playing...");
	  }	
}
public class Soccer extends Game {
	public void play(){
	      System.out.println("Playing Soccer...");      
	   }
}
