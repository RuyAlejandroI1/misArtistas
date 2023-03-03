package uaemex.mx;

import java.util.ArrayList;
import java.util.List;
import Artist.Cancion;


public class CancionDAO {

	List<Cancion> canciones = new ArrayList<>();
	int id = 0;

	public void agregar(Cancion cancion) {
		cancion.setIddelacancion(id);
		canciones.add(cancion);
		id++;
	}

	public void Actualizar(Cancion cancion) {

	}

	public void Eliminar(Cancion cancion) {
		canciones.remove(cancion);
	}

	public void buscar(Cancion cancion) {
		 for(int i =0; canciones.size()>=i;i++);
		 System.out.println(cancion.toString());
	 }

	public void ListarCancion() {
		System.out.println(canciones);

	}
}

