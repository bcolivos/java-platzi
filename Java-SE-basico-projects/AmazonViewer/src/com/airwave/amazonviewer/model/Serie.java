package com.airwave.amazonviewer.model;

import java.util.ArrayList;

public class Serie extends Film{
	
	private int id;
	private int seasonQuality;
	private ArrayList<Chapter> chapters;
	
	public Serie(String title, String genre, String creator, int duration, int seasonQuality, ArrayList<Chapter> chapters) {
		super(title, genre, creator, duration);
		this.seasonQuality = seasonQuality;
		this.chapters = chapters;
	}
	
	public int getId() {
		return id;
	}

	public int getSeasonQuality() {
		return seasonQuality;
	}

	public void setSeasonQuality(int seasonQuality) {
		this.seasonQuality = seasonQuality;
	}
	
	public ArrayList<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}

	@Override
	public String toString() {
		return  "\n :: SERIE ::" + 
				"\n Title: " + getTitle() +
				"\n Genero: " + getGenre() + 
				"\n Year: " + getYear() + 
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
	}
	
	public static ArrayList<Serie> makeSeriesList() {
		ArrayList<Serie> series = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			series.add(new Serie("Serie "+i, "genero "+i, "creador "+i, 1200, 5, Chapter.makeChaptersList()));
			
		}
		
		return series;
	}

}
