package com.noel;
//for question 60
public abstract class Vehicle {

}
interface Drivable{ } 
class Car extends Vehicle implements Drivable{ } 
//SUV also implements Drivable through the Car class
class SUV extends Car { }
