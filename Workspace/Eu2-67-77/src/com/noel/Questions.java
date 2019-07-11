package com.noel;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Questions {
	
	static void q67(){
		/*
		 * look at main you can use
		 * this notation as well for string[]args
		 */
	}
	
	static void q68(){
		Paper[] papers = {
				new Paper("T1", 1),
				new Paper("T2", 2),
				new Paper("T3",3)
				};
		/*
		 * no toString()method in the Papers class
		 * so it takes the Object class toString()
		 * method which just prints out memory
		 * location
		 */
		System.out.println(papers);//array has no toString()
		System.out.println(papers[1]);
		System.out.println(papers[1].id);
		
		Dog[]kennel={new Dog("lassie",4),
				new Dog("spot",3)};
		/*
		 * the Dog class does have its own
		 * toString() method so that
		 * will be called when we put a Dog 
		 * in a print statement
		 */
		System.out.println(kennel);//array has no toString()
		System.out.println(kennel[1]);
	}
	
	static void q69(){
		/*
		 * only has access to methods or variables
		 * first defined in the Flyer interface
		 */
		Flyer f = new Eagle("American Bald Eagle");
		/*
		 * no name variables in the Flyer interface
		 * so will not compile
		 */
		//System.out.println(f.name);
		/*
		 * getName is first defined in the Flyer 
		 * interface so it has access to this method.
		 * Eagle has no getName() method but it's 
		 * superclass Bird does, so it takes its
		 * getName()method implementation from the
		 * Bird class
		 */
		System.out.println(f.getName());
		/*
		 * casting f to be of type Eagle and 
		 * Eagle does have a name variable
		 * as Bird has a name variable and
		 * Eagle extends Bird
		 */
		System.out.println(((Eagle)f).name);
		/*
		 * casting the object to be of type bird
		 * which you can do as Eagle is a bird.
		 * the bird class does have a getName()
		 * method
		 */
		System.out.println(((Bird)f).getName());
		/*
		 * name is NOT a static variable and this
		 * is for accessing a static variable
		 * (class name+method name)
		 */
		//System.out.println(Eagle.name);	
	}
	
	static void q70(){
		Animal andy=new Animal();
		Animal angela=new Animal();
		//will return false
		System.out.println(andy.equals(angela));
		
		Sheep flossie=new Sheep("flossie");
		Sheep flossie2=new Sheep("flossie");
		/*
		 * will return true as the equals()*
		 * is overriden
		 */
		System.out.println(flossie.equals(flossie2));
		/*
		 * hashcode can be overriden so 
		 * we can never say it will ALWAYS 
		 * be true of false, just like equals
		 */
		/*will always be false as checking if
		 * they are the same object
		 * 
		 */
		System.out.println(flossie==flossie2);
		/*
		 * can't say what this will return as
		 * it all depends on how class is 
		 * implemented
		 */
		System.out.println(flossie.equals(flossie2));	
	}
	
	static void q71(){
		/**
		 * come back to this one
		 */
		float f=Float.NaN;
		System.out.println(f);
		
		System.out.println(ExceptionTest.returnEx());
	}
	
	static void q72(){
		/*
		 * sets our stringbuilder object to be 
		 * an initial size of 100
		 */
		StringBuilder sb = new StringBuilder(100);
		
		sb=new StringBuilder("hello there nice to meet");
		//no such method()
		//sb = StringBuilder.getInstance(100);
		//no setCapactiy()method in the StringBuilder
		//class
		
		//ensures the size is at least 100
		sb.ensureCapacity(100);
	}
	
	static void q73(){
		int a = 5, b = 7, k = 0;
		Integer m = null;
		//autoboxing occurs
		k = new Integer(a) + new Integer(b);//1         
		k = new Integer(a) + b; //2         
		k = a + new Integer(b); //3         
		m = new Integer(a) + new Integer(b); //4
	}
	
	static void q74(){
		LocalDateTime dt = LocalDateTime.parse
				("2015-01-02T17:13:50");
		/*
		 * valid formatter 
		 */
		dt.format(java.time.format.DateTimeFormatter
				.ISO_DATE_TIME);
		/*
		 * so also is this a valid formatter
		 */
		dt.format(java.time.format.DateTimeFormatter
				.ISO_LOCAL_DATE_TIME);
		/*
		 * just printing it out gives it in 
		 * IS0 8601 format
		 */
		System.out.println(dt);
		System.out.println(dt.toString());
	}
	
	static void q75(){
		//only creates a reference
		Dog spot;
		//this creates a new Dog object
		spot=new Dog("spot",3);
	}
	
	static void q76(){
		A a = new A();//1
		A b = new B();//2
		/*
		 * this is a A reference to a B object and both
		 * have a variable i in they're classes. So
		 * the variable's value is taken from the Superclass.
		 * However the variable i is private in the A class so
		 * this object has no access to the variable i
		 */
		//System.out.println(b.i);
		/*
		 * this will compile as there is a f()method in the
		 * A class
		 */
		b.f();
		/*
		 * if we go
		 */
		B newB=new B();
		/*
		 * this is accessing the i variable in the B class
		 */
		System.out.println(newB.i);	
	}
	
	static void q77(){
		ArrayList<Data> al = new ArrayList<Data>();
		/*
		 * I1 inteface is in the Data file and contains
		 * our abstract process()method, which takes
		 * two ints
		 */
		al.add(new Data(1));al.add(new Data(2));al.add(new Data(3));
		/*
		 * this is creating a lambda
		 * we are calling the method processList(), that
		 * takes a arraylist of data objects, and
		 * a lambda that implements the Process method
		 * in the I1 interface.
		 * this lamdba takes two numbers and mutiiples them
		 */
		new Questions().processList(al, (int a, int b)
				->System.out.println(a*b));
		/*
		 * this lambda takes two numbers and mulitpiles
		 * and displays them
		 */
		new Questions().processList(al, (a, b)
				->System.out.println(a*b));
		/*
		 * does the same as the previous
		 */
		new Questions().processList(al, (a, b) 
				->{
					System.out.println(a*b); 
					});
	}
	/*
	 * this method takes a arrayList of Data objects
	 * and a lambda that implemetns the process method
	 * in the I1 interface
	 */
	public void processList(ArrayList<Data> dataList, I1 p){
		/*
		 * goes through each object in the arrayList
		 * each object contains a single number,
		 * this multiplies each number by itself.
		 * our list has the numbers 1,2 and 3
		 * so it's 1*1=1
		 * 2*2=4
		 * 3*3=9
		 */
		for(Data d:dataList){
			//value is the int in each Data object
			p.process(d.value, d.value);
			}
		}
}
