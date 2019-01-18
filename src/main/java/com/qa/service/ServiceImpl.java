package com.qa.service;

import javax.inject.Inject;

import org.apache.log4j.Logger;

import com.qa.persistence.domain.Classroom;
import com.qa.persistence.repository.ClassroomRepository;
import com.qa.util.JSONUtil;

public class ServiceImpl implements ServiceInterface {

	private static final Logger LOGGER = Logger.getLogger(ServiceImpl.class);

	@Inject
	private ClassroomRepository repo;
	@Inject
	private JSONUtil util;

	public String getAllClassroom() {
		LOGGER.info("In ServiceImpl getAllClassroom ");
		return repo.getAllClassroom();
	}

	public String addClassroom(String classroom) {
		Classroom aClassroom = util.getObjectForJSON(classroom, Classroom.class);
		return repo.addClassroom(classroom);
	}

	public String updateClassroom(Long id, String classroom) {
		return repo.updateClassroom(id, classroom);
	}

	public String deleteClassroom(Long id) {
		return repo.deleteClassroom(id);
	}
	public void setRepo(ClassroomRepository repo) {
		this.repo = repo;
	}
}
