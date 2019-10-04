import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		long startTime;
		long endTime;
	
	//===========================================================================
		
	System.out.println("========================\nLINEAR SEARCH");
	
	int [] linearList = {2, 56, 43, 32, 78, 1};
	int linearTarget = 1;
	boolean foundLinearTarget = false;
	
	
	 // starting time 
	startTime = System.nanoTime();
	
	for (int i=0; i< linearList.length; i++) {
		
		if (linearList[i] == linearTarget) {
			foundLinearTarget = true;
			System.out.println("Found target: " + linearList[i]);
			break;
		}
	}
	
	// ending time 
	endTime = System.nanoTime();
    System.out.println("Time taken: " + (endTime - startTime) + "(ns)"); 
	
	
	//===========================================================================
    
    int[] stackList = {2, 56, 43, 32, 0, 0};
    
    int stackTop = 3; //pointer to top of stack
    int maxSize = 6; //max amount of items allowed
    int newItem = 78;
    
    System.out.println("========================\nSTACK PUSH");
    System.out.println("Before stack push: " + Arrays.toString(stackList));
    
    // starting time 
 	startTime = System.nanoTime();
    
    if (stackTop == 6) { //check if memory available
    	System.out.println("Stack overflow");
    }else {
    	stackTop++; //increment top pointer
    	stackList[stackTop] = newItem; //new item placed in the position of pointer
    }
    
    System.out.println("After stack push: " + Arrays.toString(stackList));
    
    // ending time 
 	endTime = System.nanoTime();
    System.out.println("Time taken: " + (endTime - startTime) + "(ns)"); 
    
    
    //=================================
    int itemCopy;
    
    System.out.println("========================\nSTACK POP");
    System.out.println("Top of stack before pop: " + stackList[stackTop]);
    
    // starting time 
 	startTime = System.nanoTime();
    
    if (stackList[stackTop] == 0) { //check if stack has elements for removal
    	System.out.println("Stack is empty");
    }else {
    	itemCopy = stackList[stackTop]; //grab item from top by copying it
    	stackTop--; //decrement top pointer
    }
    
    System.out.println("Top of stack after pop: " + stackList[stackTop]);
    
    // ending time 
 	endTime = System.nanoTime();
    System.out.println("Time taken: " + (endTime - startTime) + "(ns)"); 
    
    
    
    
    
    
    
    
    
	
	}
	

}
