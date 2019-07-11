package com.noel;

public class Game {
	public void play() throws Exception   
	{
	    System.out.println("Playing...");
	  }
}

class Soccer extends Game {
	   public void play(String ball)    {
	      System.out.println("Playing Soccer with "
	      		+ ""+ball);      
	   }
	}
