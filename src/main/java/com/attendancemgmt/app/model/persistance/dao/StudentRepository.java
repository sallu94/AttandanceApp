package com.attendancemgmt.app.model.persistance.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.attendancemgmt.app.model.persistance.dto.Student;

public interface StudentRepository extends JpaRepository<Student, String> {

	/*@Query("select * from student_info where  first_name_of_student :=	firstNameOfStudent")
	List<Student> findStudentByName(String firstNameOfStudent);

	@Query("select * from student_info where roll_no_of_student := rollNoOfStudent")
	Student findStudentByRollNoOfStudent(String rollNoOfStudent);

	@Query("select * from student_info where course_of_student := courseOfStudent")
	List<Student> findStudentByCourseOfStudent(String courseOfStudent);
*/
}
