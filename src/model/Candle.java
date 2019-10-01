package model;

public class Candle{

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//			atributes
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private String color;
	private double size;
	private String essence;
	private double illuminance;
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//			methods
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public Candle(String color, double size, String essence, double illuminance){
		
		this.color=color;
		this.size=size;
		this.essence=essence;
		this.illuminance=illuminance;
			
	}//fin metodo
	
	
	public String getColor(){
	
		return color;
	
	}//fin metodo
	
	
	public void setColor(String color){
		
		this.color=color;
	
	}//fin metodo
	
	
	public double getSize(){
		
		return size;
		
	}//fin metodo
	
	
	public void setSize(double size){
		
		this.size=size;
		
	}//fin metodo
	
	
	public String getEssence(){
		
		return essence;
		
	}//fin metodo
	
	
	public void setEssence(String essence){
		
		this.essence=essence;
		
	}//finb metodo
	
	
	public double getIlluminance(){
	
		return illuminance;
	
	}//fin metodo
	
	
	public void setIlluminance(double illuminance){
		
		this.illuminance=illuminance;
		
	}//fin metodo
	
	
}//FIN DE LA CLASE