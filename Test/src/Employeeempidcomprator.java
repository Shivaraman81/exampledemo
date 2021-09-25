import java.util.*;
public class Employeeempidcomprator implements Comparator<Employee> {
	public int Compare(Employee e1,Employee e2)
	{
		return e1.getEmpid()-e2.getEmpid();
	}

}
