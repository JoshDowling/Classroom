package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "Classroom" )
public class Classroom {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long classroomID;
	
	@Column(name = "Trainer_Name")
	private String trainer;

	
	@OneToMany (mappedBy = "classroom")
	@JoinColumn (name = "classroomID")
	private List<Trainees> trainees;
	
		
	public List<Trainees> getTrainees() {
		return trainees;
	}
 

	public void setTrainees(List<Trainees> trainees) {
		this.trainees = trainees;
	}




	public Classroom(Long id, String trainer, Long traineeID) {
		super();
		this.classroomID = id;
		this.trainer = trainer;
		
		
	}


	public Long getClassroomId() {
		return classroomID;
	}



	public void setClassroomId(Long classroomId) {
		this.classroomID = classroomId;
	}


	public String getTrainer() {
		return trainer;
	}


	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	
}
