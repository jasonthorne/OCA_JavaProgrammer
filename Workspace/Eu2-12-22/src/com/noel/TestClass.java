package com.noel;

public class TestClass {
void probe(Integer x) { System.out.println("In Integer"); } //2
    
    void probe(Object x) { System.out.println("In Object"); } //3 
    
    void probe(Long x) { System.out.println("In Long"); } //4

}
