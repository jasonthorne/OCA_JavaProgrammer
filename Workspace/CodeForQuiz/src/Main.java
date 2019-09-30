import java.time.LocalDate;

public class Main {

	
		
	/*
	 Q 440

	public class Test{
		public static final int MIN = 1;
		
		public static void main(String [] args){
			int x = args.length;
			if(checkLimit (x)){ //line n1
				System.out.println("Java SE");
			}else {
				System.out.println("Java EE");
			}
		}
		
		public static boolean checkLimit (int x) {
			return (x >= MIN) ? true : false;
		}
	}
	 
	 */
	
	
	/*
	 
	 
	 Q 444
	 
	 public static void main (String [] args){
	 	String myStr = "Hello World";
	 	myStr.trim();
	 	int i1 = myStr.indexOf("");
	 	System.out.println(il);
	 }
	
	 */
	
	
	
	 /*
	 //Q 445
	
	public static void main (String [] args) {
		int [] stack = {10,20,30};
		int size = 3;
		int idx = 0;
		//line n1 
		System.out.println("The top element: " + stack[idx]);
	}
	 
	 do{
	 	idx++;
	 }while (idx >=size);
	 
	 while (idx < size){
		 idx++;
	 }
	 
	 do{
	 	idx++;
	 }while (idx <size -1);
	 
	 do{
	 	idx++;
	 }while (idx <=size);
	 
	 while (idx <= size-1){
		 idx++
	 }
	 */
	 
	
	/*
	 
	//Q 448
	
	public class App{
		static int count;
		public static void displayMsg() {
			count++; //line n1
			System.out.println("Welcome" + "Visist Count: " + count); //line n2
		}
		public static void main (String[] args) {
			App.displayMsg(); //line n3
			App.displayMsg(); //line n4
		}
	}
	
	*/
	
	/*
	
	//Q 449
	
	public static void main (String[] args) {
		System.out.println("Result A" + 0 + 1);
		System.out.println("Result B" + (1) + (2));
	}
		
	*/

	
	/*
	
	//Q 450
	
	class Test{
		public static void main (String[] args) {
			int numbers [] = {12, 13, 42, 32, 15, 156, 23, 51, 12};
			int max = findMax(numbers);
		}
		
		//line n1 {
			int max = 0;
			// code goes here
			return max;
		}
	}

	*/
	
	
	/*
	
	//Q 451`
	
	class A {
		public void test() {
			System.out.println("A");
		}
	}
	
	class B extends A{
		public void test() {
			System.out.println("B");
		}
	}
	
	public class C extends A{
		public void test() {
			System.out.println("C");
		}
		
		
		public static void main (String[] args) {
			A b1 = new A ();
			A b2 = new C ();
			b1 = (A) b2;
			A b3 = (B) b2; //line n1
			A b3 = (B) b2; //line n2
			b1.test ();
			b3.test ();
		}
	}
	
	*/
	
	
	/*
	
	//Q 455
	
	
	class Animal {
		String type = "Canine";
		int maxSpeed = 60;
		
		Animal(){}
		
		Animal (String type, int maxSpeed){
			this.type = type;
			this.maxSpeed = maxSpeed;
			
		}
	}
	
	class WildAnimal extends Animal{
		String bounds;
		
		WildAnimal (String bounds){
			//line n1
		}
		
		WildAnimal (String type, int maxSpeed){
			//line n2
		}
	}
	
	
	WildAnimal wolf = new WildAnimal ("Long");
	WildAnimal tiger = new WildAnimal ("Feline", 80, "Short");
	System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds);
	System.out.println(tiger.type + " " + tiger.maxSpeed + " " + tiger.bounds);
	
	*/
	
	/*
	//Q 461
	
	public static void main (String[] args) {
		try {
			int num = 10;
			int div = 0;
			int ans = num/div;
		} catch (ArithmeticException ae) {
			ans = 0; //line n1
		} catch (Exception e) {
			System.out.println("Invalid calculation");
		}
		System.out.println("Answer = " + ans); //line n2
	}
	*/
	
