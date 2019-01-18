package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long classroomId;
	private String trainer;
	private Class trainees;
	
	
	
	public Classroom(Long classroomId, String trainer, Class trainees) {
		super();
		this.classroomId = classroomId;
		this.trainer = trainer;
		this.trainees = trainees;
	}
	
	
	
	
	
}
