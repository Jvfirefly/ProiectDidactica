package application;

public class Clasa {
	private int id;
	private int an;
	private char identificator;
	private double medie;
	
	public Clasa(int ID,int AN,char IDENTIFICATOR,double MEDIE)
	{
		id=ID;
		an=AN;
		identificator=IDENTIFICATOR;
		medie=MEDIE;
	}
	
	public int getId()
	{
		return id;
	}
	
	public int getAn()
	{
		return an;
	}
	
	public char getIdentificator()
	{
		return identificator;
	}
	
	public double getMedie()
	{
		return medie;
	}
}
