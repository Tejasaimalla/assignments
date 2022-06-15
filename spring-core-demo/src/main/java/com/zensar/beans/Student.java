package com.zensar.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import javax.annotation.PostConstruct;

//import javax.annotation.PreDestroy;

@Component("stud")
@Scope("prototype")
public class Student{
	
	@Value("${id}")
	private int studentId;
	
	@Value("${name}")
	private String studentName;
	
	@Value("${age}")
	private int studentAge;
	
	

	public Student() {
		super();
		System.out.println("Welcome to Zensar");
	}

	public Student(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}
	

}