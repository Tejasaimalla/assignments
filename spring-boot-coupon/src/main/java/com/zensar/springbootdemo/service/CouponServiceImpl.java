package com.zensar.springbootdemo.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.springbootdemo.entity.Student;

@Service
public class CouponServiceImpl implements CouponService {
	private List<Student> students = new ArrayList<Student>();

	public CouponServiceImpl() {
		students.add(new Student(1001, "Teja", 23));
		students.add(new Student(1002, "Rama", 30));
		students.add(new Student(1003, "Seeta", 27));
	}

	@Override
	public Student getStudent(int studentId) {
		// System.out.println("studentId" +studentId);
		for (Student student : students) {
			if (student.getStudentId() == studentId) {
				return student;
			}
		}
		return null;
	}

	@Override
	public List<Student> getAllStudents() {

		return null;
	}

	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStudent(int studentId, Student student) {
		Student student2 = getStudent(studentId);
		student2.setStudentId(student.getStudentId());
		student2.setStudentName(student.getStudentName());
		student2.setStudentAge(student.getStudentAge());

		students.add(student2);
		

	}

	@Override
	public void deleteStudent(int studentId) {
		for (int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			if (student.getStudentId() == studentId) {
				students.remove(student);
			}

		}
	}

}
