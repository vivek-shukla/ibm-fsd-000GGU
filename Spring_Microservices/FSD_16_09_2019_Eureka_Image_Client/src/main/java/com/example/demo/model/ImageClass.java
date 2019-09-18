package com.example.demo.model;

public class ImageClass {
 
  private int id;
  private String name;
  private String url;
	public ImageClass(int id, String name, String url) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
	}
	public ImageClass() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
  
  
  
}
