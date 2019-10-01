package model;

public class Date{

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//			atributes
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++	
	private int month;
	private int day;
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//			methods
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public Date(int month, int day){
		
		this.month=month;
		this.day=day;
		
	}//fin del metodo
	
	
	public int getMonth(){
		
		return month;
		
	}//fin del metodo
	
	
	public void setMonth(int month){
		
		this.month=month;
		
	}//fin del metodo
	
	public int getDay(){
		
		return day;
		
	}//fin del metodo
		
		
	public void setDay(int day){

		this.day=day;

	}//fin del metodo
	
}//fin de la clase