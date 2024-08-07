package day10;

public class Employee_class {
	
	int emp_id;
	String emp_name;
	String job;
	int salary;
	
	 void display()
	{
		System.out.println(emp_id);
		System.out.println(emp_name);
		System.out.println(job);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		
		Employee_class emp1=new Employee_class();
		emp1.emp_id=101;
		emp1.emp_name="mahi";
		emp1.job="Tester";
		emp1.salary=34000;
		emp1.display();

	}

}
