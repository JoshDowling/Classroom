package com.qa.persistence.repository;

public interface ClassroomRepository {

	String getAllClassroom();

	String addClassroom(String classroom);

	String updateClassroom(Long id, String classroom);

	String deleteClassroom(Long id);

}