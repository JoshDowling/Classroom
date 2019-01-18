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
	
	@Transactional(REQUIRED)
	public String updateClassroom(Long id, String classroom) {
		Classroom aClassroom = findClassroom(id);
		manager.remove(aClassroom);
		Classroom newClassroom = util.getObjectForJSON(classroom, Classroom.class);
		manager.persist(newClassroom);

		return "{\"message\": \"account has been successfully updated\"}";
	}

	@Transactional(REQUIRED)
	public String deleteClassroom(Long id) {
			Classroom classroomFromDB = findClassroom(id);
			if(classroomFromDB != null) {
				manager.remove(classroomFromDB);
			}
			return "{\"message\": \"account has been successfully deleted\"}";
		}
	
	public Classroom findClassroom(Long id) {
		return manager.find(Classroom.class, id);
		}
	
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

	public void setUtil(JSONUtil util) {
		this.util = util;
	}

}
