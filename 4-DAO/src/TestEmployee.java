
public class TestEmployee
{
	public static void main(String[] args)
	{
		EmployeeDAOFactory empDAOFactory = new EmployeeDAOFactory();
		EmployeeDAO eDAO = empDAOFactory.createEmployeeDAO();
		
		Employee e1 = new Employee(1, "Gigi");
		Employee e2 = new Employee(2, "Ioana");
		eDAO.addEmployee(e1);
		eDAO.addEmployee(e2);
//		
//		Employee foundEmp = eDAO.findById(1);
//		foundEmp.setName("Cristina");
//		eDAO.update(foundEmp);
		
		for(Employee e:eDAO.getAllEmployees())
			System.out.println(e);
	}
}
