package ui;
import model.*;
import java.util.Scanner;

public class Main{

//++++++++++++++++++++++++++++++++++++++++++++++
//					ATRIBUTES
//++++++++++++++++++++++++++++++++++++++++++++++
	public Legion legion;
	public Scanner reader= new Scanner(System.in);
	public Scanner readerTwo=new Scanner(System.in);
	public Scanner readerThree=new Scanner(System.in);
//++++++++++++++++++++++++++++++++++++++++++++++
//					METHODS
//++++++++++++++++++++++++++++++++++++++++++++++

	public Main(){
		legion=new Legion();
	}//fin del metodo


	public static void main(String[]args){

		Main main= new Main();
		boolean continuer=true;
		int operation=0;
		int quantity=0;
		String name="";
		String photo="";
		String prayer="";
		int month=0;
		int day=0;
		String power="";
		String color="";
		double size=0.0;
		String essence="";
		double illuminance=0.0;
		main.welcomeMenu();

		quantity=main.readerTwo.nextInt();
		while(quantity<0){
			System.out.println("quantity must be zero or higher");
			quantity=main.readerTwo.nextInt();
		}//fin del bucle
		main.legion.angelInstantiator(quantity);
		main.init();

		while(continuer==true){

			main.showMenu();//muestro el menu principal
			operation=main.readerTwo.nextInt();
			while(operation<0 || operation>7){
				System.out.println("the number entered must be between one and seven");
				operation=main.readerTwo.nextInt();
			}//fin del bucle

			switch(operation){

				case 1: main.firstMenu();
						break;



				case 2: main.secondMenu();
						break;



				case 3:	main.thirdMenu();
						break;



				case 4:	main.fourthMenu();
						break;



				case 5:	main.fifthMenu();
						break;



				case 6:	main.sixthMenu();
						break;



				case 7:	continuer=false;
						break;


			}//fin del switch
		}//fin del bucle
	}//fin del metodo
/**
*<b>Name:</b> welcomeMenu.<br>
*This method welcome the user and ask for the number of angels tha the user is going to save.<br>
*<b>Pos:</b> the welcome message has been showed.<br>
*/

	public void welcomeMenu(){
	
		System.out.println("Welcome");
		System.out.println("please enter the quantity of angels that you are going to save");
	
	}//fin del metodo

/**
*<b>Name:</b> showMenu.<br>
*This method shows the principal menu.<br>
*<b>Pos:</b> the principal menu has been showed.<br>
*/
	public void showMenu(){
	
		System.out.println("please enter the funtion that you want to do");
		System.out.println("1:Enter a new anchangel");
		System.out.println("2:count the number of angels entered");
		System.out.println("3:show the information of an angel by name");
		System.out.println("4:show the information of an angel by power");
		System.out.println("5:show the celebrations to do by month");
		System.out.println("6:show al the celebrations");
		System.out.println("7:exit");	

	}//fin del metodo

/**
*<b>Name:</b> firsthMenu.<br>
*This method shows the menu, get the information to save a new angel and show a message if the angel has been save or has happened an error.<br>
*<b>Pos:</b> the menu to save a new angel has been showed.<br>
*/
	public void firstMenu(){
		String name="";
		String photo="";
		String prayer="";
		int day=0;
		int month=0;
		String power="";
		String color="";
		double size=0.0;
		String essence="";
		double illuminance=0.0;
		String message="";
		System.out.println("please enter the name of the angel:");
		name=reader.next();

		System.out.println("please enter the address where is the photo of the angel:");
		photo=reader.next();

		System.out.println("please enter the prayer of the angel:");
		prayer=readerThree.nextLine();

		System.out.println("please enter the day when is the celebration of this angel:");
		day=readerTwo.nextInt();

		System.out.println("please enter the month(number) when is the celebration of this angel:");
		month=reader.nextInt();
		while(month<=0 && month>0){
			System.out.println("the number entered must be between one and twelve");
			month=reader.nextInt();
		}

		System.out.println("please enter the power of the angel:");
		power=readerTwo.next();

		System.out.println("please enter the color of the candle:");
		color=readerTwo.next();

		System.out.println("please enter the size of the candle in cm:");
		size=reader.nextDouble();

		System.out.println("please enter the essence of the candle:");
		essence=readerTwo.next();

		System.out.println("please enter de illuminance ogf the candle in lux:");
		illuminance=reader.nextDouble();

		message=legion.angelCreator(name, photo, prayer, day, month, power, color, size, essence, illuminance);
		System.out.println(message);
		System.out.println("");
		System.out.println("");

	}//fin del metodo

/**
*<b>Name:</b> secondMenu.<br>
*This method shows the menu to count the number of angels.<br>
*<b>Pos:</b> the menu and the number of angels have been showed.<br>
*/
	public void secondMenu(){
		int count=0;

		count=legion.count();
		System.out.println("The number of angels is: "+count);
		System.out.println("");
		System.out.println("");

	}//fin del metodo

/**
*<b>Name:</b> thirdMenu.<br>
*This method shows the menu to show information of an angel by name.<br>
*<b>Pos:</b> the menu has been showed.<br>
*/
	public void thirdMenu(){
		String name="";
		System.out.println("Please enter the name of the archangel:");
		name=readerTwo.next();
		legion.informationName(name);
		System.out.println("");
		System.out.println("");

	}//fin del metodo

/**
*<b>Name:</b> fourthMenu.<br>
*This method shows the menu to show information of an angel by power.<br>
*<b>Pos:</b> the menu has been showed.<br>
*/
	public void fourthMenu(){
		String power="";
		System.out.println("please enter the power of the archangel:");
		power=readerTwo.next();
		legion.informationPower(power);
		System.out.println("");
		System.out.println("");

	}//fin del metodo

/**
*<b>Name:</b> fifthMenu.<br>
*This method shows the menu to show the celebrations to do by month.<br>
*<b>Pos:</b> the menu has been showed.<br>
*/
	public void fifthMenu(){
		int month=0;
		while(month<=0 && month>12){

			System.out.println("the number entered must be between one and twelve");

		}//fin del condicional

		System.out.println("please enter the month(number)");
		month=reader.nextInt();
		legion.celebrationMonth(month);

	}//fin del metodo

/**
*<b>Name:</b> thirdMenu.<br>
*This method shows all the celebrations to do.<br>
*<b>Pos:</b> the celebrations have been showed.<br>
*/
	public void sixthMenu(){
		String message="";
		message=legion.allCelebrations();
		System.out.println(message);

	}//fin del metodo

/**
*<b>Name:</b> init.<br>
*This method save an angel by default.<br>
*<b>Pos:</b> the angel has been showed.<br>
*/
	public void init(){

		String name="Azrael";
		String photo="www.dgedfgea.com";
		String prayer="melo caramelo";
		int day=2; 
		int month=5; 
		String power="perro"; 
		String color="verde"; 
		double size=5.2;
		String essence="limon"; 
		double illuminance=5.4;

		legion.angelCreator(name, photo, prayer, day, month, power, color, size, essence, illuminance);

	}//fin del metodo


}//FIN DE LA CLASE