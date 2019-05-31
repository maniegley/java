import java.util.Scanner;

public class xplore17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empid, age;
		String empname, designation;
		double salary;
		Employee[] emp = new Employee[3]; //Initialised the Array Object..
		for(int i=0; i<3; i++) {
			empid = sc.nextInt();
			sc.nextLine();
			empname = sc.nextLine();
			age = sc.nextInt();
			sc.nextLine();
			designation = sc.nextLine();
			salary = sc.nextInt();
			emp[i] = new Employee(empid, empname, age, designation, salary);
		}
		
		emp = updateSalary(emp);   // call the method
		for(int j=0; j<3; j++) {
			System.out.println(emp[j].getEmpId()+"    "+emp[j].getEmpName()+"   "+emp[j].getAge()+"  "+emp[j].getDesignation()+"   "+emp[j].getSalary());
		}
	}

	public static Employee[] updateSalary(Employee[] emp) {
		int i=0;
		while(i<3) {
			if(emp[i].getDesignation().equals("Manager"))
				emp[i].setSalary(emp[i].getSalary()+emp[i].getSalary()*0.10);
			if(emp[i].getDesignation().equals("Leader"))
				emp[i].setSalary(emp[i].getSalary()+emp[i].getSalary()*0.15);
			if(emp[i].getDesignation().equals("Trainee"))
				emp[i].setSalary(emp[i].getSalary()+emp[i].getSalary()*0.20);
			i++;
		}
		return emp;
	}

	

}

class Employee{
	private int empid, age;
	private String empname, designation;
	private double salary;
	
	public Employee(int empid, String empname, int age, String designation, double salary) {
		this.empid = empid;
		this.empname = empname;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
	}

	public void setDesignation(String designation) {
		// TODO Auto-generated method stub
		this.designation = designation;
		
	}

	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age = age;
		
	}

	public void setEmpName(String empname) {
		// TODO Auto-generated method stub
		this.empname = empname;
		
	}

	public void setEmpId(int empid) {
		// TODO Auto-generated method stub
		this.empid = empid;
		
	}

	public String getEmpName() {
		// TODO Auto-generated method stub
		return empname;
	}

	public int getEmpId() {
		// TODO Auto-generated method stub
		return empid;
	}

	public void setSalary(double salary) {
		this.salary = salary;
		
	}

	public double getSalary() {
		
		return salary;
	}

	public int getAge() {
		
		return age;
	}

	public String getDesignation() {
		// TODO Auto-generated method stub
		return designation;
	}
	
	
	
}
