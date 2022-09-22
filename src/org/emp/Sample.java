package org.emp;

public class Sample extends Employee {
	public Sample(String address) {
		super("abi");
		System.out.println("address:"+address);
	}
	public Sample(int id) {
		this("chennai");
		System.out.println(id);
	}
	public Sample() {
		this(2354);
		
	}
	public static void main(String[] args) {
		Sample s = new Sample();
	}

}
