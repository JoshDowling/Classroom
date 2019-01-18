package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class trainees {
	

		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Id
		private Long traineeID;
		private String traineeName;
		
		
		
		public Classroom(Long traineeID, String traineeName) {
			super();
			this.traineeID = traineeID;
			this.traineeName = traineeName;
		}
	
	
}