package com.attandancemgmt.app.model.persistance.dto;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity(name = "TimeTable")
@Table(name = "time_table_info")
public class TimeTable {

	@NotNull
	private String teacherId;
	
	@NotNull
	private String day;
	private String nine;
	private String ten;
	private String eleven;
	private String twelve;
	private String two;
	private String three;
	private String four;
}
