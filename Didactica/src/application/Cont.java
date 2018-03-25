package application;

import java.util.ArrayList;

public class Cont {
	private int id;
	private String username;
	private String password;
	private String nume;
	private String prenume;
	private boolean profesor;
	private ArrayList<Clasa>clasa=new ArrayList<Clasa>();
	
	public Cont(int ID,String USERNAME,String PASSWORD,String NUME,String PRENUME,boolean PROFESOR)
	{
		id=ID;
		username=USERNAME;
		password=PASSWORD;
		nume=NUME;
		prenume=PRENUME;
		profesor=PROFESOR;
	}
	
	public Cont(int ID,String USERNAME,String PASSWORD,String NUME,String PRENUME,boolean PROFESOR,ArrayList<Clasa>CLASA)
	{
		id=ID;
		username=USERNAME;
		password=PASSWORD;
		nume=NUME;
		prenume=PRENUME;
		profesor=PROFESOR;
		clasa=CLASA;
	}
	
	public void setClasa(Clasa CLASA)
	{
		clasa.add(CLASA);
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String getNume()
	{
		return nume;
	}
	
	public String getPrenume()
	{
		return prenume;
	}
	
	public boolean getProfesor()
	{
		return profesor;
	}
	
	public ArrayList<Clasa>getClasa()
	{
		return clasa;
	}
	
	public Clasa getClas(int id)
	{
		for (Clasa index : clasa)
		{
			if(index.getId()==id)
				return index;
		}
		return null;
	}
}
