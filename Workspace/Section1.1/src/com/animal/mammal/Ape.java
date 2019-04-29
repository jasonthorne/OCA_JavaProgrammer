package com.animal.mammal;

//PAGE 30 IN BOOK +++++++++++++++++++++++++++++++++++++++++

/*Access modifier*/public  //optional
/*Non Access modifier*/final //optional
/*class declaration*/class //compulsory
/*class name*/Ape //compulsory 
/*extending a superclass*/extends Mammal //optional. If it doesn't extend a particular, it will extend Object as every class ultimately extends object (Mammal is in the behavior file).
implements Behaviour, Movement{ //behaviour interface is in the Behavior file. Movement interface is ALSO in the Behavior file. 

	@Override
	public void run() {
		System.out.println("Ape run");
		
	}

	@Override
	public void walk() {
		System.out.println("Ape walk");
		
	}

	@Override
	public void swim() {
		System.out.println("Ape swim");
		
	}

	@Override
	public void mad() {
		System.out.println("Ape mad");
		
	}

	@Override
	public void sad() {
		System.out.println("Ape sad");
		
	}

	@Override
	public void happy() {
		System.out.println("Ape happy");
		
	}

}
