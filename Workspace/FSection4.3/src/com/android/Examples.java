package com.android;

import java.util.concurrent.SynchronousQueue;

public class Examples {
	
	static void ex1() {
		/*
		 * this creates an array of ints of size 4, if we are
		 * creating an array this way, the size ALWAYS goes on the
		 * right hand side
		 */
		int [] myArray=new int[4];
		//this is also correct
		int myArray2[]=new int[5];
		/*
		 * arrays are given default values 
		 * in an array of numbers the number will be 0 or in case
		 * of floating point numbers 0.0
		 * boolean will be false
		 * char will be a blank character ''//no spaces
		 * objects will be null
		 */
		System.out.println(myArray[1]);
		/*
		 * this is how we assign values to an array already created
		 * array numbering starts at 0
		 */
		myArray[0]=56;
		myArray[2]=1000;
		/*
		 * once the size of the array has been set, it cannot be 
		 * changed. If you attempt to place more numbers than are 
		 * allowed in the array, we get arrayIndexOutOfBoundsException
		 */
		/*give ArrayIndexOutOfBoundsException
		 * there are only 4 postions in our array, we we can't assign
		 * something to the fifth positon as we are trying to do here,
		 * as fifth position does not exist
		 */
		//myArray[4]=77;
		
		System.out.println(myArray[2]);
		//trying to access a index position that does not exist
		//ArrayIndexOutOfBoundsException
	///	System.out.println(myArray[4]);
		
		//this array is given a length of 2
		double dArray[]=new double[] {45.67,89.77};
		//this array is given a length of 3
		double[]dArray2= {6.99,99.123,4.5};
		/*
		 * length gets us the amount of numbers in each array
		 */
		System.out.println(dArray.length);//2 
		System.out.println(dArray2.length);//3 
		/*
		 * this will always give ArrayIndexOutOfBoundsException
		 * as dArray, only has two numbers in it, and dAarray.length
		 * is 2, so this read
		 * dArray[2], this is out of bounds for this array as numbers
		 * only goes dArray[0],dArray[1]
		 */
		//System.out.println(dArray[dArray.length]);
		/*
		 * this will always get the last number in our array, no
		 * matter what the size of the this will always print out
		 * the last number
		 */
		System.out.println(dArray[dArray.length-1]);
		/*
		 * an array is an object, so we can assign one array to 
		 * another
		 * copyArray and dArray are not the same object with the
		 * same values
		 */
		double[]copyArray=dArray;
		//check if same object, they are so this will return true
		System.out.println(copyArray==dArray);//true as same object
		/*
		 * you can add an int to an array of of doubles
		 */
		dArray[0]=4;
		//myArray is an array of ints
		/*
		 * you can't assign an array of ints to a array of doubles
		 * reference
		 */
		//dArray=myArray;//will not compile
		//myArray=dArray;//will not compile
		/*
		 * this is just changing one item in our array, the first
		 * item in our array
		 */
		dArray2[0]=12.34;
		/*
		 * this is assigning a new array of doubles of length
		 * 4 to the dArray2
		 */
		dArray2=new double[] {23.45,78.99,99.56,123.67};
		/*
		 * you can also change all the values in array by assigning
		 * our array to an existing array
		 */
		dArray2=dArray;
		/*
		 * this syntax will not work and this is only available when
		 * you are creating an array
		 */
		//dArray2= {56.78,99.82,100.34,34.99};
		dArray2=new double[] {23.45,78.99,99.56,123.67};
		System.out.println(dArray2[0]);
		System.out.println(dArray2[1]);
		System.out.println(dArray2[2]);
		System.out.println(dArray2[3]);
		System.out.println("using a loop to print out array");
		/*
		 * usually use a for loop to print out an array, as for
		 * loop gives you more control
		 * make sure you have i<dArray2.length and NOT
		 * I<=dArray2.length as this will generate an
		 * ArrayIndexOutOfBoundsException
		 */
		for(int i=0;i<dArray2.length;i++) {
			System.out.println("loop "+dArray2[i]);
		}
		/*
		 * you can use a for loop to populate or change the items
		 * in an Array
		 * this changes the existing values in this array by
		 * doubling each value
		 */
		for(int i=0;i<dArray2.length;i++) {
			dArray2[i]=dArray2[i]*2;
			System.out.println("second loop "+dArray2[i]);
		}
		
		System.out.println("using enhanced for loop");
		/*
		 * an enhanced for loop is explicitly arrays and arraylists
		 * specifically for VIEWING values in arrays and arraylist.
		 * however YOU CANNOT CHANGE values in an array using a
		 * enhanced for loop
		 */
		for(double dnum:dArray2) {
			System.out.println("enhanced loop "+dnum);
		}
		
		String[]names= {"noel","patsy","nora"};
		for(String name:names) {
			System.out.println("name is "+name);
		}
		/*
		 * can't assign or change values directly in an array by
		 * using an enhanced for loop
		 */
		dArray=new double[] {3.4,5.6,7.8};
		for(double d:dArray) {
			System.out.println(d);
			/*
			 * this does not change the values in the array, this 
			 * only changes the LOCAL value d, which has no effect
			 */
			d=45.6;
			System.out.println("local only "+d);
		}
		/*
		 * you can't change or initialise a array directly with
		 * an enhanced for loop
		 * however you can do it indirectly, as we have done here
		 * we are adding 2 onto each number in this array
		 */
		int counter=0;
		for(double d:dArray) {
			System.out.println(d);
			d=d+1;
			dArray[counter]=d+1;
			counter++;	
		}
		//two  has been added to each number in our array
		for(double d:dArray) {
			System.out.println(d);
		}
		/*
		 * populating an array with 7 numbers
		 */
		int[]numArray=new int[7];
		int count=numArray.length;
		for(int i=0;i<count;i++) {
			numArray[i]=i+2;
		}
		
		for(int num:numArray) {
			System.out.println("num is "+num);
		}	
	}//end of ex1
	
