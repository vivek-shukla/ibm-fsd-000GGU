package com.example.demo.model;

import java.util.List;

public class Gallary {
	private int id;
	private List<Object> listImages;
	public Gallary(int id, List<Object> listImages) {
		super();
		this.id = id;
		this.listImages = listImages;
	}
	public Gallary() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Object> getListImages() {
		return listImages;
	}
	public void setListImages(List<Object> listImages) {
		this.listImages = listImages;
	} 
	
	

}
