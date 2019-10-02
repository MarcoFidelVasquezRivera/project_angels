package model;

public class Angel{
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//			atributes
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private String name;//debe terminar en la silaba "el"
	private String photo;
	private String prayer;
	private Date date;
	private String power;
	private Candle candle;
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//			methods
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public Angel(String name, String photo, String prayer, Date date, String power, Candle candle){

		this.name=name;
		this.photo=photo;
		this.prayer=prayer;
		this.date=date;
		this.power=power;
		this.candle=candle;

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

	public Date addDate(int month, int day){
		Date date= new Date(month,day);

		return date;
	}

	public Candle addCandle(String color, double size, String essence, double illuminance){
		Candle candle= new Candle(color, size, essence, illuminance);

		return candle;
	}
		
}//fin de la clase