package model;

public class Legion{

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//					ATRIBUTES
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Angel[] angels;
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++
//					METHODS
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++

	public Legion(){

	}

/**
*<b>Name:</b> angelInstantiator.<br>
*This method make an array with the number of angels that the user is going to save.<br>
*<b>Pre:</b> user has entered the number of angels that is going to save.<br>
*@param numberAngels number of angels that is going to save in the array.<br>
*<b>Pos:</b> array has been made.<br>
*/
	public void angelInstantiator(int numberAngels){

		angels = new Angel[numberAngels];

	}//fin del metodo

/**
*<b>Name:</b> angelCreator.<br>
*This method save an angel into the array.<br>
*@param name the name of the angel, that must finish on "el". <br>
*@param photo the direction where is the foto of the angel.<br>
*@param prayer the prayer of the angel.<br>
*@param day the day when is the celebration of the angel.<br>
*@param month the month when is the celebration of the angel.<br>
*@param power the power of the angel.<br>
*@param color the color of the candle for the angel.<br>
*@param size the size of the candle for the angel.<br>
*@param essence the essence of the candle for tha angel.<br>
*@param illuminance the iluminance of the candle for the angel.<br>
*<b>Pos:</b> angel has been created.<br>
*@return return a message saying if the angel has been created or happened an error<br>
*/
	public String angelCreator(String name, String photo, String prayer, int day, int month, String power, String color, double size, String essence, double illuminance){

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
						message="an angel with the same name already exist";
					}
					else if(angels[count].getPower().equalsIgnoreCase(power)){
						operation=true;
						message="an angel with the same power already exist";
					}
				}
				count++;
			}//fin del bucle

			count=0;

			while(count<angels.length && !flag && operation==false){

				if(angels[count]==null){
					
					angels[count]=new Angel(name,photo,prayer,day,month,power, color, size, essence, illuminance);
					flag=true;
					message="angel has been saved";
				}//fin del condicional

				count++;
			}//fin del bucle
		}
		else{
			message="the name of the angel doesn't finish in <el>, could not be saved";
		}

		if(angels[(angels.length-1)]!=null){
			message="the program is full, can not save more angels";
		}

		return message;
		}//fin del metodo

/**
*<b>Name:</b> count.<br>
*This count the number of angels saved.<br>
*<b>Pre:</b> array must have a minimum of one angel.<br>
*<b>Pos:</b> method has counted the number of angels saved.<br>
*@return the method return the number of angels saved.<br>
*/
	public int count(){

		int count=0;
		if(angels[(angels.length-1)]!=null){

			count=angels.length;
		}
		else{
			while(angels[count]!=null && count<angels.length){

				count++;
			}
		}
		return count;
	}//fin del metodo

/**
*<b>Name:</b> informationName.<br>
*This method shows the information of an angel by name.<br>
*<b>Pre:</b> array must have a minimum of one angel.<br>
*@param name the name of the angel.<br>
*<b>Pos:</b> information about the angel has been showed, if the angel doesn'n exist then show an error message.<br>
*/
	public void informationName(String name){
		int condition=0;
		String month="";
		int numberMonth=0;


		for(int i=0;i<angels.length;i++){

			if(angels[i]!=null){

				if(angels[i].getName().equalsIgnoreCase(name)){

					System.out.println("Name: "+angels[i].getName());
					System.out.println("photo: "+angels[i].getPhoto());
					System.out.println("prayer: "+angels[i].getPrayer());
					numberMonth=angels[i].getDate().getMonth();
					month="Month: "+converterMonthString(numberMonth);
					System.out.println(month);
					System.out.println("Day: "+angels[i].getDate().getDay());
					System.out.println("Power: "+angels[i].getPower());
					System.out.println("Color of candle: "+angels[i].getCandle().getColor());
					System.out.println("Size of candle: "+angels[i].getCandle().getSize());
					System.out.println("Essence of candle: "+angels[i].getCandle().getEssence());
					System.out.println("Illuminance of candle: "+angels[i].getCandle().getIlluminance());
					condition=1;
				}//fin del condicional

			}//fin del condicional

		}//fin del bucle
		if(condition==0){
			System.out.println("angel has not been found");
		}//fin del condicional

	}//fin del metodo

