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
//++++++++++++++++++++++++++++++++++++++++++++++
//					METHODS
//++++++++++++++++++++++++++++++++++++++++++++++

	public Main(){

	}//fin del metodo


	public static void main(System[]args){

		Main main= new Main();
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

		main.legion.angelInstantiator(quantity);





	}//fin del metodo


	public void welcomeMenu(){
	
		System.out.println("Bienvenido");
		System.out.println("ingrese la cantidad total de angeles que se va a almacenar");
	
	}//fin del metodo

	public void showMenu(){
	
		System.out.println("Ingrese la tarea quedesea realizar");
		System.out.println("1:Ingresar un nuevo arcangel");
		System.out.println("2:Contar el numero de arcangeles que hay ingresados");
		System.out.println("3:Desplegar la informacion de un arcangel dado su nombre");
		System.out.println("4:Desplegar la informacion de un arcngel dado su poder");
		System.out.println("5:Desplegar las celebraciones a realizar dado un mes");
		System.out.println("6:Desplegar todas las celebraciones a realizar");	

	}//fin del metodo

	public void firstMenu(){

	}//fin del metodo


}//FIN DE LA CLASE