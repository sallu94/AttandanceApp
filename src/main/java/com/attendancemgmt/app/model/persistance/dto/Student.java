package com.attendancemgmt.app.model.persistance.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
@Table(name = "student_info")
@Entity(name="Student")
public class Student {

	@Id
	@NotNull
	private String rollNoOfStudent;

	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
	private Address addressOfStudent;

	@NotNull
	private String firstNameOfStudent;

	@NotNull
	private Gender GenderOfStudent;

	@NotNull
	private String lastNameOfStudent;

	@NotNull
	private String departmentOfStudent;

	@NotNull
	private String courseOfStudent;

	@NotNull
	private int yearOfStudent;

	@NotNull
	@Length(min = 10, max = 10)
	private long contactOfStudent;

	@NotNull
	private String emailIdOfStudent;

	@NotNull
	private String fatherOccupationOfStudent;

	@NotNull
	private String fathersNameOfStudent;

	@NotNull
	@Length(min = 10, max = 10)
	private long fathersContactNoOfStudent;

	@NotNull
	@Past
	private Date dateOfBirthOfStudent;
	
	private int attandedLectures;
	

}
