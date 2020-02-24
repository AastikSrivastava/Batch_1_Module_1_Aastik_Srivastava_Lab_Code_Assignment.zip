package com.cg.eis.bean.lab11;

public class Employee {

	private int id ;
	private float salary;
	private String name;
	private String designation;
	private String insuranceScheme;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
//	public void setInsuranceScheme(String insuranceScheme) {
//		this.insuranceScheme = insuranceScheme;
//	}in
	
	public Employee(int id, String name,float salary, String designation) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.designation = designation;

			if(salary>5000 && salary <20000 && designation.equals("System Associate"))
			{
				this.insuranceScheme = "Scheme C";
			}
			else if(salary>=20000 && salary <40000 && designation.equals("Programmer"))
			{
				this.insuranceScheme ="Scheme B";
			}
			else if(salary>=40000 && designation.equals("Manager"))
			{
				this.insuranceScheme = "Scheme A";
			}
			else if(salary<5000 && designation.equals("Clerk"))
			{
				this.insuranceScheme = "No Scheme";
			}
			
	}
	
}
