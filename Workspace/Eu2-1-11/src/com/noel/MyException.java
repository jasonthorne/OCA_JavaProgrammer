package com.noel;

public class MyException extends Throwable{

}

class MyException2 extends MyException{
	
}

class MyException3 extends MyException2{
	
}

class ExceptionTest{
	void myMethod()throws MyException{
		throw new MyException();
	}
}
