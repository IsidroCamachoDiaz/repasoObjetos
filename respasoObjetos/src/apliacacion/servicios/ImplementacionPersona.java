package apliacacion.servicios;

import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.Persona;

public class ImplementacionPersona implements InterfazPersona {

	@Override
	public void MostrarPersonas(List<Persona> bd) {
		for(int i=0;i<bd.size();i++) {
			System.out.println("Nombre: "+bd.get(i).getNombre());
			System.out.println("APeliidos: "+bd.get(i).getApellidos());
			System.out.println("Edad: "+bd.get(i).getEdad());
		}
	}

	@Override
	public List<Persona> CreaPersona(List<Persona> bd) {
		Persona p1 = new Persona();
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca un Nombre: ");
		p1.setNombre(leer.next());
		System.out.println("Introduzca Apellidos: ");
		p1.setApellidos(leer.next());
		System.out.println("Introduzca Edad: ");
		p1.setEdad(leer.nextInt());
		bd.add(p1);
		return bd;
	}

	@Override
	public List<Persona> EliminarPersona(List<Persona> bd) {
		Scanner leer = new Scanner(System.in);
		boolean encontro=false;
		if(!bd.isEmpty()) {
		System.out.println("Introduzca el nombre o apellido que quiere borrar");
		String borrar=leer.next();
		
		for(int i=0;i<bd.size();i++) {
			if(bd.get(i).getNombre().equals(borrar)||bd.get(i).getApellidos().equals(borrar)) {
				bd.remove(i);
				System.out.println("La persona se ha borrado");
				encontro=true;
			}
		}
		if(!encontro)
			System.out.println("No se encontro la persona");
		}
		else if(bd.isEmpty())
			System.out.println("La lista esta vacia");
		return bd;
	}

}
