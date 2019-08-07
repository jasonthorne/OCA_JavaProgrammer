package com.android;

public class Dog implements Behaviour{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + dogId;
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (dogId != other.dogId)
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	//this is going to keep a count of how many dogs are created
	static int counter=1;
	int age=45;
	double weight=12.34;
	/*every dog will have a unique id
	 * which we will make final, which means when a dog has been 
	 * assigned an id, you can't change it
	 * we have to give an initial value to a final or we get a 
	 * compilation error
	 */
	final int dogId;
	/*
	 * we only have ONE dog constructor, so this is the only way we can
	 * create a Dog. we HAVE to get a value to teh final int dogId in
	 * this constructor
	 */
	
	public Dog() {
		dogId=counter;
		counter++;
	}

	@Override
	public void mad() {
		System.out.println("Dog mad");
		
	}

	@Override
	public void sad() {
		System.out.println("Dog sad");
		
	}

	@Override
	public void bad() {
		System.out.println("Dog bad");
		
	}

}

class Collie extends Dog{
	static int collieCounter=0;
	
	Collie(){
		super();
		collieCounter++;
	}
}