/**
*<b>Name:</b> informationPower.<br>
*This method shows the information of an angel by power.<br>
*<b>Pre:</b> array must have a minimum of one angel.<br>
*@param power the power of the angel.<br>
*<b>Pos:</b> information about the angel has been showed, if the angel doesn'n exist then show an error message.<br>
*/
	public void informationPower(String power){
		String month="";
		int condition=0;
		int numberMonth=0;

		for(int i=0;i<angels.length;i++){

			if(angels[i]!=null){

				if(angels[i].getPower().equalsIgnoreCase(power)){

					System.out.println("Name: "+angels[i].getName());
					System.out.println("photo: "+angels[i].getPhoto());
					System.out.println("prayer: "+angels[i].getPrayer());
					numberMonth=angels[i].getDate().getMonth();
					month="Month: "+converterMonthString(numberMonth);
					System.out.println(month);
					System.out.println("Day: "+angels[i].getDate().getDay());
					System.out.println("Power: "+angels[i].getPower());
					System.out.println("Color of candle: "+angels[i].getCandle().getColor());
					System.out.println("Size of candle: "+angels[i].getCandle().getSize());
					System.out.println("Essence of candle: "+angels[i].getCandle().getEssence());
					System.out.println("Illuminance of candle: "+angels[i].getCandle().getIlluminance());
					condition=1;

				}//fin del condicional

			}//fin del condicional

		}//fin del bucle
		if(condition==0){
			System.out.println("angel has not been found");
		}//fin del condicional

	}//fin del metodo

/**
*<b>Name:</b> celebrationMonth.<br>
*This method shows the celebrations to do in a month.<br>
*<b>Pre:</b> array must have a minimum of one angel.<br>
*@param month the month where the method is going to look for the celebrations.<br>
*<b>Pos:</b> the method has showed the celebrations to do in the month.<br>
*/
 	public void celebrationMonth(int month){

 		for(int i=0;i<angels.length;i++){

 			if(angels[i]!=null){

	 			if(angels[i].getDate().getMonth()==month){
	 				if(i>0){
	 					System.out.println("+++++++++++++++++++++++++++++");
	 				}
	 				System.out.println("Name of angel: "+angels[i].getName());
	 				System.out.println("Day of celebration: "+angels[i].getDate().getDay());
	 				System.out.println("Color of candle: "+angels[i].getCandle().getColor());
	 				System.out.println("Essence of candle: "+angels[i].getCandle().getEssence());
	
	 			}//fin del condicional

	 		}//fin del condicional

 		}//fin del bucle


 	}//fin dle metodo
/**
*<b>Name:</b> allCelebrations.<br>
*This method shows all the celebrations to do.<br>
*<b>Pre:</b> array must have a minimum of one angel.<br>
*<b>Pos:</b> the method has showed all the celebrations.<br>
*@return the method return a String with the celebrations to do and their information.<br>
*/
	public String allCelebrations(){
		String celebrations="";
		int month=0;

		for(int i=0;i<angels.length;i++){

			if(angels[i]!=null){
				if(i>0){
					celebrations=celebrations+",";
				}
				month=angels[i].getDate().getMonth();
				celebrations=celebrations+angels[i].getName()+":"+String.valueOf(angels[i].getDate().getDay())+" de "+converterMonthString(month);

			}//fin del condicional

		}//fin del bucle
		return celebrations;
	}//fin del metodo

/**
*<b>Name:</b> converterMonthString.<br>
*This method converts the number of a month in his name.<br>
*@param i the number of the month.<br>
*<b>Pos:</b> the methos has converted the number in the name of the month.<br>
*@return the name of the month.<br>
*/
	public String converterMonthString(int i){
		String month="";

		switch (i){

			case 1: month="January";
					break;

			case 2:	month="February";
					break;

			case 3: month="March";
					break;

			case 4: month="April";
					break;

			case 5: month="May";
					break;

			case 6: month="June";
					break;

			case 7: month="July";
					break;

			case 8: month="August";
					break;

			case 9: month="September";
					break;

			case 10: month="October";
					break;

			case 11: month="November";
					break;

			case 12: month="December";
					break;

		}//fin del switch

		return month;
	}//fin del metodo

}//FIN DE LA CLASE