package org.sample;

public class Sample {
	private void employee() {
		System.out.println("employee details:");
	}
	
	
	private void employee(int id) {
		System.out.println("employee id is:"+id);
		System.out.println("10000");
	}
	private void employee(float weight,int age) {
		System.out.println("employee wight is:"+weight);
		System.out.println("employee age is :"+age);
	}
	private void employee(int salary,float height) {
		System.out.println("employee salary is :"+salary);
		System.out.println("employee height is :"+height);
		
	}
	
		

	private void employee(String name) {
		System.out.println("employee name is :"+name);
	}
	
	public static void main(String[] args) {
		Sample s=new Sample();
		
		s.employee();
		s.employee(38);
		s.employee("bagav");
		s.employee(500f, 45);
		s.employee(40000f,184);
	}
	
		

	}
		
	
		

	
	
	