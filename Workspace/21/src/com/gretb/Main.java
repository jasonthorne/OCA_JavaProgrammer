package com.gretb;
/**
 * overloaded constructors
 * @author noelf
 *
 */
public class Main {

	public static void main(String[] args) {
		//these are the variables we will use to create our dog with the 
		//different constructors
		int age=3;
		String name="spot";
		double weight=6.78;
		/*
		 * this is going to use the constructor in the Dog class that takes
		 * no variables
		 */
		Dog dog1=new Dog();
		//dog1.age=45;
		/*
		 * this is going to use the constructor in the Dog class that takes
		 * an int, a string and a double
		 */
		Dog dog2=new Dog(age,name,weight);
		//changing name of dog
		name="rex";
		/*
		 * this is going to use the constructor in the Dog class that takes 
		 * a String, a int and a double
		 */
		Dog dog3=new Dog(name,3,2.34);
		/*
		 * this is going to use the constructor in the Dog class that takes just
		 * an int
		 */
		Dog dog4=new Dog(age);
		//this is the cat owned by pat
		Cat tibbles=new Cat(3,"tibbles",12.5);
		//these are the dogs owend by pat
		Dog[]dogArray= {dog1,dog2,dog3,dog4};
		//
		int pAge=45;//age of person pat
		String pName="pat";//name of person pat
		double pWeight=123;//weight of person pat
		double pHeight=6.4;//height of person pat
		Person patrica=new Person(34,"Patricia");//partner of person pat
		/*
		 * int age,String name,double weight,double height,boolean sex,Cat myCat,
			Dog[]dogArray,Person partner){
		 */
		
		Person pat=new Person(pAge,pName,pWeight,pHeight,false,tibbles,
				dogArray,patrica);
		/*
		 * calls the printPerson() method from the Person class
		 */
		pat.printPerson();
		
		
		
		
		
		
		
		
		
		

	}

}
