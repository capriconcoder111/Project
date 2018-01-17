package trng.Generics;

public interface GenericEmployeeService {
	
	void createEmployee(Employee employee);
	
	Employee findEmployee(int empId);
	
	Employee findEmployee(String name);
	
	Employee deleteEmployee(int empId);

}
