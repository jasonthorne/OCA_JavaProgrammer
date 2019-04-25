package com.gretb;

public class Cat {
	int age;
	String name;
	double weight;
	boolean sex;
	//default value for gender is null
	String gender;
	/*
	 * if i don't give an explicit value to this cat the value will be 
	 * null
	 * default value for cat is null
	 */
	Cat partner;
	
	Cat(int age,String name,double weight,boolean sex){
		this.age=age;
		this.name=name;
		this.weight=weight;
		this.sex=sex;
		if(sex)
			gender="female";
		else
			gender="male";
	}
	/*
	 * overriding the toString() method of the Object class to return
	 * a String with all the variables (bar sex) of the Cat that 
	 * calls this method
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cat [age=" + age + ", name=" + name + ", weight=" + weight + ", gender=" + gender + "]";
	}
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (sex ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}*/
	/*This is overriding the equals() method of the object class. The 
	 * equals() method in the Object class just checks if the two objects
	 * are the same, that one of the objects is not null and that they
	 * are the same class. the object class equals() method returns true
	 * if same object, false if one of the objects is null and false
	 * if they are not objects of the same type. 
	 * This overriden method does all of the above, plus if two cats have
	 * the same age,name,sex,gender,weight this will return true.
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		/*
		 * the first three if's are what the object class equals() method
		 * contains
		 */
		if (this == obj) {
			System.out.println("these are the two same cats");
			return true;
		}
			
		if (obj == null) {
			System.out.println("the cat we are comparing too is null");
			return false;
		}
			
		if (getClass() != obj.getClass()) {
			System.out.println("the object we are comparing too is not a cat");
			return false;
		}
			
		System.out.println("these are two cats");
		//you can only cast to compatible data types
		Cat other = (Cat) obj;
		if (age != other.age) {
			System.out.println("not the same age");
			return false;
		}	
		if (gender == null) {
			if (other.gender != null)
				System.out.println("the gender of the otehr cat is null");
				return false;
		} else if (!gender.equals(other.gender)) {
			System.out.println("the genders are not the same");
			return false;
		}
			
		if (name == null) {
			if (other.name != null) {
				System.out.println("the other cats gender is null");
				return false;
			}
				
		} else if (!name.equals(other.name)) {
			System.out.println("the cats do not have the same name");
			return false;
		}
			
		if (sex != other.sex) {
			System.out.println("the cats do not have the same boolean sex");
			return false;
		}
			
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight)) {
			System.out.println("the cats do not have the same weight");
			return false;
		}
			
		return true;
	}
	
	
	
	
	
	

}
