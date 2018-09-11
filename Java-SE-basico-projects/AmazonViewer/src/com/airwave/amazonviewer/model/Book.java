package com.airwave.amazonviewer.model;

import java.util.Calendar;
import java.util.Date;

public class Book extends Publication implements IVisualizable{
	
	private int id;
	private String isbn;
	private boolean readed;
	private int timeReaded;
	
	
	public Book(String title, Date edititionDate, String editorial, String[] authors) {
		super(title, edititionDate, editorial);
		setAuthors(authors);
	}


	public int getId() {
		return id;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public boolean isReaded() {
		return readed;
	}


	public void setReaded(boolean readed) {
		this.readed = readed;
	}


	public int getTimeReaded() {
		return timeReaded;
	}


	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}
	
	@Override
	public String toString() {
		String detailBook = "\n :: BOOK ::" + 
							"\n Title: " + getTitle() +
							"\n Editorial: " + getEditorial() + 
							"\n Edition Date: " + getEdititionDate() +
							"\n Authors: ";
		for (int i = 0; i < getAuthors().length; i++) {
			detailBook += "\t" + getAuthors()[i];
		}
		return  detailBook;
	}


	@Override
	public Date startToSee(Date dateI) {
		return dateI;
	}


	@Override
	public void stopToSee(Date dateI, Date dateF) {
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		
		start.setTime(dateI);
		end.setTime(dateF);
		
		int dateISeconds = start.get(Calendar.SECOND);
		int dateFSeconds = end.get(Calendar.SECOND);
		
		if(dateFSeconds > dateISeconds) {
			setTimeReaded(dateFSeconds - dateISeconds);
		}else {
			setTimeReaded(0);
		}
		
		//deprecated
		/*if(dateF.getSeconds() > dateI.getSeconds()) {
			setTimeViewed(dateF.getSeconds() - dateI.getSeconds());
		}*/
		
	}
	
}
