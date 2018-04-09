package com.attendancemgmt.app.model.service;

import java.util.List;

import com.attendancemgmt.app.model.persistance.dto.Student;

public interface StudentService {

	void addStudent(Student student);

	void deleteStudent(Student student);

	List<Student> getAllStudent();

	void updateStudent(Student student);

	List<Student> getStudentByName(String nameOfStudent);

	Student getStudentByRollNo(String rollNoStudent);

	List<Student> getStudentByCourse(String courseOfStudent);

}
