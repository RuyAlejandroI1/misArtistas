package Artist;

public class Cancion {

	private int id;
	private String Nombre;
	private String Genero;

	public int getIddelacancion() {
		return id;
	}

	public void setIddelacancion(int id) {
		this.id = id;
	}

	public String getNombredelacancion() {
		return Nombre;
	}

	public void setNombredelacancion(String nombre) {
		Nombre = nombre;
	}

	public String getGenerodelacancion() {
		return Genero;
	}

	public void setGenerodelacancion(String genero) {
		Genero = genero;
	}

	@Override
	public String toString() {
		return "\nCancion [id=" + id + ", Nombre de la cancion=" + Nombre + ", Genero de la cancion=" + Genero + "]";
	}

}
