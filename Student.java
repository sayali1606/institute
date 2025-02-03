package com.cjc.ims.app.model;

public class Student{

private int sid;
private String sname;
private Batch batch;

public void setSid(int sid){
	this.sid = sid;
}

public void setSname(String sname){
	this.sname = sname;
}

public void setBatch(Batch batch){
	this.batch = batch;
}

public int getSid(){
	return sid;
}

public String getSname(){
	return sname;
}

public Batch getBatch(){
	return batch;
}


}