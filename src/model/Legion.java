package model;

public class Legion{

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//			atributes
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Angel[] angels;
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//			methods
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++

	//que el metodo para agregar angeles sea de uno en uno

	public void angelInstantiator(int numberAngels){

		angels = new Angel[numberAngels];

	}//fin del metodo


	public void angelCreator(String name, String photo, String prayer, int day, int month, String power, String color, double size, String essence, double illuminance){

		Date date= new Date(month, day);
		Candle candle= new Candle(color, size, essence, illuminance);
		

	}//fin del metodo


	public int count(){

		int count=0;
		while(angels[count]!=null && count<angels.length){

			count++;
		}
		return count;
	}//fin del metodo


	public void informationName(String name){

		for(int i=0;i<angels.length-1;i++){

			if(angels[i].getName().equalsIgnoreCase(name)){

				System.out.println(angels[i].getName());
				System.out.println(angels[i].getPhoto());
				System.out.println(angels[i].getPrayer());
				System.out.println(angels[i].getDate().getMonth());
				System.out.println(angels[i].getDate().getDay());
				System.out.println(angels[i].getPower());
				System.out.println(angels[i].getCandle().getColor());
				System.out.println(angels[i].getCandle().getSize());
				System.out.println(angels[i].getCandle().getEssence());
				System.out.println(angels[i].getCandle().getIlluminance());
			}//fin del condicional

		}//fin del bucle

	}//fin del metodo


	public void informationPower(String power){

		for(int i=0;i<angels.length-1;i++){

			if(angels[i].getPower().equalsIgnoreCase(power)){

				System.out.println(angels[i].getName());
				System.out.println(angels[i].getPhoto());
				System.out.println(angels[i].getPrayer());
				System.out.println(angels[i].getDate().getMonth());
				System.out.println(angels[i].getDate().getDay());
				System.out.println(angels[i].getPower());
				System.out.println(angels[i].getCandle().getColor());
				System.out.println(angels[i].getCandle().getSize());
				System.out.println(angels[i].getCandle().getEssence());
				System.out.println(angels[i].getCandle().getIlluminance());

			}//fin del condicional

		}//fin del bucle

	}//fin del metodo

 	public void celebrationMonth(String month){

 		for(int i=0;i<angels.length;i++){

 			if(converterMonthString(i).equalsIgnoreCase(month)){

 				System.out.println(angels[i].getName());
 				System.out.println(angels[i].getDate().getDay());
 				System.out.println(angels[i].getCandle().getColor());
 				System.out.println(angels[i].getCandle().getEssence());

 			}//fin del condicional

 		}//fin del bucle

 	}//fin dle metodo

public String allCelebrations(){
	String celebrations="";

	for(int i=0;i<angels.length;i++){
		if(i>0){
			celebrations=celebrations+",";
		}

		celebrations=celebrations+angels[i].getName()+":"+String.valueOf(angels[i].getDate().getDay())+"de"+converterMonthString(i);

	}
	return celebrations;
}//fin del metodo

public String converterMonthString(int i){
	String month="";

	int number=angels[i].getDate().getMonth();

	switch (number){

		case 1: month="Enero";
				break;

		case 2:	month="Febrero";
				break;

		case 3: month="Marzo";
				break;

		case 4: month="Abril";
				break;

		case 5: month="Mayo";
				break;

		case 6: month="Junio";
				break;

		case 7: month="Julio";
				break;

		case 8: month="Agosto";
				break;

		case 9: month="Septiembre";
				break;

		case 10: month="Octubre";
				break;

		case 11: month="Noviembre";
				break;

		case 12: month="Diciembre";
				break;

	}//fin del switch

	return month;
}//fin del metodo



}//FIN DE LA CLASE