package org.emp;

public class Employee {
	public void empId(int id) {
System.out.println("Employee Id:"+id);
	}
	public void empId(String name ) {
		System.out.println("Employee Name:"+name);

	}
	public void empId(int phno,String emailid) {
		System.out.println("Employee phone no:"+phno);
		System.out.println("Employee EmailId:"+emailid);

	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empId(123);
		emp.empId("xxx");
		emp.empId(98734526, "www@gmail.com");
		
	}
}
