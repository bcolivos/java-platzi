package com.airwave.hibernate.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher implements Serializable {

	@Id
	@Column(name = "id_teacher")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTeacher;

	@Column(name = "name")
	private String name;

	@Column(name = "avatar")
	private String avatar;

	//un teacher tiene muchos cursos pero un curso solo puede tener un teacher
	
	/*@OneToMany nos dice que una de las entidades va a tener una colección de muchos objetos de la 
	 *otra entidad. 
	 *Y justamente el atributo mappedBy es quien nos va a decir con cuál de los campos 
	 *de la colección de objetos tenemos que “formar” esta la relación. 
	 *En @OneToOne no es necesario mappedBy ya que lo que hacemos es mappear atributos de una clase 
	 *con atributos de una entidad en la base de datos. 
	 *Y es el caso en el que estos atributos no tienen referencia a columnas de 
	 *otra tabla (foreign key). 
	 *En @ManyToMany no utilizamos mappedBy ya que con la anotación 
	 *@JoinTable ya basta para especificar cuales tuplas o registros se corresponden entre sí.*/
	
	@OneToMany(mappedBy = "teacher"/*cascade = CascadeType.ALL*/)			//cascade: para que afecten a las tablas relacionadas
	private Set<Course> courses;

	//muchos Teachers pueden tener muchas SocialMedias
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_teacher")
	private Set<TeacherSocialMedia> teacherSocialMedias;

	public Teacher(Long idTeacher, String name, String avatar) {
		super();
		this.idTeacher = idTeacher;
		this.name = name;
		this.avatar = avatar;
	}

	public Teacher(String name, String avatar) {
		super();
		this.name = name;
		this.avatar = avatar;
	}

	public Teacher(String name, String avatar, Set<Course> courses, Set<TeacherSocialMedia> teacherSocialMedias) {
		super();
		this.name = name;
		this.avatar = avatar;
		this.courses = courses;
		this.teacherSocialMedias = teacherSocialMedias;
	}

	public Teacher() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public Set<TeacherSocialMedia> getTeacherSocialMedias() {
		return teacherSocialMedias;
	}

	public void setTeacherSocialMedias(Set<TeacherSocialMedia> teacherSocialMedias) {
		this.teacherSocialMedias = teacherSocialMedias;
	}

}
