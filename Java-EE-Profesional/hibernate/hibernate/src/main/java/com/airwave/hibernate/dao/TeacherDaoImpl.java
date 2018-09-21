package com.airwave.hibernate.dao;

import java.util.List;

import javax.persistence.Query;

import com.airwave.hibernate.model.Teacher;

public class TeacherDaoImpl extends HibernateSession implements ITeacherDao{

	private HibernateSession hibernateSession;
	
	public TeacherDaoImpl() {
		hibernateSession = new HibernateSession();
	}

	public void saveTeacher(Teacher teacher) {
		hibernateSession.getSession().persist(teacher);
		hibernateSession.getSession().getTransaction().commit();
	}

	public List<Teacher> findAllTeachers() {
		return hibernateSession.getSession().createQuery("from Teacher").list();
	}

	public void deleteTeacherById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void updateTeacher(Teacher teacher) {
		hibernateSession.getSession().update(teacher);
		hibernateSession.getSession().getTransaction().commit();
	}

	public Teacher findTeacherById(Long idTeacher) {
		return hibernateSession.getSession().load(Teacher.class, idTeacher);
	}

	public Teacher findByName(String name) {
		return null;
	}

}
