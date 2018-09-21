package com.airwave.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.airwave.hibernate.dao.TeacherDaoImpl;
import com.airwave.hibernate.model.Course;
import com.airwave.hibernate.model.Teacher;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		/*
		SessionFactory sessionFactory;							//crear obj sf
		Configuration configuration = new Configuration();		//crear obj conf / lee archivo de conf xml
		configuration.configure();								//accesa en el archivo e inicia la conf de la session
		sessionFactory = configuration.buildSessionFactory();	//con la conf construimos la sesion / abre la puerta
		Session session = sessionFactory.openSession();			//creamos sesion / nos permite ejec accion a la db
		*/
		/*En el archivo cfg.xml tambien necesita mapear las clases para las db
		 * ej) <mapping class="com.airwave.hibernate.model.Course"/>*/
		
		//Insertar teacher
		//Teacher teacher = new Teacher("Profe 1", "Avatar 1");
		/*Course course = new Course("Curso 1", "Tema 1", "REST API 1");
		session.beginTransaction();								//iniciamos la transaccion
		session.save(course);									//hacemos la accion, save en este caso(insert)
		session.getTransaction().commit();						//agarramos la transaccion y la mandamos a la db
		*/
		
		/*Teacher teacher = new Teacher("Profe 6", "Avatar 6");
		TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
		teacherDaoImpl.saveTeacher(teacher);
		
		List<Teacher> teachers = teacherDaoImpl.findAllTeachers();
		for (Teacher t : teachers) {
			System.out.println("Nombre profesor: " + t.getName());
		}*/
		Teacher teacher = new Teacher();
		TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
		teacher = teacherDaoImpl.findTeacherById((long)1);
		System.out.println(teacher.getName());
		teacher.setName("profe x");
		teacher.setAvatar("avatar x");
		teacherDaoImpl.updateTeacher(teacher);
		
	}
}
