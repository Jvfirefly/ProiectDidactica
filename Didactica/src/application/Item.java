package application;

import java.util.ArrayList;

public class Item {
	private int id;
	private String text;
	private ArrayList<Raspuns> raspunsuri=new ArrayList<Raspuns>();
	
	public Item(int ID, String TEXT)
	{
		id=ID;
		text=TEXT;
	}
	
	public Item(int ID, String TEXT,ArrayList<Raspuns>Raspuns)
	{
		id=ID;
		text=TEXT;
		raspunsuri=Raspuns;
	}
	
	public void setRaspunsuri(Raspuns RASPUNSURI)
	{
		raspunsuri.add(RASPUNSURI);
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getText()
	{
		return text;
	}
	
	public ArrayList<Raspuns> getRaspunsuri()
	{
		return raspunsuri;
	}
	
	public Raspuns getRaspunsur(int id)
	{
		for (Raspuns index : raspunsuri)
			if (index.getID()==id)
				return index;
		return null;
	}
}
