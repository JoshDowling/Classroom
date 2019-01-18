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
	private Long classroomId;
	
	@Column(name = "Trainer_Name")
	private String trainer;
	
	@Column(name = "trainees")
	private Long traineeID;
	
	@OneToMany (mappedBy = "classroom")
	@JoinColumn (name = "traineeID")
	private List<Trainees> trainees;
	
		
	public List<Trainees> getTrainees() {
		return trainees;
	}



	public void setTrainees(List<Trainees> trainees) {
		this.trainees = trainees;
	}



	public Classroom(Long classroomId, String trainer, Long traineeID) {
		super();
		this.classroomId = classroomId;
		this.trainer = trainer;
		this.traineeID = traineeID;
	}



	public Long getClassroomId() {
		return classroomId;
	}



	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}



	public String getTrainer() {
		return trainer;
	}



	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}



	public Long getTraineeID() {
		return traineeID;
	}



	public void setTraineeID(Long traineeID) {
		this.traineeID = traineeID;
	}
	
	
	
	
	
}
