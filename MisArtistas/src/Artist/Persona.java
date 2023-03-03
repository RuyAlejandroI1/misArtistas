package Artist;

public class Persona extends Grupo {

	private int id;
	private String Nombre;
	private String Apellido;
	private String Nacionalidad;
	private String Genero;
	private int F_nacimiento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public int getEdad() {
		return F_nacimiento;
	}

	public void setEdad(int f_nacimiento) {
		F_nacimiento = f_nacimiento;
	}

	@Override
	public String toString() {
		return "\nPersona [id=" + id + ", Nombre=" + Nombre + " " + Apellido + ", Nacionalidad=" + Nacionalidad
				+ ", Genero=" + Genero + ", Edad=" + F_nacimiento + "]";
	}

}
