package com.sisteminha.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

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
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@OneToOne
	private Question question;

	@OneToOne
	private Alternative alternative;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "tenant_id")
	private Tenant tenant;

	@ManyToOne
	@JoinColumn(name = "evaluation_response_id")
	private EvaluationResponse evaluationResponse;
}
