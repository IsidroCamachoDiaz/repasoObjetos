package apliacacion.controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import apliacacion.servicios.ImplementacionMenu;
import apliacacion.servicios.ImplementacionPersona;
import apliacacion.servicios.InterfazMenu;
import apliacacion.servicios.InterfazPersona;
import aplicacion.entidades.Persona;

public class mainPrincipal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opcion=9;
		InterfazMenu menu= new ImplementacionMenu();
		List <Persona> bd= new ArrayList <Persona>();
		InterfazPersona interfaz= new ImplementacionPersona();
		do {
		menu.MostrarMenu();
		System.out.println("Introduzca una opcion: ");
		opcion =leer.nextInt();
		
		switch(opcion) {
		case 1:
			interfaz.CreaPersona(bd);
			break;
		case 2:
			interfaz.MostrarPersonas(bd);
			break;
		case 3:
			interfaz.EliminarPersona(bd);
		}
		}while(opcion!=0);
		leer.close();
	}

}
