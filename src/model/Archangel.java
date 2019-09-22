public class Archangel{
	
	private String name;//debe terminar en la silaba "el"
	private String photo;
	private String prayer;
	private Date date;
	private String power;
	private Candle candle;
	
	public Archangel(String name, String photo, String prayer, Date date, String power, Candle candle){

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


	public void sertDate(Date date){

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
	

	public void setCandle(){

		this.candle=candle;

	}//fin del metodo
		
}//fin de la clase