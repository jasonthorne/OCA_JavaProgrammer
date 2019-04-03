package com.gretb;

public class Main {

	public static void main(String[] args) {
		
		//create first person:
		Person percy = new Person();
		//and another:
		Person trisha = new Person();
		
		
		//giving values to all the attributes of percy:
		percy.name="Percy";
		percy.height=6;
		percy.weight=100;
		percy.id=1;
		
		//giving values to all the attributes of trisha:
		trisha.name="Trisha";
		trisha.height=5;
		trisha.weight=70;
		trisha.id=2;
		
		//calculate the bmis and display results:
		percy.calcBmi(); 
		trisha.calcBmi();
		
		percy.display();
		trisha.display();
	}

}
