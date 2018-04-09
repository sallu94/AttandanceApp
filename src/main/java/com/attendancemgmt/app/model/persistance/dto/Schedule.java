package com.attendancemgmt.app.model.persistance.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Embeddable
@Data
public class Schedule implements Serializable {

	private static final long serialVersionUID = -2278935133554660067L;

	@NotNull
	private String teacherId;

	@NotNull
	private String day;

}
