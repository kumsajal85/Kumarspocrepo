package com.sajal.poc.prototype;

public class Product implements Cloneable {
	
	private String name;
	private String desc;
	
	public Product(String name,String desc) {
		this.name=name;
		this.desc=desc;
	}
	
	@Override
	public Product clone() throws CloneNotSupportedException{
		return (Product)super.clone();
	}
	
    @Override
    public String toString() {
        return "Product [name=" + name + ", desc=" + desc + "]";
    }


}