	/*
	int n [][] = {{1,3}, {2,3}};
	for (int i = n.length-1;I >=0; i--) {
		for(int y: n[i]) {
			System.out.print(y);
		}
	}
	*/

	
	/*
	//Q 467
	
	public static void main (String[] args) {
		int iVar = 100;
		float fVar = 100.100f;
		double dVar = 123;
		iVar = fVar;
		fVar = iVar;
		dVar = fVar;
		fVar = dVar;
		dVar = iVar;
		iVar = dVar;
	}
	
	*/
	
	/*
	//Q 472
	
	public class CheckingAccount {
		public int amount;
		public CheckingAccount(int amount) {
			this.amount = amount;
		}
		public int getAmount() {
			return amount;
		}
		public void changeAmount(int x) {
			amount += x;
		}
	}
	
	public static void main(String [] args) {
		CheckingAccount acct = new CheckingAccount((int)(Math.random(0*1000)));
		//line n1
		System.out.println(acct.getAmount());
	}
	*/
	
	/*
	//Q487
	
	public class Test {
		public static void main(String[] args) {
			int x = 1;
			int y = 0;
			if(x++ > ++y) {
				System.out.println("Hello ");
			}else {
				System.out.println("Welcome ");
			}
			System.out.println("Log " + x + ":" + y);
		}
	}
	*/
	
	/*
	//Q488
	
	public class MyFile
	{
		public static void main(String[] args)
		{
			String arg1 = args[1];
			String arg2 = args[2];
			String arg3 = args[3];
			System.out.println("Arg is " + arg3);
			
		}
	}
	
	*/
	
	/*
	//Q489
	
	public static void main (String[] args) {
		int[] arr = {1, 2, 3, 4};
		int i = 0;
		do {
			System.out.println(arr[i] + " ");
			i++;
		}while (i < arr.length -1);
	}
	*/
	
	/*
	//Q490
	
	public class Test{
		public static void main(String[] args) {
			if (args[0].equals("Hello") ? false : true) {
				System.out.println("Success");
			}else {
				System.out.println("Failure");
			}
		}
	}
	*/
	
	/*
	//Q491
	
	A. 
	public class Boat{
		public static void main (String[] args) {
			System.out.println("I float.");
		}
	}
	
	B. 
	public class Boat{
		public static void main (String[] args) {
			System.out.println("Chocolate.");
		}
	}
	
	C. 
	public class Boat{
		public static void main (String[] args) {
			System.out.println("Squirrel.");
		}
	}
	
	D. 
	public class Boat{
		public static void main (String[] args) {
			System.out.println("Earn Interest.");
		}
	}
	*/
	
	/*
	//Q493
	
	package clothing;
	public class Shirt{
		public static String getColor() {
			return "Green";
		}
	}
	
	package clothing.pants;
	//line n1
	public class Jeans{
		public void matchShirt() {
			//line n2
			if(color.equals("Green")) {
				System.out.println("Fit");
			}
		}
		public static void main (String[] args) {
			Jeans trouser = new Jeans();
			trouser.matchShirt();
		}
	}
	
	*/
	
	/*
	//Q494
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2012, 01, 32);
		date.plusDays(10);
		System.out.println(date);
	}*/
	
	
	
	/*
	//Q495
	
	class Test{
		int a1;
		
		public static void doProduct(int a) {
			a = a*a;
		}
		
		public static void doString(StringBuilder s) {
			s.append(" " + s);
		}
		
		public static void main (String[] args) {
			Test item = new Test();
			item.a1 = 11;
			StringBuilder sb = new StringBuilder("Hello");
			Integer i = 10;
			doProduct(i);
			doString(sb);
			doProduct(item.a1);
			System.out.println(i + " " + sb + " " + item.a1);
			
		}
		
		
	}
	*/
	
	/*
	public static void main(String [] args){
	String[][] chs = new String[2][];
	  chs[0] = new String[2];
	  chs[1] = new String[5];
	  int i = 97;
	  
	  for (int a = 0; a < chs.length(); a++){
		  for(int b = 0; b < chs.length(); b++){
			  chs[a][b] = ""+i;
			  i++;
		  }
	  }
	  for (String[] ca : chs){
		  for (String c : ca){
			  System.out.println(c + "");
		  }
		  System.out.println();
	  }
	}
	*/

}
