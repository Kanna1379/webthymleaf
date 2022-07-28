package com.example.webthymeleaf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department {
	
    @Id
	@Column(name="deptno")
	private int deptNo;
	 
	@Column(name="deptname")
	private String deptName;
	
	@Column(name="location")
	private String loc;

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Department() {
		
	}

	public Department(int deptNo, String deptName, String loc) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + ", loc=" + loc + "]";
	}
	
	
}