	static void ex2() {
		System.out.println("multi dimensional arrays");
		//4 rows, 2 columns
		int twoDarray[][]=new int[4][2];
		int twoDarray2[][]=new int[3][3];
		double[]doubleD[]=new double[3][4];
		double[][]doubleD2=new double[5][2];
		String[][]names={
			/*
			 * each row(array) needs to have it's own set of 
			 * curly brackets, as each row is an array and each
			 * array has to be seperated by commas
			 */
			{"noel","mick","kevin"},//row/array 0
			{"patricia","connie","kate"},//row/array 1
			{"michelle","laura","colm"}//row/array 2
			};
		
		System.out.println(names[0][0]);//noel
		System.out.println(names[1][1]);//connie
		System.out.println(names[2][2]);//colm
		/*
		 * both of these give ArrayIndexOutOfBoundsException
		 */
		//System.out.println(names[1][3]);
		//System.out.println(names[3][1]);
		/*
		 * to display all elements of a two dimensional array we 
		 * need to create a inner/nested loop.
		 * the outer loop takes care of the rows, and will looop
		 * 3 times, the inner loop takes care of the columsn and will
		 * loop 3 times
		 */
		//int num=names[0].length;
		for(int i=0;i<names.length;i++) {
			System.out.println("rows "+i);
			for(int j=0;j<names[i].length;j++) {
				System.out.println("name is "+names[i][j]+" i "+i+" j "+ j);
			}
		}
		/*
		 * assigning a value directly into a two dimensional array
		 */
		names[0][1]="terry";
		System.out.println(names[0][1]);
		
		int[][]int2d=new int[4][3];
		//populates our two dimensional array
				for(int i=0;i<int2d.length;i++){
					for(int j=0;j<int2d[i].length;j++){
						int2d[i][j]=i+j;
						}
					}	
				//print out our two dimensional array of ints
				for(int i=0;i<int2d.length;i++){
					System.out.println("row "+i);
					for(int j=0;j<int2d[i].length;j++){
						System.out.println("number is "+int2d[i][j]);
						}
					}
				System.out.println("prints out the first number in every row/array");
				for(int i=0;i<int2d.length;i++) {
					System.out.println(int2d[i][0]);
				}
				
				
			/*	
				int[][]asArray= {
						{45,67,3},
						{3},
						{4,20}
				};
				for(int i=0;i<asArray.length;i++) {
					System.out.println("row "+i);
					for(int j=0;j<asArray[i].length;j++) {
						System.out.println("asymetric "+asArray[i][j]);
					}
				}*/
		
	}
	
