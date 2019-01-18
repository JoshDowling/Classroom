package com.qa.service;

public interface ServiceInterface {
	
	String getAllClassroom();

	String addClassroom(String classroom);

	String updateClassroom(Long id, String classroom);

	String deleteClassroom(Long id);


}
