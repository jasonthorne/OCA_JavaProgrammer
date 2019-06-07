
public class Dog {
	
	//You can't directly create a Dog outside of the Dog class, as the only constructor in the Dog class is private.
	private Dog() {
		System.out.println("Dog constructor called"); //can ONLY create a DOg obj inside this class.
	}
	
	
	//this STATIC method calls the PRIVATE Dog constructor, and returns a new Dog
	//Allowing a Dog to be accessed outside of the Dog clas.:
	static Dog createDog() {
		return new Dog();
	}
	             

}
