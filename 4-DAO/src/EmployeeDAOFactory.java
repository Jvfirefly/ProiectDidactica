
public class EmployeeDAOFactory
{
	EmployeeDAO createEmployeeDAO()
	{
		return new EmployeeDAOMySQL_Impl();
	}
}
