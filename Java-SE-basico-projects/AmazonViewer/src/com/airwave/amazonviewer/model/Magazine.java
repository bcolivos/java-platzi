package com.airwave.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publication{
	
	private int id;
	
	public Magazine(String title, Date edititionDate, String editorial) {
		super(title, edititionDate, editorial);
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return  "\n :: MAGAZINE ::" + 
				"\n Title: " + getTitle() +
				"\n Editorial: " + getEditorial() + 
				"\n Edition Date: " + getEdititionDate();
	}
}
