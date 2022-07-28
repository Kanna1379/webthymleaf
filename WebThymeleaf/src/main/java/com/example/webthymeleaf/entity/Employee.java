package com.example.webthymeleaf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee 
{ 
    @Id
	@Column(name="empno")
	private int empno;
	
	@Column(name="ename")
	private String ename;
	
	@Column(name="job")
	private String job;
	
	@Column(name="hiredate")
	private String hireDate;
	
	@Column(name="mangerid")
	private int managerId;
	
	@Column(name="salary")
	private int salary;
	
	@Column(name="commission")
	private int commission;
	
	@Column(name="deptno")
	private int deptNo;

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
   public Employee() {
	   
   }
	public Employee(int empno, String ename, String job, String hireDate, int managerId, int salary, int commission,
			int deptNo) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hireDate = hireDate;
		this.managerId = managerId;
		this.salary = salary;
		this.commission = commission;
		this.deptNo = deptNo;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job + ", hireDate=" + hireDate
				+ ", managerId=" + managerId + ", salary=" + salary + ", commission=" + commission + ", deptNo="
				+ deptNo + "]";
	}

	
	
	

}
