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
@Table(name = "social_media")
public class SocialMedia implements Serializable {

	@Id
	@Column(name = "id_social_media")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSocialMedia;

	@Column(name = "name")
	private String name;

	@Column(name = "icon")
	private String icon;

	//muchos Teachers pueden tener muchas SocialMedias
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_social_media")
	private Set<TeacherSocialMedia> teacherSocialMedias;

	public SocialMedia(String name, String icon, Set<TeacherSocialMedia> teacherSocialMedias) {
		super();
		this.name = name;
		this.icon = icon;
		this.teacherSocialMedias = teacherSocialMedias;
	}

	public SocialMedia() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Set<TeacherSocialMedia> getTeacherSocialMedias() {
		return teacherSocialMedias;
	}

	public void setTeacherSocialMedias(Set<TeacherSocialMedia> teacherSocialMedias) {
		this.teacherSocialMedias = teacherSocialMedias;
	}

}
