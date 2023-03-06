package apliacacion.servicios;

import java.util.List;

import aplicacion.entidades.Persona;

public interface InterfazPersona {
	/**Se muestra todos lo tipos personas metidos en la lista**/
	public void MostrarPersonas(List <Persona> bd);
	/**Se pasa la lista de personas para que cree una nueva persona y la añada**/
	public List <Persona> CreaPersona(List <Persona> bd);
	/**Se pasa la lista de personas para borrar la persona que quiere**/
	public List<Persona> EliminarPersona(List <Persona> bd);
}
