package spring.service;

import java.net.URI;
import java.util.Date;

import spring.model.Employee;
import spring.model.Task;

public interface EmployeeWSClient {

	Employee getEmployee(String employeeId);
	
	Employee getEmployeeOnlyIfNewer(String employeeId, Date date);

	URI createEmployee(Employee employee);
	
	Task createEmployeeAsync(Employee employee);
	
	void removeEmployee(String employeeId);
	
	void updateEmployee(Employee employee);
	
}