	static void ex3() {
		System.out.println("Three Dimensional Array");
		/*
		 * this is an array of 3 two dimesional arrays
		 * and each of those has 4 one dimesional arrays
		 * and each of those has 2 ints
		 */
		int[][][]threeD=new int[3][4][2];
		for(int i=0;i<threeD.length;i++) {
			for(int j=0;j<threeD[i].length;j++) {
				for(int k=0;k<threeD[i][j].length;k++) {
					threeD[i][j][k]=i+j+k;
				}//end of inner most loop
			}//end of inner loop
		}//end of for loop
		
		for(int i=0;i<threeD.length;i++) {
			System.out.println("3d "+i);
			for(int j=0;j<threeD[i].length;j++) {
				System.out.println("2d "+j);
				for(int k=0;k<threeD[i][j].length;k++) {
					System.out.println(k);
					System.out.println("num is "+threeD[i][j][k]);
				}//end of k loop
			}//end of j loop
		}//end of i loop
		
		/*
		 * we are going to populate and create a three dimensional 
		 * array which will be [2][3][3], which is 
		 * two 2 dimensional arrays
		 * each of which are three one dimensional array
		 * and each of which has three numbers
		 */
		int[][][]threeD2=// 
				{//first square bracket and we put in here 
			//our first two dimensional array
						{
							/*
							 * inside each two dimesional array
							 * we have 3 one dimensional array
							 */
							{23,45,67},//first array/row
							{3,567,890},//second array/row
							{69,99,100}//third array/row
							
						},//end of first two dimensional array
						//our second two dimensional array
						{
							/*
							 * our three one dimensional arrays
							 * inside the second two dimensional 
							 * array
							 */
							{99,991,1000},
							{45,88,9345},
							{567,321,96543}
							
						}
		};//end of threeD2 array
		
		int[]numArray= {3,5,88};
		int []numArray2= {33,44,88};
		int []numArray3= {66,77,99};
		/*
		 * two dimesional array of length [3][3]
		 * we are using three existing one dimensional arrays to
		 * create a two d array
		 */
		int[][]twoDMakeup= {
				numArray,
				numArray2,
				numArray3
		};
		/*
		 * three dimensional array of length [2][3][3]
		 * we are using the existing two dimesional array to create
		 * a three dimensional array as we insert the array TWICE
		 * into this two dimensional array
		 */
		int[][][]threeDMakeup= {
				twoDMakeup,
				twoDMakeup
		};
		
		/*
		 * Asymetric Multidimensional Array
		 */
		int[][]numbers= {
				{34,56,78},
				{12,45,99}
		
		};
		/*
		 * Asymetric means we have different amounts of numbers on
		 * each line
		 * this is the only way we can create an Asymetric array
		 * we can have a 3,4,5, etc asymetric array
		 */
		System.out.println("asymetric array");
		int[][]asNum= {
				{45,67,89},
				{45},
				{34,67},
				{56,99,100,33},
				{44,999,888}
		};
		
		for(int i=0;i<asNum.length;i++) {
			System.out.println("length of row is "+asNum[i].length);
			for(int j=0;j<asNum[i].length;j++) {
				System.out.println(asNum[i][j]);
			}
		}
		System.out.println("second row "+asNum[0][2]);
		
	}//end of ex3
	
