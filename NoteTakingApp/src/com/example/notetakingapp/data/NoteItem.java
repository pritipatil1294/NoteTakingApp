package com.example.notetakingapp.data;

import android.annotation.SuppressLint;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class NoteItem {
	
	private String key;
	private String text;

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	@SuppressLint("SimpleDateFormat") 
	public static NoteItem getNew(){
		
		Locale locale = new Locale("en_US");
		Locale.setDefault(locale);
		
		String patten = "yyyy-MM-dd HH:mm:ss Z";
		SimpleDateFormat formatter = new SimpleDateFormat(patten);
		String key = formatter.format(new Date());
		
		NoteItem note = new NoteItem();
		note.setKey(key);
		note.setText("");
		
		return note;
	}
	
	public String toString() {
		return this.getText();
		
		
	}

	
}

