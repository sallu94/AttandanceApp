package com.attandancemgmt.app.model.persistance.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
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

	private TimeTable timeTable;

}
