package com.night.test;

abstract class Employee{
	abstract void setSalary(int salary);
	abstract int getSalary();
	abstract void setGrade(String grade);
	abstract String getGrade();
	void label() {
		//No code
	}
}

class Engineer extends Employee{
	private int salary;
	private String grade;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	void label() {
		System.out.print("Employee's data:\n");
//		System.out.println("GRADE : "+getGrade());
//		System.out.println("SALARY : "+getSalary());
	}
}

class Manager extends Employee{
	private int salary;
	private String grade;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	void label() {
		System.out.print("Employee's data:\n");
//		System.out.println("GRADE : "+getGrade());
//		System.out.println("SALARY : "+getSalary());
	}
}

public class Solution2 {
	public static void main(String[] args) {
		Engineer er=new Engineer();
		er.setGrade("B");
		er.setSalary(50000);
		er.label();
		
		Manager mr=new Manager();
		mr.setGrade("A");
		mr.setSalary(70000);
		mr.label();
	}
}
