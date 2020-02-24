package com.cg.eis.service.lab11;

public interface EmployeeService {

	
  public void addEmployee(int id, String name , float salary , String designation);
  
  public void display(int id);
  
  public String getInsuranceScheme(int id);
  
  public String getInsuranceScheme(float salary , String designation);
  
	
}
