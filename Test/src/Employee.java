
public class Employee implements Comparable<Employee> {
	private int empid;
	private String ename;
	private double salary;

	public Employee() {
	}

	public Employee(int empid, String ename, double salary) {

		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
   public String toString()
   {
	   return empid+" "+ename+" "+" "+salary;
	   
   }
   public boolean equals(Object obj)
   {
	   if(obj instanceof Object)
	   {
		   Employee e=(Employee)obj;
		   return empid==e.empid && salary==e.salary && ename.equals(e.ename);
	   }
	   return false;
   }
   public int hashCode()
   {
	   return Integer.valueOf(empid).hashCode()+ename.hashCode()+Double.valueOf(salary).hashCode();
   }
   public int compareTo(Employee e)
   {
	   return hashCode()-e.hashCode();
   }
}


