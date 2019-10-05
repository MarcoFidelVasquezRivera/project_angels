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

	public void angelInstantiator(int numberAngels){

		angels = new Angel[numberAngels];

	}//fin del metodo


	public String angelCreator(String name, String photo, String prayer, int day, int month, String power, String color, double size, String essence, double illuminance){
//not finished yet
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