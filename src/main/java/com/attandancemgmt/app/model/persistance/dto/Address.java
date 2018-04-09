package com.attandancemgmt.app.model.persistance.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
@Entity
@Table(name = "address_info")
public class Address {

	@NotNull
	@Id
	private String houseNoAddress;

	@NotNull
	private String streetNoAddress;

	@NotNull
	private String cityAddress;

	@NotNull
	private String districtAddress;

	@NotNull
	private String stateAddress;

	@NotNull
	private String countryAddress;

	@NotNull
	@Length(min = 6, max = 6)
	private String pinAddress;

}
