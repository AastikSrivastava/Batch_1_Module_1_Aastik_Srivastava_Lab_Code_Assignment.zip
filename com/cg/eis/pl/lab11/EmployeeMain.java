package com.cg.eis.pl.lab11;

import com.cg.eis.bean.lab11.Employee;
import com.cg.eis.service.lab11.EmployeeService;
import com.cg.eis.service.lab11.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-geerated method stub

		EmployeeService service = new EmployeeServiceImpl();
		int id[] = { 1001, 1002, 1003, 1004 };
		String name[] = { "ABES", "AKG ", "JSS ", "RKGIT " };
		float salary[] = { 55000, 6000, 4000, 25000 };
		String designation[] = { "Manager", "System Associate", "Clerk", "Programmer" };

		for (int i = 0; i < 4; i++) {
			service.addEmployee(id[i], name[i], salary[i], designation[i]);

		}

		service.display(1001);
		System.out.println();
		System.out.println(service.getInsuranceScheme(1004));
		System.out.println();
		
		System.out.println(service.getInsuranceScheme(6000,"System Associate"));

	}

}
