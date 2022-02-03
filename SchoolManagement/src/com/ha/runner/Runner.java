package com.ha.runner;

import com.ha.groups.Student;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu1=new Student();
		stu1.setName("John wick");
		stu1.setPhoneNumber(9898986565L);
		stu1.setStudentId(101);
		stu1.setStudentPercentage(66.3);
		
		stu1.printStudentDetail();
		
		

	}

}
