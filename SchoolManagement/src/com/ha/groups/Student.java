package com.ha.groups;

import com.ha.base.Person;

public class Student extends Person{
	
	private int studentId;
	private double studentPercentage;
	private String courseCode;
	
	public int getStudentId() {
		return studentId;
		
	}
	
	public void setStudentId(int studentId) {
		if(studentId > 100) {
			this.studentId =studentId;
		}else {
			System.out.println("Invalid Id");
		}
	}
	
	public double getStudentPercentage() {
		return studentPercentage;
	}
	
	public void setStudentPercentage(double studentPercentage) {
		if(studentPercentage>=0 && studentPercentage<=100) {
		}else {
			System.out.println("Invalid Percentage");
		}
	}
	
	public void printStudentDetail()
	{
		System.out.println("student Id:"+this.studentId);
		System.out.println("Student Name:"+super.getName());
		System.out.println("student phone Number;"+super.getPhoneNumber());
		System.out.println("student Percentage:"+this.getStudentPercentage());
	}

	
	}
	


