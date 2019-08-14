package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Student {
  private int id;
  private String Name;
  @Autowired
  private Laptop laptop;
public Student() {
	super();
	System.out.println("The code is executed");
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
  public void display()
  {
	  System.out.println("We are Students");
	  laptop.Compile();
  }
public Laptop getLaptop() {
	return laptop;
}
public void setLaptop(Laptop laptop) {
	this.laptop = laptop;
}
}
