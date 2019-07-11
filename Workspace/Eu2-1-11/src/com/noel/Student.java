package com.noel;

import java.util.ArrayList;

public class Student {
	private double average;
	ArrayList<Integer>scores=new ArrayList<>();
	
	Student(){
		System.out.println(scores);
		scores.add(56);
		scores.add(100);
		scores.add(78);
	}
	private void computeAverage(){
        int size=scores.size();
        double sum=0;
        for(Integer i:scores){
        	sum+=i;
        }
        //gets the average
        average =sum/size;//update average value
    }
	
	//public getters for the private variables
	public ArrayList<Integer> getScores()
	{ 
		//return scores;
		/*
		 * we return a new arraylist so we will
		 * not be able to change the original
		 * values in our arraylist
		 */
		return new ArrayList(scores);
		}
    
    public double getAverage()
    { 
    	return average; 
    	}
    
    public ArrayList<Integer> changeArray(){
    	scores.add(45);
    	scores.add(56);
    	scores.add(99);
    	
    		
    	return scores;
    }
    
    public void printArray(){
    	System.out.println(scores);
    }

}
