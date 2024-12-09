package com.sajal.poc.prototype;

public class MainPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		Product originalProduct= new Product("Pen", "Ball pen");
		Product cloneProduct=originalProduct.clone();
		System.out.println(cloneProduct);

	}

}
