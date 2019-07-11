package com.gretb;

public class Speak {
	/*
	 * the method up()does not
	 * exist in the speak class
	 */
}

class GoodSpeak extends Speak implements Tone{
	public void up(){
		System.out.println("UP UP UP");
		} 
	} 
interface Tone{
		void up(); 
		}
