package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Classroom;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Default

public class ClassroomDBRepository implements ClassroomRepository{	
	
	//tells manager to look into the persistence.xml to use the persistence unit called primary
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	public String getAllClassroom() {
		Query query = manager.createQuery("Select a From Classroom a");
		Collection<Classroom> result = (Collection<Classroom>)query.getResultList();
		return util.getJSONForObject(result);
	}
		
	@Transactional(REQUIRED)
	public String addClassroom(String classroom) {
		Classroom aClassroom = util.getObjectForJSON(classroom, Classroom.class);
		manager.persist(aClassroom);
		return "{\"message\": \"classroom has been successfully added\"}";
	}
	
	
	public String updateClassroom(Long id, String classroom) {
		

		
		return null;
	}

	
	
	
	
	
	public String deleteClassroom(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
