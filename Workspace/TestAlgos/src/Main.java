import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		long startTime = 0L;
		long endTime = 0L;
		
		//===========================================================================
		//	LINEAR SEARCH:	
		
		System.out.println("========================\nLINEAR SEARCH");
		
		int [] linearList = {2, 56, 43, 32, 78, 1};
		int linearTarget = 1;
		boolean foundLinearTarget = false;
		System.out.println("Target to find: " + linearTarget);
		
		//starting time: 
		startTime = System.nanoTime();
		
		for (int i=0; i< linearList.length; i++) {
			
			if (linearList[i] == linearTarget) {
				foundLinearTarget = true;
				System.out.println("Found target: " + linearList[i]);
				break;
			}
		}
		
		//ending time: 
		endTime = System.nanoTime();
	    System.out.println("Time taken: " + (endTime - startTime) + "(ns)"); 
	    startTime = 0L;
	    endTime = 0L;
		
		//===========================================================================
	    //	STACK PUSH:
	    
	    int[] stackList = {2, 56, 43, 32, 0, 0};
	    
	    int stackTop = 3; //pointer to top of stack
	    int maxSize = 6; //max amount of items allowed
	    int newItem = 78;
	    
	    System.out.println("========================\nSTACK PUSH");
	    System.out.println("Stack before push: " + Arrays.toString(stackList));
	    
	    //starting time: 
	 	startTime = System.nanoTime();
	    
	    if (stackTop == 6) { //check if memory available
	    	System.out.println("Stack overflow");
	    }else {
	    	stackTop++; //increment top pointer
	    	stackList[stackTop] = newItem; //new item placed in the position of pointer
	    }
	    
	    System.out.println("Stack after push: " + Arrays.toString(stackList));
	    
	    //ending time: 
	 	endTime = System.nanoTime();
	    System.out.println("Time taken: " + (endTime - startTime) + "(ns)"); 
	    startTime = 0L;
	    endTime = 0L;
	    
	    //---------------------------------
	    //	STACK POP:
	    
	    int itemCopy;
	    
	    System.out.println("========================\nSTACK POP");
	    System.out.println("Top of stack before pop: " + stackList[stackTop]);
	    
	    //starting time: 
	 	startTime = System.nanoTime();
	    
	    if (stackList[stackTop] == 0) { //check if stack has elements for removal
	    	System.out.println("Stack is empty");
	    }else {
	    	itemCopy = stackList[stackTop]; //grab item from top by copying it
	    	stackTop--; //decrement top pointer
	    }
	    
	    System.out.println("Top of stack after pop: " + stackList[stackTop]);
	    
	    //ending time: 
	 	endTime = System.nanoTime();
	    System.out.println("Time taken: " + (endTime - startTime) + "(ns)"); 
	    startTime = 0L;
	    endTime = 0L;
	    
	    //===========================================================================
	    //	BUBBLE SORT:
	    
	    int[] bubbleList = {99, 74, 43, 32, 3, 1};
	    int secondLastpos = bubbleList.length-2; //second last pos of list.
	    int searchNum = bubbleList.length-1;
	    int temp = 0;
	    
	    System.out.println("========================\nBUBBLE SORT");
	    System.out.println("Stack before sort: " + Arrays.toString(bubbleList));
	    
	    //starting time:
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
	    
	  	//ending time: 
	  	endTime = System.nanoTime();
	    System.out.println("Time taken: " + (endTime - startTime) + "(ns)"); 
	    startTime = 0L;
	    endTime = 0L;
	    
	    //===========================================================================
	    //	ENHANCED BUBBLE SORT:
	    
	    int[] enhancedBubbleList = {99, 74, 43, 32, 3, 1};
	    //int enhancedSecondLastPos = enhancedBubbleList.length-2; //second last pos of list - NOT NEEDED here as we're looping up to one less pos for each pass
	    int enhancedSearchNum = enhancedBubbleList.length-1;
	    int enhancedTemp = 0;
	    System.out.println("========================\nENHANCED BUBBLE SORT");
	    System.out.println("Stack before sort: " + Arrays.toString(enhancedBubbleList));
	    
	    //starting time: 
	  	startTime = System.nanoTime();
	    
	    for (int i=1; i<= enhancedSearchNum; i++) { //from 1 to n-1 so that the final current is checking the final element
	    	
	    	//loop up to 2nd last pos, as current element checks next element:
	    	for(int j=0; j<=(enhancedSearchNum-1); j++) {  //sort up to one less position for each pass (the enhanced bit) as after each pass it sorts the largest item.
	    		
	    		if (enhancedBubbleList[j] > enhancedBubbleList[j+1]) { //check if next element is bigger than current
	    			
	    			enhancedTemp = enhancedBubbleList[j]; //assign current to temp
	    			enhancedBubbleList[j] = enhancedBubbleList[j+1]; //make current the value of next
	    			enhancedBubbleList[j+1] = enhancedTemp; //make next the value of temp (current)
	    		}
	    	}
	    }
	    
	    System.out.println("Stack after sort: " + Arrays.toString(enhancedBubbleList));
	    
	    //ending time: 
	  	endTime = System.nanoTime();
	    System.out.println("Time taken: " + (endTime - startTime) + "(ns)"); 
	    startTime = 0L;
	    endTime = 0L;
	
	    //===========================================================================
	    //	ALTERNATIVE ENHANCED BUBBLE SORT:
	    
	    int[] altEnhancedBubbleList = {3, 1, 32, 43, 74, 99};
	    int altEnhancedSecondLastPos = altEnhancedBubbleList.length-2; //second last pos of list 
	    int altEnhancedSearchNum = altEnhancedBubbleList.length-1;
	    boolean swapped = false;
	    int altEnhancedTemp = 0;
	    System.out.println("========================\nALTERNATIVE ENHANCED BUBBLE SORT");
	    System.out.println("Stack before sort: " + Arrays.toString(altEnhancedBubbleList));
	    
	    //starting time:
	  	startTime = System.nanoTime();
	    
	    do {
	    	
	    	swapped = false; //set or reset swapped to false
	    	
	    	for(int i=1; i<= altEnhancedSearchNum; i++) {
	    		
		    	for (int j=0; j<=altEnhancedSecondLastPos; j++) { //loop up to second last pos
		    	
		    		if (altEnhancedBubbleList[j] > altEnhancedBubbleList[j+1]) { //if current is greater than next:
		    			altEnhancedTemp = altEnhancedBubbleList[j]; //assign current to temp
		    			altEnhancedBubbleList[j] = altEnhancedBubbleList[j+1]; //make current the value of next
		    			altEnhancedBubbleList[j+1] = altEnhancedTemp; //make next the value of temp (current)
		    			swapped = true; //turned true if a swap occurred
		    		}
		    		
		    	}
	    		
	    	}
		    	
	    }while(swapped == false);
	    
	    System.out.println("Stack after sort: " + Arrays.toString(altEnhancedBubbleList));
	    
	    //ending time: 
	  	endTime = System.nanoTime();
	    System.out.println("Time taken: " + (endTime - startTime) + "(ns)"); 
	    startTime = 0L;
	    endTime = 0L;
	    
	}//main
	

}
