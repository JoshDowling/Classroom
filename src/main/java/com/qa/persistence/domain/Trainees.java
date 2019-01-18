package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Trainees {
	



	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long traineeID;

	@Column(name = "Trainee_Name")
	private String traineeName;

	@Column(name = "Classroom_ID")
	private Long classroomID;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn (name = "classroomID")
	private List<Classroom> classroom;

	

	public Trainees(Long traineeID, String traineeName, Long classroomID) {
		super();
		this.traineeID = traineeID;
		this.traineeName = traineeName;
		
	}



	public Long getTraineeID() {
		return traineeID;
	}



	public void setTraineeID(Long traineeID) {
		this.traineeID = traineeID;
	}



	public String getTraineeName() {
		return traineeName;
	}



	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

}