package com.android;
/**
 * Exam objective 7.5 Use abstract classes and Interfaces
 * Exam objective 6.2 apply the static keyword to methods and Fields
 * @author noelf
 *open classes in this order
 *Main
 *Animal
 *Behaviour
 *Ape
 *Flamingo
 *Insect
 *Trainee
 *Person
 *Exam objective 1.5 Compare and contract the features and components of 
 *java such as Platform independence, object orientation, encapsulation
 *etc
 *now open 
 *InterfaceOne
 *building
 */
public class Main {

	public static void main(String[] args) {
		Dog spot=new Dog();
		/*
		 * takes the happy() method from the Dog class. AS the Dog 
		 * overrides the Abstract happy() method in the Animal class
		 * A concrete class HAS TO override a abstract method from it's 
		 * base class
		 */
		spot.happy();
		/*
		 * this takes the sad() method from the Dog class. As the Dog 
		 * class overrides the concrete sad() method in the Animal class.
		 * you can choose to whether to override a concrete method from
		 * the base/super class or not
		 */
		spot.sad();
		/*
		 * mad() is a concrete method in the abstract Animal class. It is
		 * NOT OVERRIDEN in the Dog class, so this mad() method is taken
		 * directly form the Animal class. The Dog class COULD override
		 * this method, but it choose not too.
		 */
		spot.mad();
		
		RattleSnake ronnie=new RattleSnake();
		/*
		 * Slither was a abstract method in the Snake class, so Rattlesnake
		 * overrides slither and produces "rattlesnake slithering"
		 */
		ronnie.Slither();
		/*
		 * happy was a abstract method in the Animal class, so Rattlesnake
		 * overrides happy and produces "rattlesnake happy"
		 */
		ronnie.happy();
		/*
		 * bite was a abstract method in the Reptile class, and was overriden
		 * in the sub class snake, which produces "snake biting". Snake is
		 * a superclass of rattlesnake so it will use this bite() method as
		 * its own
		 */
		ronnie.bite();
		/*
		 * these are all concrete methods in the Abstract Animal class
		 * and we did not override them in any of the classes in the Chain
		 */
		ronnie.mad();
		ronnie.sad();
		
		Ape andy=new Ape();
		/*
		 * these four methods were abstract methods in the Behaviour, and
		 * the Ape class implemented those methods, so Ape has to override
		 * all of these four methods
		 */
		andy.jealous();
		andy.joy();
		andy.anger(2.34, 'a');
		andy.euphoria();
		/*
		 * Ape implements the Behaviour interface, the behaviour interface
		 * has a default method called nervous. This method is fully formed
		 * and has a body. It is NOT overriden in the Ape class, but we could
		 * if we want too.
		 * it takes the default implementation of this method from the 
		 * Behaviour interface
		 */
		andy.nervous();
		
		Flamingo freddy=new Flamingo();
		
		freddy.joy();
		/*
		 * the Flamingo class implements Behaviour, and we choose to 
		 * OVERRIDE the default nervous method in the Flamingo class. we
		 * don't have too, but we choose too
		 */
		freddy.nervous();
		/*
		 * you cannot access a static method of an interface, in a non
		 * static way
		 * you can't access it through a individual flamingo
		 * or an individual ape
		 */
	//	freddy.statMethod();//wll not compile
		/*
		 * you can only access a static method, in a interface in a 
		 * static way. that means 
		 * interface name.method name
		 */
		Behaviour.statMethod();
		
	//	Flamingo.flock();
		//in an ordinary class you can access statics in a non static way
	//	freddy.flock();
		/*
		 * when accessing a static member we do not need to create a
		 * instance of the class to access it. i.e we do not need to 
		 * create a trainee to access the static variables courseCode, 
		 * courseAddress or the static method statMethod()
		 * the below is calling statics in a static way, which is the 
		 * class name.static method name
		 * this is the recommened way to call statics
		 */
		System.out.println("accessing courseCode statically "+Trainee.courseCode);
		System.out.println("accessing courseAddress statically "+Trainee.courseAddress);
		Trainee.statMethod();
		
		Trainee tom=new Trainee();
		Trainee tania=new Trainee();
		/*
		 * course code for tom and tania is the same for both, as courseCode
		 * is a static variable which is a class variable and there is only
		 * ONE courseCode for the whole class
		 */
		System.out.println("tom's course code is "+tom.courseCode);
		System.out.println("tania's course code is "+tania.courseCode);
		//Trainee.courseCode=55555;
		/*
		 * so if one person changes the courseCode then it is changed 
		 * for everyone, this is accessing a static variable in a non
		 * static way
		 */
		tom.courseCode=22222;
		System.out.println("course code for everyone is now changed");
		System.out.println("course code now for tania "+tania.courseCode);
		/*
		 * null is an attempt, by java, to understand the concept of 
		 * nothing. so in effect we are saying this Trainee reference
		 * is nothing
		 * if you attempt to call a regular method with a null object
		 * you will get a 
		 * NULLPOINTEREXCEPTION - which is a runtime exception, the 
		 * compiler DOES NOT pick it up, so you won't see an error 
		 * until you run the code and it will crash your program
		 * if you attempt to access a instance variable of a null 
		 * object you will also get  NULLPOINTEREXCEPTION
		 */
		Trainee nullTrainee=null;
		//nullTrainee.ordMethod();//generates a nullpointer exception
	//	System.out.println(nullTrainee.age);//generates a nullpointer excpetion
	/*
	 * this is just a reference (just the NAME of a trainee) and you
	 * can't call a method or access variables of something that is 
	 * JUST a reference
	 * this generates a error, not an exception
	 */
		Trainee noTrainee;
	//	noTrainee.ordMethod();//can't call instance method
	//	System.out.println(noTrainee.age);//can't access instance variable
	//	noTrainee.statMethod();//can't access static method
		/*
		 * As already stated, you don't have to create a trainee to access
		 * a static method (it's recommened that you don't). So you CAN
		 * USE a null object to access a static variable
		 */
		nullTrainee.statMethod();
		
		
		Person percy=new Person(2.3);
		/*
		 * name is a non final variable which we can change
		 */
		percy.name="tom";
		percy.name="percy";
		/*
		 * both age and weight are final variables, so we cannot change
		 * these variables and attempt to do so, will generate a 
		 * compiler error
		 */
		//percy.age=56;//will not compile
		//percy.weight=56.78;//will not compile
		final int finalInt=789;
		//finalInt=999;//cannot change a final
		/*
		 * here we are creating a final object, this means that this
		 * trainee REFERENCE CANNOT be reassigned
		 */
		final Trainee thomas=new Trainee();
		/*
		 * when an object is final, you can't change what the object refers
		 * too (this trainee will always be thomas from galway). however
		 * we can change the atributes of thomas, so we change his age and
		 * his pps number
		 * a final objects atributes CAN BE changed, but what the object
		 * refers too, cannot
		 * THIS OBJECT WILL ALWAYS BE thomas, but his age and pps can
		 * change
		 */
		//thomas=new Trainee();//will compile
		
		thomas.age=120;
		thomas.pps="111111B";
		/*
		 * this shows abstraction where only certain atributes of an
		 * object are available
		 * here it is only the method first defined in the parent class
		 * Trainne will be available to the tGrad object
		 * as this is a super class reference to a sub class object
		 */
		Trainee tGrad=new Graduate();
		tGrad.ordMethod();
		/*
		 * only a graduate reference has access to study
		 */
		Graduate grad=new Graduate();
		grad.study();
		/*
		 * this is a object that has only access to methods first 
		 * defined in the Behaviour interface
		 */
		Behaviour beFlamingo=new Flamingo();
		/*
		 * only a flamingo reference has access to the fly() method
		 */
		//beFlamingo.fly();
	

	}

}


