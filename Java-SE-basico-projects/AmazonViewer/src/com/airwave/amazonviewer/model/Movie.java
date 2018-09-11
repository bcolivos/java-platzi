package com.airwave.amazonviewer.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Movie extends Film implements IVisualizable{

	private int id;
	private int timeViewed;

	public Movie(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);
		setYear(year);
	}

	public int getId() {
		return id;
	}

	public int getTimeViewed() {
		return timeViewed;
	}

	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}
	
	@Override
	public String toString() {
		return  "\n :: MOVIE ::" + 
				"\n Title: " + getTitle() +
				"\n Genero: " + getGenre() + 
				"\n Year: " + getYear() + 
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
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
		
		int dateISeconds = start.get(Calendar.MILLISECOND);
		int dateFSeconds = end.get(Calendar.MILLISECOND);
		
		if(dateFSeconds > dateISeconds) {
			setTimeViewed(dateFSeconds - dateISeconds);
		}else {
			setTimeViewed(0);
		}
		
		//deprecated
		/*if(dateF.getSeconds() > dateI.getSeconds()) {
			setTimeViewed(dateF.getSeconds() - dateI.getSeconds());
		}*/
	}
	
	public static ArrayList<Movie> makeMovieList(){
		ArrayList<Movie> movies = new ArrayList<>();
		
		for (int i = 1; i <= 5; i++) {
			movies.add(new Movie("Movie " + i, "Genre " + i, "Creator " + i, 120 + i, (short)(2017 + i)));
		}
		
		return movies;
	}

}
