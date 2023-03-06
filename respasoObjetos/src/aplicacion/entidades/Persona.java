package aplicacion.entidades;

import java.util.List;
import java.util.Scanner;

public class Persona {
	//Atributos
	private String nombre="aaaaaaaaa";
	private String apellidos="aaaaaaaaa";
	private int edad=0;
	//Geters y Seters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	//Constructores
	public Persona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	public Persona() {
		super();
	}
	//Metodos

}
