package com.cg.eis.service.lab11;

import java.util.HashMap;
import java.util.Map;

import com.cg.eis.bean.lab11.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	// TODO Auto-generated method stub
	Employee emp;

	HashMap<Integer, Employee> map1 = new HashMap<Integer, Employee>();

	@Override
	public void addEmployee(int id, String name, float salary, String designation) {
		// TODO Auto-generated method stub
		emp = new Employee(id, name, salary, designation);

		map1.put(emp.getId(), emp);

	}

	@Override
	public void display(int id) {

		if (Search(id) != null )
		{  
			emp = map1.get(id);
			System.out.println("Employee Details :");
			System.out.println();
			System.out.println("Emp ID : " + emp.getId());
			System.out.println("Emp Name : " + emp.getName());
			System.out.println("Emp Salary : " + emp.getSalary());
			System.out.println("Emp Desigantion : " + emp.getDesignation());

		} else
			System.out.println("Employee is not registered ");

	}

	public Employee Search(int id) {
		if (map1.containsKey(id)) {
			return map1.get(id);
			
		}

		else

			System.out.println(" Employee is not registered ");
		return null;
		
	}

	@Override
	public String getInsuranceScheme(int id) {
		// TODO Auto-generated method stub

		if (Search(id) != null) {
			return Search(id).getInsuranceScheme();
		}

		else
			return "Employee is not registered";
	}

	@Override
	public String getInsuranceScheme(float salary, String designation) {
		// TODO Auto-generated method stub

		System.out.println("Eligible scheme as per given criteria : ");
		if (salary > 5000 && salary < 20000 && designation.equals("System Associate")) {
			return "Scheme C";
		} else if (salary >= 20000 && salary < 40000 && designation.equals("Programmer")) {
			return "Scheme B";
		} else if (salary >= 40000 && designation.equals("Manager")) {
			return "Scheme A";
		} else if (salary < 5000 && designation.equals("Clerk")) {
			return "No Scheme";
		}

		else

			return "not found";
	}

}