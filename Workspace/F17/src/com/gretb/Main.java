package com.gretb;

public class Main {

	public static void main(String[] args) {
		//creating our first person
		Person percy=new Person();
		//create our second person
		Person patrica=new Person();
		//giving values to all the atributes of percy
		percy.name="percy";
		percy.height=6;
		percy.weight=100;
		percy.id=1;
		//giving values to all the atributes of patrica
		patrica.name="patrica";
		patrica.height=5;
		patrica.weight=70;
		patrica.id=2;
		
		System.out.println("before method calld percy bmi "+percy.bmi);
		System.out.println("before method calld patrica bmi "+patrica.bmi);
		//calculates the BMI of percy and display if BMI too low or high
		percy.calcBmi();
		//calculates the BMI of patrica and display if BMI too low or high
		patrica.calcBmi();
		
		System.out.println("after method calld percy bmi "+percy.bmi);
		System.out.println("after method calld patrica bmi "+patrica.bmi);
		percy.display();
		patrica.display();

	}

}
