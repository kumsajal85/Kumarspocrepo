package com.sajal.pratice.java17.feature;

public class PersonRecord {

	public static void main(String[] args) {
		
		Person personRec= new Person("Sajal","Bangalore",34);
		System.out.println("Name : "+personRec.name);
		System.out.println("Address : "+personRec.address);
		System.out.println("Age : "+personRec.age);
		
		System.out.println(personRec);

	}
	
	//creating a person record
public record Person(String name,String address,int age){};

}
