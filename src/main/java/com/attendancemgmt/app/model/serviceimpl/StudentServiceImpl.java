package com.attendancemgmt.app.model.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.attendancemgmt.app.model.persistance.dao.StudentRepository;
import com.attendancemgmt.app.model.persistance.dto.Student;
import com.attendancemgmt.app.model.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Student student) {
		studentRepository.delete(student);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public void updateStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public List<Student> getStudentByName(String nameOfStudent) {
		return null;
//		return studentRepository.findStudentByName(nameOfStudent);
	}

	@Override
	public Student getStudentByRollNo(String rollNoOfStudent) {
		return null;
		// TODO Auto-generated method stub
		
//		return studentRepository.findStudentByRollNoOfStudent(rollNoOfStudent);
	}

	@Override
	public List<Student> getStudentByCourse(String courseOfStudent) {
		return null;
//		return studentRepository.findStudentByCourseOfStudent(courseOfStudent);
	}

}
