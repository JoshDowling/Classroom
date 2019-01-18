package com.qa.persistence.domain;

import java.util.List;
import java.util.Set;

import javax.enterprise.inject.Default;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
public class Classroom {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
	private String trainer;

	
//	@OneToMany (fetch = FetchType.EAGER)
//	@JoinColumn (name = "classroomID")
//	private List<Classroom> classroom;
//	
//	
//	private List<Trainees> trainees;
//	
//		
//	public List<Trainees> getTrainees() {
//		return trainees;
//	}
// 
//
//	public void setTrainees(List<Trainees> trainees) {
//		this.trainees = trainees;
//	}


	public Classroom() {
		
	}

	public Classroom(Long id, String trainer, Long traineeID) {
		super();
		this.id = id;
		this.trainer = trainer;
		
		
	}


	public Long getClassroomId() {
		return id;
	}



	public void setClassroomId(Long classroomId) {
		this.id = classroomId;
	}


	public String getTrainer() {
		return trainer;
	}


	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	
}
