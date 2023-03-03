package uaemex.mx;

import java.util.ArrayList;
import java.util.List;
import Artist.Artistas;

public class ArtistaDAO {
	List<Artistas> artistas = new ArrayList<>();
	int id = 0;

	public void agregar(Artistas artista) {
		artista.setId(id + 1);
		artistas.add(artista);
		id++;
	}

	public void Actualizar(Artistas artista) {

	}

	public void Eliminar(Artistas artista) {
		artistas.remove(artista);
	}

	public void buscar(Artistas artista) {
		 for(int i =0; artistas.size()>=i;i++);
		 System.out.println(artista.toString());
	 }

	public void ListarArtista() {
		System.out.println(artistas);

	}
}
