package com.horgan.gerard.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Stu_Info")
public class Student_Info {

	private int rollNo;
	private String name;

	@Id
	@Column(name = "USER_ID")
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Column(name = "USER_NAME")
	public String getName() {
		return name + " hello from the getter";
	}

	public void setName(String name) {
		this.name = name;
	}

}
