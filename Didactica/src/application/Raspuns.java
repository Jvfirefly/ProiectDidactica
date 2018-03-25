package application;

public class Raspuns {
	private int id;
	private String text;
	private Item item;
	
	public Raspuns(int ID,String TEXT,Item ITEM)
	{
		id=ID;
		text=TEXT;
		item=ITEM;
	}
	
	public int getID()
	{
		return id;
	}
	
	public String getText()
	{
		return text;
	}
	
	public Item getItem()
	{
		return item;
	}
}
