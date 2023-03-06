package apliacacion.servicios;

public class ImplementacionMenu implements InterfazMenu {

	@Override
	public void MostrarMenu(){
		System.out.println("1-Crear Persona");
		System.out.println("2-Mostrar Personas");
		System.out.println("3-Eliminar Persona");
		System.out.println("4-Modificar Persona");
	}

}
