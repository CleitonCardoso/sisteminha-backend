package com.sisteminha.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Incubator {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String directorName;

	private String phone;

	private String mail;

	@OneToMany(mappedBy = "incubator")
	@JsonIgnore
	private List<User> users;

	@OneToMany(mappedBy = "incubator")
	@JsonIgnore
	private List<Evaluation> evaluations;

	@OneToMany(mappedBy = "incubator")
	@JsonIgnore
	private List<Tenant> tenants;

}
