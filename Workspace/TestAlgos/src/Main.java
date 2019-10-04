import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		long startTime = 0L;
		long endTime = 0L;
		
		//===========================================================================
			
		System.out.println("========================\nLINEAR SEARCH");
		
		int [] linearList = {2, 56, 43, 32, 78, 1};
		int linearTarget = 1;
		boolean foundLinearTarget = false;
		System.out.println("Target to find: " + linearTarget);
		
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
	    startTime = 0L;
	    endTime = 0L;
		
		//===========================================================================
	    
	    int[] stackList = {2, 56, 43, 32, 0, 0};
	    
	    int stackTop = 3; //pointer to top of stack
	    int maxSize = 6; //max amount of items allowed
	    int newItem = 78;
	    
	    System.out.println("========================\nSTACK PUSH");
	    System.out.println("Stack before push: " + Arrays.toString(stackList));
	    
	    // starting time 
	 	startTime = System.nanoTime();
	    
	    if (stackTop == 6) { //check if memory available
	    	System.out.println("Stack overflow");
	    }else {
	    	stackTop++; //increment top pointer
	    	stackList[stackTop] = newItem; //new item placed in the position of pointer
	    }
	    
	    System.out.println("Stack after push: " + Arrays.toString(stackList));
	    
	    // ending time 
	 	endTime = System.nanoTime();
	    System.out.println("Time taken: " + (endTime - startTime) + "(ns)"); 
	    startTime = 0L;
	    endTime = 0L;
	    
	    //---------------------------------
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
	    startTime = 0L;
	    endTime = 0L;
	    
	    
	    //===========================================================================
	    int[] bubbleList = {99, 74, 43, 32, 3, 1};
	    int secondLastpos = bubbleList.length-2; //second last pos of list.
	    int searchNum = bubbleList.length-1;
	    int temp = 0;
	    
	    System.out.println("========================\nBUBBLE SORT");
	    System.out.println("Stack before sort: " + Arrays.toString(bubbleList));
	    
	    // starting time 
	  	startTime = System.nanoTime();
	  	
	  	for (int i=1; i<= searchNum;i++) { //from 1 to n-1 so that the final current is checking the final element
	  		
	  		for (int j=0; j<= secondLastpos;j++) { //loop up to second last pos, as current element checks next element
	  			
	  			if (bubbleList[j] > bubbleList[j+1]) { //check if next element is bigger than current
	  				
	  				temp = bubbleList[j]; //assign current to temp
	  				bubbleList[j] = bubbleList[j+1]; //make current the value of next
	  				bubbleList[j+1] = temp; //make next the value of temp (current)
	  			}
	  		}
	  	}
	  	
	  	System.out.println("Stack after sort: " + Arrays.toString(bubbleList));
	    
	  	// ending time 
	  	endTime = System.nanoTime();
	    System.out.println("Time taken: " + (endTime - startTime) + "(ns)"); 
	    startTime = 0L;
	    endTime = 0L;
	    
	    //===========================================================================
	    int[] enhancedBubbleList = {99, 74, 43, 32, 3, 1};
	    System.out.println("========================\nENHANCED BUBBLE SORT");
	    System.out.println("Stack before sort: " + Arrays.toString(enhancedBubbleList));
	    
	    
	
	}//main
	

}
