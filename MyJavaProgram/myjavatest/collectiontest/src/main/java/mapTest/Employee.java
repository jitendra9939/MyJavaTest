package mapTest;

import java.util.Objects;

public class Employee {

	private Integer empId;
	private String empName;

	
	public Employee(Integer empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, empName);
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		
		return Objects.equals(this.empId, e.getEmpId())&& Objects.equals(this.empName, e.getEmpName());
	}

	
}
