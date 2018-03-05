package com.sisteminha.entities;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tenant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String companyName;
	private String companyOwner;
	@Enumerated(EnumType.STRING)
	private MaturityLevel maturityLevel;
	private BigDecimal score;
	@OneToMany(mappedBy = "tenant")
	private List<User> users;
	@ManyToOne
	@JoinColumn(name = "incubator_id")
	private Incubator incubator;

}
