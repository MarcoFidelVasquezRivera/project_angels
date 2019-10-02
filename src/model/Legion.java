package model;

public class Legion{

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//			atributes
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Angel[] angels;
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//			methods
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++

	public void angelInstantiator(int numberAngels){

		angels = new Angel[numberAngels];

	}//fin del metodo


	public String angelCreator(String name, String photo, String prayer, int day, int month, String power, String color, double size, String essence, double illuminance){
//not finished yet
		Date date= angels[0].addDate(month,day);
		Candle candle= angels[0].addCandle(color, size, essence, illuminance);
		int count=0;
		boolean flag=false;
		boolean condition=false;
		boolean operation=false;
		String message="";

		if(name.substring(name.length()-2,name.length()).equalsIgnoreCase("el")){
			while(count<angels.length && !condition){

				if(angels[count]==null){
					condition=true;
				}
				else{
					if(angels[count].getName().equalsIgnoreCase(name)){
						operation=true;
						message="un angel con el mismo nombre ya ha sido ingresado al programa";
					}
					else if(angels[count].getPower().equalsIgnoreCase(power)){
						operation=true;
						message="un angel con el mismo poder ya ha sido ingresado al programa";
					}
				}
				count++;
			}//fin del bucle

			count=0;

			while(count<angels.length && !flag && operation==false){

				if(angels[count]==null){

					angels[count]=new Angel(name,photo,prayer,date,power,candle);
					flag=true;
					message="el angel ha sido guandado con exito";
				}//fin del condicional

				count++;
			}//fin del bucle
		}
		else{
			message="el nombre del angel no termina en el";
		}

		return message;
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