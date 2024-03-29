package model;

public class Angel{
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//						ATRIBUTES
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private String name;//debe terminar en la silaba "el"
	private String photo;
	private String prayer;
	private Date date;
	private String power;
	private Candle candle;
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//						METHODS
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public Angel(String name, String photo, String prayer, int day, int month, String power, String color, double size, String essence, double illuminance){

		date=new  Date(month,day);
		candle= new Candle(color,size,essence,illuminance);
		this.name=name;
		this.photo=photo;
		this.prayer=prayer;
		this.power=power;
		

	}//fin del metodo constructor
	
	public String getName(){

		return name;

	}//fin del metodo


	public void setName(String name){

		this.name=name;

	}//fin del metodo


	public String getPhoto(){

		return photo;

	}//fin del metodo
	
	
	public void setPhoto(String photo){

		this.photo=photo;

	}//fin del metodo
	

	public String getPrayer(){

		return prayer;

	}


	public void setPrayer(String prayer){

		this.prayer=prayer;

	}//fin del metodo


	public Date getDate(){

		return date;

	}//fin de metodo


	public void setDate(Date date){

		this.date=date;

	}//fin del metodo


	public String getPower(){

		return power;

	}//fin del metodo


	public void setPower(String power){

		this.power=power;

	}//fin del metodo


	public Candle getCandle(){

		return candle;

	}//fin del metodo
	

	public void setCandle(Candle candle){

		this.candle=candle;

	}//fin del metodo
		
}//fin de la clase