package com.android;

public class Local {

	//Instance variables (attributes). Always longer than a local variable or a method parameter. 
	//name and address below are available ANYWHERE in the class.
	//Access modifiers DONT effect the scope of a variable. name is private and is still available throughout the local class. ++++++++++++
	
	private String name="Mary"; //available the full length of the class
	protected String address="Galway";
	int age = 20;
	
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
		System.out.println(name);
		System.out.println(dNum);
		
		
		//dNum is longer than dNum2. This line will not compile as FORAWRD REFERENCING to local vars isnt allowed
		//Cant access dNum2 before it's declared:
		//System.out.println(dNum2);
		double dNum2 = 5.5;
		
		
		Cat newCat = new Cat();
		if(age>19) {
			double weight=34.5; //local var, that is only scoped to the if statement.
			dNum2 = dNum2 * 2; //changes dNum2 outside of this if
			
			{
				int newInt; //Avaliable within it's brackets ONLY (as declared here)
			}
		}
	
		
		for(int i=0;i<4;i++) {
			/*
			 * The var i is only avaliable within the for loop brackets. 
			 */
			System.out.println("i is: " + i);
			
			/*
			 * When i is less than 2, do the following. 
			 */
			if(i<2) {
				int j = 4; //local var j which is only available within these if statement brackets 
				System.out.println("j is: " + j);
				System.out.println("i is: " + i);
			}
			//System.out.println("j is: " + j); //cant access j here
			
		}
		//System.out.println("i is: " + i);  //cant access i here

		
	}
	
	void accessMethod(int num, double dNum) {
		/*
		 * method params are accessible ONLY in the method that defines them. 
		 * The scope of the method parameter may be as long as that of a local var or longer, but it can NEVER be shorter.
		 */
		
		int localInt=23; //localInt has the same length as the method params num & dNum
		
		System.out.println(num + "" + "" + localInt);
		System.out.println(name);
	}
	
	
	//A non static method can acess both statics and non-statics ++++++++++++++++++++++++
	void accessNonStatic() {
		System.out.println(name); //non static
		System.out.println(courseId); //static
	}
	
	//A Static method can ONLY DIRECTLY ACCESS statics. So we cant access non static vars like name 7 age +++++++++++++++++++++++++
	static void accessStatic() {
		
		
		System.out.println(courseId);
		//The ONLY WAY to access non static vars in a static method is to create an object of the class and access the attributes through the object.
		Local myLocal = new Local();
		System.out.println(myLocal.name);
		System.out.println(myLocal.address);
	}
	
	
}
