package com.android;

/**
 * The final keyword - If a class is final. you CANT inherit from a class. DOESNT MEAN EVERYTHING ELSE IN THE CLASS IS FINAL.
 * If a method is final, you CANT override the method in a derived class.
 * If a variable is final, you CANT change the value of a variable once the variable has been given a value.
 * If a variable is final, java will not allow any circumstance where a final variable will not be given a value.
 */
 

public final class Person {
	
	String name; //name of person is not final, so CAN change.
	final int age = 24; //final, so CANT change once given a value. So every Person created will have an age of 34. 
	final double weight; //Gives error, as you cant create a Person without making sure ALL of your final variables are given a value. 
	
	//You cant create a Person without using this constructor, so this will always assign a value to the final double weight.
	Person(double weight){
		this.weight = weight;
	}

}

//Gives error, as you CANT extend a final class:
/*
class European extends Person{
	
}
*/

class European{
	
	//final method:
	final void talk() {
		System.out.println("European talking");
	}
}


class Irish extends European{
	
	//Cant be overridden as talk is a final method
	/*
	void talk() {
		
	}
	*/
	
	//OVERLOADED method, so can be done (as it's a completely new method):
	void talk(int num) {
		
		//Local variables can be final;
		final int finalInt=78; //only has scope to this method
		//finalInt = 78; //cant be changed as it's final.
	}
	
	
}



