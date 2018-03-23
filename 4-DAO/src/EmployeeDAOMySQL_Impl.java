import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOMySQL_Impl implements EmployeeDAO
{
	
	public static final String CONNECTION_URL = "jdbc:mysql://localhost/employee_db";

	@Override
	public void addEmployee(Employee emp)
	{
		try
		{
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into employees(name) values(?)", Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, emp.getName());
			int affectedRows = ps.executeUpdate();
			ResultSet rs = ps.getGeneratedKeys();
			if(rs.next())
			{
				emp.setId(rs.getInt(1));
			}
			closeConnection(conn);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}	
	}

	@Override
	public boolean update(Employee emp)
	{
		try
		{
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("update employees set name = ? where id = ?");
			ps.setString(1, emp.getName());
			ps.setInt(2, emp.getId());
			int affectedRows = ps.executeUpdate();
			closeConnection(conn);
			return affectedRows == 1;
		}
		catch(SQLException e)
		{
			return false;
		}
	}

	@Override
	public boolean delete(int id)
	{
		try
		{
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("delete from employees where id = ?");
			ps.setInt(1, id);
			int affectedRows = ps.executeUpdate();
			closeConnection(conn);
			return affectedRows == 1;
		}
		catch(SQLException e)
		{
			return false;
		}
	}

	@Override
	public Employee findById(int id)
	{
		Employee emp = null;
		try
		{
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from employees where id = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				int id2 = rs.getInt("id");
				String name= rs.getString("name");
				emp = new Employee(id2, name);
			}
			closeConnection(conn);
			return emp;
		}
		catch(SQLException e)
		{
			return null;
		}
	}

	@Override
	public Employee[] getAllEmployees()
	{
		try
		{
			Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from employees");
			ResultSet rs = ps.executeQuery();
			List<Employee> employeeList = new ArrayList<Employee>();
			while(rs.next())
			{
				int id = rs.getInt("id");
				String name= rs.getString("name");
				employeeList.add(new Employee(id, name));
			}
			closeConnection(conn);
			return employeeList.toArray(new Employee[employeeList.size()]);
		}
		catch(SQLException e)
		{
			return null;
		}
	}
	
	public Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(CONNECTION_URL, "root", "");
	}
	
	public void closeConnection(Connection conn) throws SQLException
	{
		conn.close();
	}

}
