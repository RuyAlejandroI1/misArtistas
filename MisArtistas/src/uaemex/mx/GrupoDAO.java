package uaemex.mx;

import java.util.ArrayList;
import java.util.List;
import Artist.Grupo;

public class GrupoDAO {
	List<Grupo> grupos = new ArrayList<>();
	int id = 0;

	public void agregar(Grupo grupo) {
		grupo.setIddelGrupo(id);
		grupos.add(grupo);
		id++;
	}

	public void Actualizar(Grupo grupo) {

	}

	public void Eliminar(Grupo grupo) {
		grupos.remove(grupo);
	}

	public void buscar(Grupo grupo) {
		 for(int i =0; grupos.size()>=i;i++);
		 System.out.println(grupo.toString());
	 }

	public void ListarGrupo() {
		System.out.println(grupos);

	}
}

