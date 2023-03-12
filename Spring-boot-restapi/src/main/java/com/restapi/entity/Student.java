package com.restapi.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentdata")
public class Student { 
	@Id
	private int stdnumber;
	@Column(length=30)
	private String stdname;
	@Column(length=10)
	private long stdmobilenumber;
	@Column
	@ElementCollection(targetClass=String.class)
	List<String> stdskills;
	public Student(int stdnumber, String stdname, long stdmobilenumber, List<String> stdskills) {
		
		this.stdnumber = stdnumber;
		this.stdname = stdname;
		this.stdmobilenumber = stdmobilenumber;
		this.stdskills = stdskills;
	}
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	public int getStdnumber() {
		return stdnumber;
	}
	public void setStdnumber(int stdnumber) {
		this.stdnumber = stdnumber;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public long getStdmobilenumber() {
		return stdmobilenumber;
	}
	public void setStdmobilenumber(long stdmobilenumber) {
		this.stdmobilenumber = stdmobilenumber;
	}
	public List<String> getStdskills() {
		return stdskills;
	}
	public void setStdskills(List<String> stdskills) {
		this.stdskills = stdskills;
	}
}