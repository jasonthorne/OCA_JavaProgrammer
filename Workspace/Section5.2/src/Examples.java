
public class Examples {
	
	static void ex1() {
		
		/*
		 *In a switch statement, and in the switch part of the statement, you can only use the following types:
		 *char
		 *byte
		 *int
		 *String
		 *Integer
		 *Short
		 *byte
		 *Character
		 *enum
		 */
		
		/*
		 * A switch statements begins with the keyword "switch" and some variable we are checking a value for
		 * below, we are checking for the value of the variable "marks"
		 */
		
		int marks = 10;
		
		
		switch(marks) {
		case 10: //if marks is 10
			System.out.println("mark is 10");
			break; //after each case we have a break statement
		case 20: //if marks is 20
			System.out.println("mark is 20");
			break; //after each case we have a break statement	
		case 30: //if marks is 30
			System.out.println("mark is 30");
			break; //after each case we have a break statement
		default: //if any other value, this is what executes DONT HAVE TO have a default.
			System.out.println("invalid number");
		}
		
		//-------------------
		
		String days = "SAT";
		
		switch(days) {
		case "SAT":
			System.out.println("day is sat");
			break; 
		case "SUN":
			System.out.println("day is sun");
			break; 
		case "MON": 
			System.out.println("day is mon");
			break; 
		default: 
			System.out.println("invalid string");
		}
		
	
	}
	
	
	static void ex2() {
		
		int marks = 10;
		
		/*
		 * If you have a switch statement without any brakes the switch will continue until it finds breaks or simple finishes
		 * So if mark is 10, it will trigger case 10 and continue to case 20, and case 30 and then default.
		 * If mark is 20, it will hit 20 and everything else after that. 
		 */
		
		//switch with no breaks: 
		
		switch(marks) {
		case 10: //if marks is 10
			System.out.println("mark is 10");
		case 20: //if marks is 20
			System.out.println("mark is 20");
		case 30: //if marks is 30
			System.out.println("mark is 30");
			default: //if any other value, this is what executes DONT HAVE TO have a default.
			System.out.println("invalid number");
		}
		
		//-------------------
		
		//combination of breaks & no breaks:
		
		String days = "SAT";
		
		switch(days) {
		case "SAT": //you don't have to put any code after case
		case "SUN":
			System.out.println("the weekend");
			break; 
		case "MON": 
			System.out.println("day is mon"); 
		case "TUE": 
			System.out.println("day is tue"); 
		case "WED": 
			System.out.println("day is wed"); 
		case "THUS": 
			System.out.println("day is thus"); 
		case "FRI": 
			System.out.println("day is fri"); 
			System.out.println("end of working week"); 
			break;
		default: 
			System.out.println("invalid day");
			break;
		}
		
	}
	

	static void ex3() {
		
		//what can be put into the "switch" part of a switch.
		
		int score = 10, num = 10;
		
		//You can put a mathamatical calculation in the switch part of a switch. but vars HAVE TO BE initialised (or it wont compile)
		
		switch(score+num) {
		case 10: //if marks is 10
			System.out.println("mark is 10");
			break;
		case 30: //if marks is 10
			System.out.println("mark is 30");
			break;
		default: 
			System.out.println("number unkown");
			break;
		}
		
		score = 12;
		
		//this is checking for the number 12: (AND IS VALID CODE!!!)
		switch(score++) {
		}
		
		
		double dNum = 1.2;
		/*
		 * can't a double as there is an infinite amount of numbers between two whole numbers ie 1 & 2.
		 */
		
		Dog spot = new Dog();
		/*
		switch(spot) { //cant use objects
		
		}*/
		
		
		
	}

}
