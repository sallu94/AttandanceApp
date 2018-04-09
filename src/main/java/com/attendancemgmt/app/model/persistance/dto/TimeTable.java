package com.attendancemgmt.app.model.persistance.dto;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "TimeTable")
@Table(name = "time_table_info")
public class TimeTable {

	@EmbeddedId
	private Schedule schedule;

	private Date date;
	private String nine;
	private String ten;
	private String eleven;
	private String twelve;
	private String two;
	private String three;
	private String four;
}
