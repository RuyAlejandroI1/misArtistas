package Artist;
public class Artistas extends Persona {
	
	private int id;
	private String Nombre;
	private String Ocupacion;
	
	public int getsetIdArtista() {
		return id;
	}
	public void setIdArtista(int id) {
		this.id = id;
	}
	public String getNombreAritisco() {
		return Nombre;
	}
	public void setNombreAritisco(String nombre) {
		Nombre = nombre;
	}
	public String getOcupacion() {
		return Ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		Ocupacion = ocupacion;
}
	@Override
	public String toString() {
		return "\nArtistas [id=" + id + ", Nombre=" + Nombre + ", Ocupacion=" + Ocupacion + "]";
	}
	
}