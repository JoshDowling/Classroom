package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainees {
	

		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Id
		private Long traineeID;
		private String traineeName;
			
	
}