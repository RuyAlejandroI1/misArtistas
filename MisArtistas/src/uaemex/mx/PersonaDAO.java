package uaemex.mx;

import java.util.ArrayList;
import java.util.List;
import Artist.Persona;

public class PersonaDAO {
	List<Persona> integrantes = new ArrayList<>();
	int id = 0;

	public void agregar(Persona integrante) {
		integrante.setIddelGrupo(id);
		integrantes.add(integrante);
		id++;
	}

	public void Actualizar(Persona integrante) {

	}

	public void Eliminar(Persona integrante) {
		integrantes.remove(integrante);
	}

	public void buscar(Persona integrante) {
		 for(int i =0; integrantes.size()>=i;i++);
		 System.out.println(integrante.toString());
	 }

	public void ListarPersona() {
		System.out.println(integrantes);

	}
}
