package com.airwave.hibernate.dao;

import java.util.List;

import com.airwave.hibernate.model.Teacher;

public interface ITeacherDao {
	
	void saveTeacher(Teacher teacher);
	
	List<Teacher> findAllTeachers();
	
	void deleteTeacherById(Long id);
	
	void updateTeacher(Teacher teacher);
	
	Teacher findTeacherById(Long idTeacher);
	
	Teacher findByName(String name);

}
