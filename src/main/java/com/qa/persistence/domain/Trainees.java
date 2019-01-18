package com.qa.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Trainees {
	



	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long traineeID;

	@Column(name = "Trainee_Name")
	private String traineeName;

	@ManyToOne(fetch = FetchType.LAZY)
	private Classroom classroom;


	public Classroom getClassroom() {
		return classroom;
	}


	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}


	public void Classroom(Long traineeID, String traineeName) {
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