	static void ex4() {
		/*
		 * if no values are initialised in our array a default
		 * value is given to each element in the array
		 * defaults for numeric types are 0 or 0.0 for floats and
		 * doubles
		 * for booleans its false
		 * for chars its a space
		 * for objects it is null
		 */
		int[]numbers=new int[5];
		double[]dnumbers=new double[5];
		boolean[]booleans=new boolean[5];
		char[]characters=new char[5];
		String[]strings=new String[5];
		
		for(int i=0;i<5;i++) {
			System.out.println(numbers[i]);
			System.out.println(dnumbers[i]);
			System.out.println(booleans[i]);
			//a blank character is a space character
			System.out.println("word"+characters[i]+"word");
			System.out.println(strings[i]);	
		}
		
		Dog[]dogList=new Dog[2];
		/*
		 * have not populated this array of dogs and dogs are 
		 * objects, so each entry here will be given the default
		 * for objects which is null
		 */
		for(Dog d:dogList) {
			//will print out "dog is null" twice
			System.out.println("dog is "+d);
		}
		dogList[0]=new Dog(2,"spot");
		dogList[1]=new Dog(3,"rex");
		for(Dog d:dogList) {
			/*
			 * this will print out the address of each Dog
			 * because we have no toString method defined in the
			 * Dog class, so it takes it's toString method from the
			 * object class, which just prints out the address
			 * of the object
			 * com.android.Dog@7852e922
			 * com.android.Dog@4e25154f
			 */
			System.out.println("dog is "+d);
		}
		
		House house1=new House(12.34,45.6,"Galway");
		House house2=new House(67.1,56.9,"Dublin");
		House house3=new House(12.34,13.67,"Limerick");
		House house4=new House(123.12,45.67,"Cork");
		/*
		 * the House class has a toString method, that means
		 * whenever a house is in a print statement, the toString()
		 * method of the House class will be used, which will print
		 * all the details of the house
		 */
		House[]estate= {house1,house2,house3,house4};
		for(House h:estate)
		{
			System.out.println(h);
		}
		/*
		 * if you are creating and initialising an array over two
		 * lines of code you have to use the new keyword as below
		 */
		int[]intArray;
	//	intArray= {45,67};
		intArray=new int[] {56,89,99};
		/*
		 * this is assigning an existing array to a new array
		 */
		int[]newArray=intArray;
		/*
		 * this means that newArray and intArray are the 
		 * same object, this will print true
		 */
		System.out.println(newArray==intArray);
		
		
	}//end of ex4
	
	static void ex5(){
		Cat[]catList=new Cat[3];
		Cat tibbles=new Cat(2,"tibbles");
		Cat tomCat=new Cat(3,"tomCat");
		Cat fluffles=new Cat(4,"fluffles");
		//adding three cats to existing array
		catList[0]=tibbles;
		catList[1]=tomCat;
		catList[2]=fluffles;
		/*
		 * using our three cats to create a new array of length
		 * 3
		 */
		Cat catList2[]= {tibbles,tomCat,fluffles};
		
		System.out.println("name of first cat is");
		/*
		 * we are accessing the same object through two different
		 * references. one is the array reference, it is the first
		 * cat in our array. the other is its own  Cat reference
		 */
		System.out.println(catList[0].name);
		System.out.println(tibbles.name);
		
		catList[0].eat();//first cat in list eating
		tibbles.eat();//same cat
		catList[1].eat();//second cat in list eating
		tomCat.eat();//same cat
		catList[2].eat();//third cat in list eating
		fluffles.eat();
		/*
		 * using a for loop to iterate through each cat and call
		 * the eat and drink method for each cat
		 */
		System.out.println("looping cats");
		for(int i=0;i<catList.length;i++) {
			System.out.println("name of cat is "+catList[i].name);
			catList[i].eat();
			catList[i].drink();
			/*
			 * we have no toString method in the Cat class, so it 
			 * takes its toString method from the Object class and
			 * that just prints out the address of the object
			 */
			System.out.println(catList[i]);
		}
		/*
		 * you can use an enhanced for loop to get each one of the
		 * cats to call each of they're drink() and eat() method
		 */
		System.out.println("enhanced for loop cats");
		for(Cat c:catList) {
			c.eat();
			c.drink();
			System.out.println("name of cat is "+c.name);
			System.out.println(c);
		}
		
	}//end of ex5
	
