import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		long startTime = 0L;
		long endTime = 0L;
		
		//===========================================================================
		//	LINEAR SEARCH:	
		
		System.out.println("========================\nLINEAR SEARCH:");
		
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
	    
	    System.out.println("========================\nSTACK PUSH:");
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
	    
	    System.out.println("========================\nSTACK POP:");
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
	    
	    System.out.println("========================\nBUBBLE SORT:");
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
	    System.out.println("========================\nENHANCED BUBBLE SORT:");
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
	
	    //=========================================================================== ++++++++++++++++++++++NOT HAPPY WITH THIS!!! (think there's something wrong with it!!)
	    //	ALTERNATIVE ENHANCED BUBBLE SORT:
	    
	    int[] altEnhancedBubbleList = {3, 1, 32, 43, 74, 99};
	    int altEnhancedSecondLastPos = altEnhancedBubbleList.length-2; //second last pos of list 
	    int altEnhancedSearchNum = altEnhancedBubbleList.length-1;
	    boolean swapped = false;
	    int altEnhancedTemp = 0;
	    System.out.println("========================\nALTERNATIVE ENHANCED BUBBLE SORT: - check this (It may be wrong! :P)");
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
	    
	    //===========================================================================
	    //	BINARY SEARCH:
	    
	    System.out.println("========================\nBINARY SEARCH:");
	    
	    int [] binaryList = {1, 6, 20, 32, 44, 67, 83, 90, 103, 126, 149, 205, 210};
		int binaryTarget = 126;
		boolean foundbinaryTarget = false;
		int binaryLowPos = 0; 
		int binaryHighPos = binaryList.length-1;
		int binaryMiddlePos = 0;
		System.out.println("Target to find: " + binaryTarget);
		
		//starting time: 
		startTime = System.nanoTime();
	    
		do {
	    	
			binaryMiddlePos = (binaryLowPos + binaryHighPos)/2; //calculate the middle pos of the array
	    	
	    	if (binaryTarget == binaryList[binaryMiddlePos]) { //check if middle pointer contains the target value
	    		foundbinaryTarget = true;
	    		System.out.println("Found target: " + binaryList[binaryMiddlePos]);
	    		break; //leave do-while
	    	}
	    	else if (binaryTarget < binaryList[binaryMiddlePos]) { //check if target value is less than middle pointer's value
	    	
	    		binaryHighPos = (binaryMiddlePos -1); //reassign high pointer to discard the top half of the list. (moving its pos -1)
	    	}
	    	else if (binaryTarget > binaryList[binaryMiddlePos]) { //check if target value is greater than middle pointer's value
	    		
	    		binaryLowPos = (binaryMiddlePos +1); //reassign low pointer to discard the bottom half of the list. (moving its pos +1)
	    	}
	    	
		}while(binaryLowPos <= binaryHighPos);
	    
	    //ending time: 
	  	endTime = System.nanoTime();
	    System.out.println("Time taken: " + (endTime - startTime) + "(ns)"); 
	    startTime = 0L;
	    endTime = 0L;
	    
	    
	    //===========================================================================
	    //	MERGE SORT:
	    
	    System.out.println("========================\nMERGE SORT:");
	    
	    int [] mergeList = {2, 56, 5, 43, 20, 1};  
	    
	    //split a list:
	    int mergeMiddlePos = (mergeList.length)/2; //pointer to the middle pos of list
	    int ptr1 = 0;
	    int mergeLastPos = mergeList.length; //final index pos of mergeList
	    
	    int[] leftMergeList = new int [mergeMiddlePos]; //new left list 
	    int[] rightMergeList = new int [mergeMiddlePos]; //new right list
	    
	    
	    //==================
	    /*
	    System.out.println("before merge: " + Arrays.toString(leftMergeList)); //++++++++++++++++++++++++++++
	    System.out.println("before merge: " + Arrays.toString(rightMergeList)); //+++++++++++++++++++++++++++
	    System.out.println(mergeMiddlePos);
	    */
	    //=====================
	    
	   
	    while(ptr1 != mergeMiddlePos) { //stop when ptr hits middle pos of list.
	    	
	    	leftMergeList[ptr1] = mergeList[ptr1]; //use ptr1 to copy elements from first half of source array into left array
	    	ptr1++; //increment ptr1
	    	//System.out.println(Arrays.toString(leftMergeList)); 
	    }
	    
	    int ptr2 = 0; //another pointer with 0 index to fill right array with second half of source array
	    
	    
	    while(ptr1 != mergeLastPos) { //stop when ptr hits last pos of list.
	    	
	    	rightMergeList[ptr2] = mergeList[ptr1]; //use ptr1 to copy elements from 2nd half of source array into left array (at pos of ptr2)
	    	ptr1++; //increment ptr1
	    	ptr2++; //increment ptr2
	    	//System.out.println(Arrays.toString(rightMergeList));     
	    }
	    
	    //System.out.println(Arrays.toString(leftMergeList)); //++++++++++++++++++++++++++++
	    //System.out.println(Arrays.toString(rightMergeList)); //+++++++++++++++++++++++++++
	    
	   
	   
	    //====================Merge 2 lists:
	    
	    //THIS SORTING SHOULD BE DONE THROUGH SOMETHING LIKE A BUBBLE SORT INSTEAD!! 
	    Arrays.sort(leftMergeList);
	    Arrays.sort(rightMergeList);
	    System.out.println("leftMergeList: " + Arrays.toString(leftMergeList) + "\nrightMergeList:" + Arrays.toString(rightMergeList));
	    
	    
	    
	    ptr1 = 0;
		ptr2 = 0;
	    int ptr3 = 0;
	    int[] mergedList = new int[leftMergeList.length + rightMergeList.length];
	    int finalLeftIndex = leftMergeList.length -1;
	    int finalRightIndex = rightMergeList.length -1;
	    
	    //====================================================
	    /*
	    System.out.println(finalLeftIndex);
	    System.out.println(finalRightIndex);
	    System.out.println(Arrays.toString(rightMergeList)); //+++++++++++++++++++++++++++
	    System.out.println(mergedList.length);
	    System.out.println((finalLeftIndex + finalRightIndex) + 1);
	    */
	    //====================================================
	    
	    System.out.println("Yo: " + mergedList.length);
	    
	  // while(ptr3 != ((finalLeftIndex) + (finalRightIndex) + 1)) { //stop when reach end of both lists combined
	    while(ptr3 != 5) { //stop when reach end of both lists combined
		   
		   if (leftMergeList[ptr1] < rightMergeList[ptr2]){ //if list1's value is less than list 2's
			   
			   mergedList[ptr3] = leftMergeList[ptr1]; //assign value to new list
			   ptr1++; //increment ptr1
		   }else { //list 2's value is bigger ///+++++++++++++++++++++++++++++++++OR VALUES ARE THE SAME! - edit code to take that into account
			   
			   mergedList[ptr3] = rightMergeList[ptr2]; //assign value to new list
			   ptr2++;
		   }
		   
		   
		   System.out.println(mergedList[ptr3]);
		   
		   ptr3++; //increment ptr3
		   //System.out.println(Arrays.toString(mergedList));
		  
	   }
	    
	   
	   System.out.println(Arrays.toString(mergedList));
	    
	    
	    
	    
	}//main
	

}
