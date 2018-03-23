import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmployeeDAOMemoryImpl implements EmployeeDAO
{
	List<Employee> employees;
	
	public EmployeeDAOMemoryImpl()
	{
		employees = new ArrayList<Employee>();
	}

	@Override
	public void addEmployee(Employee e)
	{
		employees.add(e);
	}

	@Override
	public boolean update(Employee e)
	{
		Employee emp = findById(e.getId());
		if(emp !=null )
		{
			emp.setName(e.getName());
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id)
	{
		for(int i=0;i<employees.size();i++)
			if(employees.get(i).getId()==id)
			{
				employees.remove(i);
				return true;
			}
		return false;
	}

	@Override
	public Employee findById(int id)
	{
		for(Employee emp:employees)
			if(emp.getId() == id)
				return emp;
		return null;
	}

	@Override
	public Employee[] getAllEmployees()
	{
		return employees.toArray(new Employee[employees.size()]);
	}
	
}
