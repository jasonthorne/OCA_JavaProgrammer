
public class Main {
	
	
public static void main (String[] args) {
		
	
	//Questions.q1();
	Questions.q2();
	
	
	
	System.out.println("number is: " + Questions.q3()); //exception is generated, returning 10
		
	
	//=============
	
	Dog spot = new Dog();
	System.out.println("spot initial age: " + spot.age);
	Questions.q7(spot);
	System.out.println("spot new age: " + spot.age);
	
	try {
		Questions.q8();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	}
	

}
