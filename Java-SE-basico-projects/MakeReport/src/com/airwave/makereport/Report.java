package com.airwave.makereport;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Report {

	private String nameFile;
	private String title;
	private String content;
	private String extension;

	public String getNameFile() {
		return nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public void makeReport() {
		if (getNameFile() != null && getTitle() != null && getContent() != null) {
			//Crear archivo
			try {
				File file = new File(getNameFile() + "." + getExtension());
				FileOutputStream fos = new FileOutputStream(file);		//fos: escribir bytes en un archivo/ fis: lee bytes en un archivo
				OutputStreamWriter osw = new OutputStreamWriter(fos);	//osw: convertir todos los bytes a caracteres
				BufferedWriter bw = new BufferedWriter(osw);			//bw: ayuda a escribir elementos rapido, la diferencia con el osw es que este lo crea uno por uno
				bw.write(getContent());
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}else {
			System.out.println("Ingresa los datos del archivo");
		}
	}
	
	//FileWriter: escribe caracteres en un archivo

}