	static void ex6() {
	
		
		Hippo henry=new Hippo();
		Monkey monty=new Monkey();
		Bird betty=new Bird();
		
		henry.eat();//eat method from Animal class
		henry.drink();//overrides abstract drink method from animal class
		henry.swim();//own swim method
		
		monty.eat();//eat method from Animal class
		monty.drink();//overrides abstract drink method from animal class
		monty.climb();//own swim method
		
		betty.eat();//overrides eat method from Animal class
		betty.drink();//overrides abstract drink method from animal class
		betty.fly();//own swim method	
		/*
		 * you can have an reference that is a abstract class or
		 * interface
		 */
		Animal andy;
		/*
		 * however you CANNOT CREATE a object of a abstract class
		 */
		//new Animal();//will not compile
		/*
		 * you can however have a superclass abstract class reference
		 * to a sub class object
		 */
		Animal hipAnimal=new Hippo();
		Animal birdAnimal=new Bird();
		Animal monkAnimal=new Monkey();
		/*
		 * this object only has access to methods and variables 
		 * first defined in the  Animal class. if any of the 
		 * methods are overriden in the Hippo class, it will use
		 * the overriden methods
		 */
		/*
		 * drink() is an abstract method in the Animal class so 
		 * hippo class HAS TO OVERRIDE IT
		 */
		hipAnimal.drink();
		hipAnimal.eat();//takes from Animal class
		hipAnimal.sleep();//takes from Hippo class
		System.out.println("age of hippo "+hipAnimal.age);
		/*
		 * has no access to swim() because swim() is only first defined
		 * in the Hippo class, not in the Animal class
		 */
		//hipAnimal.swim();
		/*
		 * has no access to the swimSpeed variable as this was first
		 * defined in the Hippo class
		 */
		//System.out.println(hipAnimal.swimSpeed);
		Ford myFord=new Ford();
		myFord.drive();
		myFord.move();
		/*
		 * Vehicle is superclass of Car and Car is a superclass of
		 * Ford, which means that Vehicle is a superclass of Ford
		 * only have access to methods first defined inside 
		 * vehicle class
		 */
		Vehicle vCar=new Ford();
		/*
		 * this object can only call methods first defined in the 
		 * vehicle class.
		 * move() was first defined in the Vehicle class, so it can
		 * call move(). the ford object first looks in its own class
		 * for a overriden move() method, there is none, so it next
		 * checks it's direct superclass Car. The Car class does have
		 * a move method, so this prints out 
		 * "car moves by driving"
		 */
		vCar.move();
		/*
		 * can't call drive method as drive method was first defined in
		 * the Car class
		 */
		//vCar.drive();
		Vehicle vBoat=new Boat();
		vBoat.move();
		Vehicle vCar2=new Car();
		vCar2.move();
		/*
		 * when you have a array of superclass objects, this array
		 * can take a superclass object and any sub class of the
		 * super class object
		 * in this case Vehicle is super class of Boat, Car,Bike
		 * Ford so this array can take all of these types
		 */
		Vehicle[]vehicleList=new Vehicle[5];
		Boat boaty=new Boat();
		Car carey=new Car();
		Bike bikey=new Bike();
		Vehicle vinny=new Vehicle();
		Ford fordy=new Ford();
		//populate our array with different vehicles
		vehicleList[0]=boaty;
		vehicleList[1]=carey;
		vehicleList[2]=bikey;
		vehicleList[3]=vinny;
		vehicleList[4]=fordy;
		System.out.println("all our vehicles");
		for(Vehicle v:vehicleList) {
			/*
			 * each vehicle (except fords) has a move method, so 
			 * each different type of vehicle will implement this
			 * method in a different way
			 */
			v.move();
		}
		/*
		 * this is an array of four game characters, that each have
		 * they're own fight() method which overrides the 
		 * fight() method in the GameCharacter class.
		 * These objects in this array ONLY have acces to a
		 * fight() method, as fighting is something that is 
		 * commong across all game characters. 
		 * we do not have direct access to fire(), doMagic() or
		 * shoot() because of two reasons
		 * first reason because these methods were not first defined
		 * in the GameCharacter class
		 * second reason all those methods are private to Dragon,
		 * Wizard and Soldier
		 */
		GameCharacter[]myGame= {new Wizard(),new Dragon(),
				new Soldier(),new Wizard(), new GameCharacter()
		};
		System.out.println("All fighting");
		
		for(GameCharacter g:myGame) {
			g.fight();
		}
		for(int i=0;i<myGame.length;i++) {
			myGame[i].fight();
		}
		/*
		 * the only way we can access each one of the GameCharacters
		 * in the myGame array, is through the array
		 */
		myGame[0].fight();
		/*
		 * this is assigning the first character in the array, 
		 * which is a wizard to the variable wizChar. so this 
		 * wizard now has two references, one through the array
		 * and one through it's own reference
		 */
		GameCharacter wizChar=myGame[0];
		/*
		 * you can have a reference to an abstract class
		 * Animal is a abstract class
		 */
		Animal myAnimal;
		/*
		 * you can't have a abstract object (can't use the new 
		 * keyword with an abstract class
		 */
		//myAnimal=new Animal();
		/*
		 * this can only be populated with sub classes of Animal
		 * because Animal is an abstract class
		 */
		Animal[]animalList= {monty,betty,henry};
		/*
		 * this is a array of type Animal, this is valid and will
		 * compile, even though Animal is an abstract class.
		 * this is NOT creating 4 animals, as you can't as Animal
		 * is an abstract class. its creating an array of four
		 * null objects (it's basically reserving space for four 
		 * sub classes of Animal)
		 * this array can still ONLY TAKE sub classes of Animal, 
		 * which are Bird, Hippo and Monkey
		 * 
		 */
		Animal[]listAnimal=new Animal[4];
		//this will print null
		/*
		 * each position in the array is given a null
		 * value by default
		 */
		System.out.println(listAnimal[0]);//will print null
		/*
		 * this will not compile as this a null object and this is 
		 * trying
		 * to call the eat()  method
		 * null.eat();
		 * will give nullPointerException()
		 */
		//listAnimal[0].eat();
		
		Bike myBike=new Bike();
		Vehicle myVehicle=new Vehicle();
		myBike.move();
		myVehicle.move();
		System.out.println("age of bike is "+myBike.age);
		System.out.println("age of vehicle is "+myVehicle.age);
		/*
		 * super class reference to a sub class reference
		 */
		System.out.println("Vehicle reference to Bike object");
		/*
		 * if you have a superclass reference to a sub class object
		 * and your both overriden methods and SHADOWED variables
		 * (shadowed variables are variables of the same name in sub
		 * and super classes that are given default values, i.e
		 * age in Vehicle is 5 and 12 in Bike.
		 * The object takes it's method implmentation from the Sub
		 * class (bike) and it variable value (age) from the 
		 * super class (age is 5)
		 */
		Vehicle vBike=new Bike();
		//calls move() method from Bike class
		vBike.move();
		//gets age variable from Vehicle class
		System.out.println("what is age is this bike "+vBike.age);//5
		
	}//end of ex6
	
