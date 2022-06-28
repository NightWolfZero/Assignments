package com.revature.demo;
 S
public class Student {
public int id;
private String name;
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
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Student() {
	super();
}

}
 