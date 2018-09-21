package com.airwave.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course implements Serializable {

	@Id
	@Column(name = "id_course")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCourse;

	@Column(name = "name")
	private String name;

	@Column(name = "themes")
	private String themes;

	@Column(name = "project")
	private String project;

	// un teacher tiene muchos cursos pero un curso solo puede tener un teacher

	/*
	 * fetch: Cuando solicitemos la entidad Course force el manejador para que
	 * tambien nos devuelva los datos del teacher/ ejecuta un query adicional para
	 * traer los datos de teacher. Uso: encontrar cosas redundantes y omitir esta
	 * consulta
	 */

	@ManyToOne(optional = true, fetch = FetchType.EAGER) // optional: campo opcional para agregar un curso sin necesidad
														 // de agregar un teacher
	@JoinColumn(name = "id_teacher") // campo donde se mapeara, osea la pk de la otra tabla
	private Teacher teacher;

	public Course() {
		super();
	}

	public Long getIdCourse() {
		return idCourse;
	}

	public Course(String name, String themes, String project) {
		super();
		this.name = name;
		this.themes = themes;
		this.project = project;
	}

	public Course(String name, String themes, String project, Teacher teacher) {
		super();
		this.name = name;
		this.themes = themes;
		this.project = project;
		this.teacher = teacher;
	}

	public void setIdCourse(Long idCourse) {
		this.idCourse = idCourse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getThemes() {
		return themes;
	}

	public void setThemes(String themes) {
		this.themes = themes;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
