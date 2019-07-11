package com.noel;

public class ExceptionTest {
	
	static float returnEx(){
		try{
			throw new Exception();
		//	return 1.0f;
			
		}
		catch(Exception e){
			return 2.0f;
		}
		finally{
			return 3.0f;
		}
		
	//	return 3.0f;
	}

}