	static void ex7() {
		/*
		 * you can't create an interface object, because an interface
		 * is a purely abstract class
		 * however you can have a interface reference to an object that
		 * belongs to a class that implements that interface
		 * The Person class implements Behaviour, so that means
		 * that the variable behavePerson can only access methods 
		 * first defined in the Behaviour interface
		 */
		//Behaviour behave=new Behaviour();
		Behaviour behavePerson=new Person();
		Behaviour behaveFire=new Fireman();
		Behaviour behaveEmp=new Employee();
		
		Person pete=new Person();
		System.out.println(pete.age+pete.name);//Person class
		pete.drink();//Person class
		pete.eat();//Person class
		pete.mad();//Behaviour interface
		pete.sad();//Behaviour interface
		pete.happy();//Behaviour interface
		//will not compile as this object has no access to these variables
		//System.out.println(behavePerson.age+behavePerson.name);
		//behavePerson.eat();//in person class not compile
		//behavePerson.drink();
		behavePerson.mad();
		behavePerson.sad();
		behavePerson.happy();
		/*
		 * this is an array of Behaviour type and it takes objects
		 * that implement the Behaviour interface, which are 
		 * Firmen, Employee, Person
		 */
		Behaviour[]behaves=new Behaviour[3];
		Person percy=new Person();
		Employee etna=new Employee();
		Fireman sam=new Fireman();
		Dog spot=new Dog(3,"spot");
		/*
		 * all these objects belong to classes that implement the
		 * behaviour interface, so they can be put into an array of
		 * type Behaviour interface
		 * so this array can only take Person,Employee or Fireman
		 * objects
		 */
		behaves[0]=percy;
		behaves[1]=etna;
		behaves[2]=sam;
		/*
		 * Dog does not implement Behaviour so can't add this to 
		 * the array of type Behaviour reference
		 */
	//	behaves[0]=spot;
		/*
		 * only methods that are defined in the Behaviour interface
		 * are available to all these items in the array
		 * each person, employee and fireman has a happy(), sad()
		 * and mad() method, and this is all these objects have
		 * access too
		 */
		System.out.println("printing out behaviour array");
		for(int i=0;i<behaves.length;i++) {
			behaves[i].happy();
			behaves[i].sad();
			behaves[i].mad();
		}
		
		for(Behaviour b:behaves) {
			b.happy();
			b.sad();
			b.mad();
		}
	}//end of ex7
	
