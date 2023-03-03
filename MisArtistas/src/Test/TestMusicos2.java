package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Artist.Album;
import Artist.Artistas;
import Artist.Cancion;
import Artist.Grupo;
import Artist.Persona;
import uaemex.mx.AlbumDAO;
import uaemex.mx.ArtistaDAO;
import uaemex.mx.CancionDAO;
import uaemex.mx.GrupoDAO;
import uaemex.mx.PersonaDAO;

public class TestMusicos2 {

	public static void main(String[] args) {
		Scanner Leer = new Scanner(System.in);

		List<Persona> Listaidentidades1 = new ArrayList<>();
		List<Artistas> Listaintegrantes1 = new ArrayList<>();
		List<Cancion> listadecanciones1 = new ArrayList<>();
		
		int opcion = 0;

		while (opcion != 3) {

			System.out.println("¿Que quieres realizar?");
			System.out.println("1. ingresar artista 1");
			System.out.println("2. ingresar grupo 1");
			System.out.println("3. Salir");

			System.out.print("Seleccione una opción: ");
			opcion = Leer.nextInt();

			switch (opcion) {

			case 1 -> {
				
				PersonaDAO I1 = new PersonaDAO();
				Persona identidad1 = new Persona();

				System.out.println("ingrese el Datos de la persona\n");
				
				System.out.println("ingrese ID");
				identidad1.setId(Leer.nextInt());
				System.out.println("ingrese Nombre");
				identidad1.setNombre(Leer.next());
				System.out.println("ingrese Apellidos");
				identidad1.setApellido(Leer.next());
				System.out.println("ingrese el año de nacimiento");
				identidad1.setEdad(2023-Leer.nextInt());
				System.out.println("ingrese el Genero");
				identidad1.setGenero(Leer.next());
				System.out.println("ingrese la nacionalidad");
				identidad1.setNacionalidad(Leer.next());
				
				I1.agregar(identidad1);
				I1.ListarPersona();
				
				ArtistaDAO AR1 = new ArtistaDAO();
				Artistas artista1 = new Artistas();
				
				System.out.println("ingrese el Datos DEL Artista\n");
				
				System.out.println("ingrese ID");
				artista1.setIdArtista(Leer.nextInt());
				System.out.println("ingrese Nombre artistico");
				artista1.setNombreAritisco(Leer.next());
				System.out.println("ingrese la acupacion");
				artista1.setOcupacion(Leer.next());

				AR1.agregar(artista1);
				AR1.ListarArtista();;


				CancionDAO C1 = new CancionDAO();
				Cancion cancion1 = new Cancion();

				System.out.println("ingrese datos de la cancion\n");

				System.out.println("ingrese ID");
				cancion1.setIddelacancion(Leer.nextInt());
				System.out.println("ingrese el Nombre");
				cancion1.setNombredelacancion(Leer.next());
				System.out.println("ingrese el genero");
				cancion1.setGenerodelacancion(Leer.next());
				
				C1.agregar(cancion1);
				C1.ListarCancion();

				AlbumDAO AL1 = new AlbumDAO();
				Album album1 = new Album();

				System.out.println("ingrese datos del Album\n");
				
				System.out.println("ingrese el id");
				album1.setIdAlbum(Leer.nextInt());
				System.out.println("ingrese Nombre");
				album1.setNombredelAlbum(Leer.next());

				AL1.agregar(album1);
				AL1.ListarAlbum();
			}
			
			case 2 -> {

				GrupoDAO I1 = new GrupoDAO();
				Grupo grupo1 = new Grupo();
				
				System.out.println("ingrese datos del grupo");
				
				System.out.println("ingrese ID");
				grupo1.setIddelGrupo(Leer.nextInt());
				System.out.println("ingrese el Nombre");
				grupo1.setNombredelGrupo(Leer.next());
				System.out.println("ingrese Años de actividad");
				grupo1.setAñosdeActividad(2023-Leer.nextInt());
				System.out.println("ingrese nacionalidad");
				grupo1.setNacionalidaddelGrupo(Leer.next());
				
				I1.agregar(grupo1);
				I1.ListarGrupo();
				
				PersonaDAO In1 = new PersonaDAO();
				Persona integrante1 = new Persona();

				System.out.println("ingrese el Datos los integrantes\n");
				
				System.out.println("ingrese ID");
				integrante1.setId(Leer.nextInt());
				System.out.println("ingrese Nombre");
				integrante1.setNombre(Leer.next());
				System.out.println("ingrese Apellidos");
				integrante1.setApellido(Leer.next());
				System.out.println("ingrese el año de nacimiento");
				integrante1.setEdad(2023-Leer.nextInt());
				System.out.println("ingrese el Genero");
				integrante1.setGenero(Leer.next());
				System.out.println("ingrese la nacionalidad");
				integrante1.setNacionalidad(Leer.next());
				
				In1.agregar(integrante1);
				In1.ListarPersona();
				
				ArtistaDAO AR2 = new ArtistaDAO();
				Artistas artistaIn1 = new Artistas();
				
				System.out.println("ingrese el Datos de los Artistas\n");
				
				System.out.println("ingrese ID");
				artistaIn1.setIdArtista(Leer.nextInt());
				System.out.println("ingrese Nombre artistico");
				artistaIn1.setNombreAritisco(Leer.next());
				System.out.println("ingrese la acupacion");
				artistaIn1.setOcupacion(Leer.next());

				AR2.agregar(artistaIn1);
				AR2.ListarArtista();;
				
				CancionDAO C2 = new CancionDAO();
				Cancion cancion2 = new Cancion();

				System.out.println("ingrese datos de la cancion\n");

				System.out.println("ingrese ID");
				cancion2.setIddelacancion(Leer.nextInt());
				System.out.println("ingrese el Nombre");
				cancion2.setNombredelacancion(Leer.next());
				System.out.println("ingrese el genero");
				cancion2.setGenerodelacancion(Leer.next());
				
				C2.agregar(cancion2);
				C2.ListarCancion();
				
				AlbumDAO AL2 = new AlbumDAO();
				Album album2 = new Album();

				System.out.println("ingrese datos del Album\n");
				
				Listaidentidades1.add(integrante1);
				Listaintegrantes1.add(artistaIn1);
				listadecanciones1.add(cancion2);
				
				
				System.out.println("ingrese el id");
				album2.setIdAlbum(Leer.nextInt());
				System.out.println("ingrese Nombre");
				album2.setNombredelAlbum(Leer.next());
				album2.setIdentidades(Listaidentidades1);
				album2.setIntegrantes(Listaintegrantes1);
				album2.setCanciones(listadecanciones1);
	

				AL2.agregar(album2);
				AL2.ListarAlbum();
				
				
			}
			case 3 -> System.out.println("fin de la busqueda");

			default -> System.out.println("Opción inválida");
			}
		}
	}
}