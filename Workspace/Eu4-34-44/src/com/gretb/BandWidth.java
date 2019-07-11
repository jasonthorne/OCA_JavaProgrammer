package com.gretb;

public class BandWidth {
	public int available = 0;
	public int getAvailable(){
		return available;
		}
	
	public BandWidth(int quota){
		this.available = quota;
		}
	public void addMore(int more){
		available += more;
		}

}
