package Artist;

import java.util.List;

public class Grupo {

	private int id;
	private String Nombre;
	private List<Persona>Iidentidad;
	private List<Artistas>Integrantes;
	private String Nacionalidad;
	private int F_Fundacion;
	
	public int getIddelGrupo() {
		return id;
	}
	public void setIddelGrupo(int id) {
		this.id = id;
	}
	public String getNombredelGrupo() {
		return Nombre;
	}
	public void setNombredelGrupo(String nombre) {
		Nombre = nombre;
	}

	public List<Persona> getIidentidad() {
		return Iidentidad;
	}
	public void setIidentidad(List<Persona> iidentidad) {
		Iidentidad = iidentidad;
	}
	public List<Artistas> getIntegrantes() {
		return Integrantes;
	}
	public void setIntegrantes(List<Artistas> integrantes) {
		Integrantes = integrantes;
	}
	public String getNacionalidaddelGrupo() {
		return Nacionalidad;
	}
	public void setNacionalidaddelGrupo(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	public int getAñosdeActividad() {
		return F_Fundacion;
	}
	public void setAñosdeActividad(int f_Fundacion) {
		F_Fundacion = f_Fundacion;
	}
	@Override
	public String toString() {
		return "Grupo [id=" + id + ", Nombre=" + Nombre + ", Iidentidad=" + Iidentidad + ", Integrantes=" + Integrantes
				+ ", Nacionalidad=" + Nacionalidad + ", F_Fundacion=" + F_Fundacion + "]";
	}


	
}