	static void ex8() {
		Dog spot=new Dog(2, "spot");
		Dog rex=new Dog(3,"rex");
		Dog lassie=new Dog(4,"lassie");
		/*
		 * if you  have three dogs in an array and then you change
		 * one of the original dogs to a different dog, you can
		 * still access the original dog in the array. So you will
		 * have four different dogs you can access two of which you
		 * can access through they're own references (rex,lassie)
		 * and through they're array positions (dogList[1] and 
		 * dogList[2}). one dog we can only access through it's array
		 * position (dogList[0]) and one dog we can only access through
		 * the reference "spot".
		 * if have three dogs in an array and three seperate references
		 * to each dog, if you change the atribute of one of the dogs
		 * the change will be seen in both the array and it's own reference
		 * i.e spot.age was originally 5, we change it to 6
		 * now spot.age is 6 and also dogList[0].age is 6 because they
		 * are both the SAME DOG
		 */
		Dog[]dogList= {spot,rex,lassie};
		System.out.println("id of first dog is "+dogList[0].id);
		System.out.println("name of first dog is "+dogList[0].name);
		System.out.println("id of spot is "+spot.id);
		System.out.println("name of spot is "+spot.name);
		spot.name="benji";
		System.out.println("name of spot is now "+spot.name);
		System.out.println("id of of spot is still "+spot.id);
		System.out.println("name of first dog is now "+dogList[0].name);
		System.out.println("still same dog is first is "+dogList[0].id);
		spot=new Dog(5,"lady");
		System.out.println("id of first dog in array is "+dogList[0].id);
		System.out.println("id of spot is now "+spot.id);
		
		
		
	}//end of ex8
	
	static void ex9() {
		Object obj=new Object();
		System.out.println(obj.toString());
		System.out.println(new Dog(2,"spot"));
		/*
		 * when we have an array of type Object, this means that
		 * this array can take ANY OBJECT EVERY CREATED, as object
		 * is the superclass of all other classes that will ever 
		 * be created in Java.
		 * However these objects are very limited, as they can only
		 * call methods first defined in the object class, of which
		 * there are only 9 (i.e toString(), equals(), hashCode(),
		 * etc)
		 */
		Object[]objArray= {new Hippo(),new Car(),new Dog(1,"rex"),
				"hello there",new Integer(1), new int[4]};
		}
	}

