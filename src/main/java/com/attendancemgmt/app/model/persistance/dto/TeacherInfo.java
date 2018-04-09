package com.attendancemgmt.app.model.persistance.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity(name = "TeacherInfo")
@Table(name = "teacher_info")
public class TeacherInfo {

	@Id
	private String teacherId;

	@NotNull
	private String teacherName;

	@OneToOne(cascade=CascadeType.ALL)
	private TimeTable timeTable;

}
