package application;

import java.util.ArrayList;

public class Test {
	private int id;
	private ArrayList<Item>denumire=new ArrayList<Item>();
	
	public Test(int ID) 
	{
		id=ID;
	}
	
	public Test(int ID,ArrayList<Item>DENUMIRE)
	{
		id=ID;
		denumire=DENUMIRE;
	}
	
	public void setDenumire(Item DENUMIRE)
	{
		denumire.add(DENUMIRE);
	}
	
	public int getId()
	{
		return id;
	}
	
	public ArrayList<Item>getDenumire()
	{
		return denumire;
	}
	
	public Item getDenumire(int Id)
	{
		for (Item index:denumire)
			if (index.getId()==Id)
				return index;
		return null;
	}
}
