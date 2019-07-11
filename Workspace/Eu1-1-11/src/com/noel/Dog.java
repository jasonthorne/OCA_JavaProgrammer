package com.noel;

public class Dog {
	String name;
	int age;
	String s;
	Dog(String name,int age){
		this.name=name;
		this.age=age;
		s=this.toString();
		
	}
	
	void changeDog(Dog dog1,Dog dog2){
		dog1.age=dog1.age*2;
		dog2=dog1;
	}

}

class Cat{
	String name;
	int age;
	String s;
	Cat(String name,int age){
		this.name=name;
		this.age=age;
		s=this.toString();	
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
	
}
