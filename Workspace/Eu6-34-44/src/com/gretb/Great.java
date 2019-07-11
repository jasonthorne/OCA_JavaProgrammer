package com.gretb;

import java.io.FileNotFoundException;
import java.io.IOException;

class Great {
    public void doStuff() 
    		throws FileNotFoundException{
    }    
}
/*
 * this will not compile as both FileNotFoundException
 * and IOException are both checked exceptions
 * and when your overriding method also throws
 * a checked exception, it CANNOT be a superclass
 * of the original method. IOException is in this
 * class is a super class of FileNotFoundException
 * in the base class
 */
class Amazing extends Great { 
	
/*  public void doStuff() throws IOException, IllegalArgumentException{
  } */   
}
