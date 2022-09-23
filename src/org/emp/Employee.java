package org.emp;

public class Employee {
	public Employee(String name) {
		System.out.println(name);
	}
private void  employeeId() {
	System.out.println("001");
	System.out.println("002");
	System.out.println("003");
	
}
private void employeeName() {	
	System.out.println("mani");
	System.out.println("siva");
	System.out.println("sivaram");
}
private void employeeDob() {
	System.out.println("01/01/2000");
	System.out.println("01/02/2000");
}
private void employeePhone() {
	System.out.println("987654321");
	System.out.println("897654321");
}
private void employeeEmail() {
	System.out.println("abc@gmail.com");
	System.out.println("cba@gmail.com");
}
private void employeeAddress() {
	System.out.println("thoraipakkam,chennai");
	System.out.println("sollinganllor,chennai");
	
}
public static void main(String[] args) {
	Employee employee=new Employee(null);
	employee.employeeId();
	employee.employeeName();
	employee.employeeDob();
	employee.employeePhone();
	employee.employeeEmail();
	employee.employeeAddress();
}
}
