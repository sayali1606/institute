package com.cjc.ims.app.model;

public class Batch{

private int bid;
private String bname;
private Faculty faculty;

public void setBid(int bid){
	this.bid = bid;
}

public void setBname(String bname){
	this.bname = bname;
}

public void setFaculty(Faculty faculty){
	this.faculty = faculty;
}

public int getBid(){
	return bid;
}

public String getBname(){
	return bname;
}

public Faculty getFaculty(){
	return faculty;
}

}