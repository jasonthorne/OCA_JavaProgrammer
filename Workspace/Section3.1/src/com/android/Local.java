package com.android;

public class Local {

	//Instance variables (attributes). Always longer than a local variable or a method parameter. 
	//name and address below are available ANYWHERE in the class.
	//Access modifiers DONT effect the scope of a variable. name is private and is still available throughout the local class. ++++++++++++
	
	private String name="Mary"; //available the full length of the class
	protected String address="Galway";
	
	//WHERE you declare an attribute doesn't matter. It is still available throughout the CLASS. 
	
	//Class variables (static variables) belong to a class NOT to an individual instance of the class. So aLL objects share this var and it's value.
	static int courseId=333;
	
	/*
	 * The method param 'int num' below can only be as long as the method 'accessLocal'
	 */
	void accessLocal(int num) {
		//the number sent to the method is now doubled
		num=num*2;
		
		//A local variable is a variable that is declared inside curly brackets 
		//Below are local variables that are available FROM THIS POINT onwards ONLY within this method. (FORWARD REFERENCING is not avaliable for local vars) +++++++++++
		//There is a line of code BEFORE we declare these variables. that means that num is LONGER than dNum and doubleNumber
		double dNum=24, doubleNumber=4.5; 
		
		
		//We can acess any attributes of the local class in this method.
		
	}
	
}
