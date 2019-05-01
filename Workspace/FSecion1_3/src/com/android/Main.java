package com.android;
/**
 * Exam objective 1.4 import other packages to make them accessible
 * @author noelf
 *
 */
/*
 * this imports all classes from the com.building.residential package
 */
import com.building.residential.*;
import com.exam.Test;

//import com.exam.Test3;
//import com.exam.Test2;
import com.building.*;
/*
 * this is importing the MultiStorey class from the com.building 
 * package, which then means we can use the short form to
 * create this multiStorey
 */
import com.building.MultiStorey;
//import com.building.commercial.MultiStorey;
/*
 * this has imported only the statics of this class, IT DOES NOT
 * import any non statics. So we can't, instance create a Test3
 * object as any constructor in the class is not static
 */
import static com.exam.Test3.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * this is creating a multistory from the com.buidling package
		 * we have imported all of the classes from this package
		 * with the import com.building statement.
		 * 
		 */
		MultiStorey multi1=new MultiStorey();
		/*
		 * can't import two classes of the one name from different
		 * packages, so you import one of the classes and use the
		 * long form when creating an object of the other class
		 */
		com.building.commercial.MultiStorey longMulti=
				new com.building.commercial.MultiStorey();
		
	//	System.out.println(Test.statNum);
	//	System.out.println(statNum);
	//	Test myTest=new Test();
		/*
		 * this is calling all the static members of the Test class
		 * in a static way (which is recommened). call a static member
		 * by the name of the class followed by the name of the member
		 */
		System.out.println(Test.score);//this is a static variable
		System.out.println(Test.statStr);//this is a static variable
		Test.statMethod();
		/*
		 * creating a Test object to access non static variables and
		 * non static methods 
		 */
		Test myTest=new Test();
		System.out.println(myTest.num);//this is a non static variable
		System.out.println(myTest.myString);//this is a non static variable
		myTest.testMethod();//this is a non static method
		/*
		 * this is accessing a static method in a non static way, which
		 * is NOT recommended
		 */
		//myTest.statMethod();
		/*
		 * we do not need to import a class to call a static method from
		 * a different package. all we have to do is use the fully
		 * qualified name for the method. so test2StatMethod is a 
		 * Static method in the Test2 class, which is contained in
		 * the com.exam package
		 */
		//a full qualified name to access the public static method
		com.exam.Test2.test2StatMethod();
		//a full qualified name to create a Test2 object
		com.exam.Test2 myTest2=new com.exam.Test2();
		myTest2.test2StatMethod();//this is a static method
		/*
		 * accessing the static members of Test3 class, we only 
		 * imported the statics of this class so we can only access
		 * the static members of this class
		 * if you only have a static import for a class that means
		 * you can only access the static variables and methods
		 * of that class. You also can only access them in the 
		 * shortened form
		 * i.e
		 * you cannot go Test3.test3Statmethod()
		 * you have to go
		 * test3StatMethod()
		 */
		System.out.println(statInt3);
		test3StatMethod();
		System.out.println(statAge);
		/*
		 * we only have a static import for Test3, so no non statics
		 * are imported. Also we can't access statics by the class
		 * name followed by the static variable or method name
		 */
		//Test3.test3StatMethod();//with static can't access statics this way
		//Test3 myTest3;//can't create a member of the Test3 class
		//can't access any non static members of the Test3 class
		/*
		if you have only a static import statement for Test3 that means
		you cannot use the below syntax to access a static member of 
		the Test3 class. you can only use this is you do a import of the
		rest of the non static members. uncomment the line
		import com.exam.Test3;
		and this line of code will compile
		 */
		//Test3.test3StatMethod();//not compile if only a static import
		/*
		 * Cannot create  Test3 object if we only have a static import
		 */
	//	Test3 myTest3=new Test3();
		
		
		

	}

}
