package uaemex.mx;

import java.util.ArrayList;
import java.util.List;

import Artist.Album;


public class AlbumDAO {
	
	List<Album> albums = new ArrayList<>();
	int id = 0;

	public void agregar(Album album) {
		album.setIddelacancion(id);
		albums.add(album);
		id++;
	}

	public void Actualizar(Album album) {

	}

	public void Eliminar(Album album) {
		albums.remove(album);
	}

	public void buscar(Album album) {
		 for(int i =0; albums.size()>=i;i++);
		 System.out.println(album.toString());
	 }

	public void ListarAlbum() {
		System.out.println(albums);

	}
}

