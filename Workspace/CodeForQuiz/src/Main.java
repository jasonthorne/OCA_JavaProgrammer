
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
	
	
	
	
	
	
	
	
	
	

}
