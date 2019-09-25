
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
