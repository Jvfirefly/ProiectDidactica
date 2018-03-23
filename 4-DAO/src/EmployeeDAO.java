import java.util.List;

public interface EmployeeDAO
{
	public void addEmployee(Employee e);
	public boolean update(Employee e);
	public boolean delete(int id);
	public Employee findById(int id);
	public Employee[] getAllEmployees();
}
