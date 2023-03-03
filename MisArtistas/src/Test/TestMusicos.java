package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Artist.Album;
import Artist.Artistas;
import Artist.Cancion;
import Artist.Grupo;
import Artist.Persona;

public class TestMusicos {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		
		List<Persona> Listaidentidades1 = new ArrayList<>();
		List<Persona> Listaidentidades2 = new ArrayList<>();
		List<Persona> Listaidentidades3 = new ArrayList<>();
		List<Persona> Listaidentidades4 = new ArrayList<>();
		List<Persona> Listaidentidades5 = new ArrayList<>();
		List<Persona> Listaidentidades6 = new ArrayList<>();
		
		List<Artistas> Listaintegrantes1 = new ArrayList<>();
		List<Artistas> Listaintegrantes2 = new ArrayList<>();
		List<Artistas> Listaintegrantes3 = new ArrayList<>();
		List<Artistas> Listaintegrantes4 = new ArrayList<>();
		List<Artistas> Listaintegrantes5 = new ArrayList<>();
		List<Artistas> Listaintegrantes6 = new ArrayList<>();
		
		List<Cancion> listadecanciones1 = new ArrayList<>();
		List<Cancion> listadecanciones2 = new ArrayList<>();
		List<Cancion> listadecanciones3 = new ArrayList<>();
		List<Cancion> listadecanciones4 = new ArrayList<>();
		List<Cancion> listadecanciones5 = new ArrayList<>();
		List<Cancion> listadecanciones6 = new ArrayList<>();


		int opcion = 0;

		while (opcion != 6) {

			System.out.println("¿Que quieres realizar?");
			System.out.println("1. Ver Artista 1");
			System.out.println("2. Ver Artista 2");
			System.out.println("3. Ver Artista 3");
			System.out.println("4. Ver Grupo 1");
			System.out.println("5. Ver Grupo 2");
			System.out.println("6. Salir");

			System.out.print("Seleccione una opción: ");
			opcion = Sc.nextInt();

			switch (opcion) {

			case 1 -> {

				Persona IdentidaddelArtista1 = new Persona();

				IdentidaddelArtista1.setId(1);
				IdentidaddelArtista1.setNacionalidad("Japonesa");
				IdentidaddelArtista1.setNombre("Risa");
				IdentidaddelArtista1.setApellido(" Ōribe");
				IdentidaddelArtista1.setEdad(2023 - 1987);
				IdentidaddelArtista1.setGenero("Femenino");

				Artistas artista1 = new Artistas();

				artista1.setIdArtista(1);
				artista1.setNombreAritisco("LISA");
				artista1.setOcupacion("Cantante, compositora y letrista");

				Cancion cancion1 = new Cancion();

				cancion1.setIddelacancion(1);
				cancion1.setNombredelacancion("DAWN");
				cancion1.setGenerodelacancion("Japanese Rock, Vocaloid Utaite, J-Pop");

				Cancion cancion2 = new Cancion();

				cancion2.setIddelacancion(1);
				cancion2.setNombredelacancion("Gurenge");
				cancion2.setGenerodelacancion("J-Pop");

				Cancion cancion3 = new Cancion();

				cancion3.setIddelacancion(1);
				cancion3.setNombredelacancion("oath sign");
				cancion3.setGenerodelacancion("J-Pop");

				Album album1 = new Album();


				Listaidentidades1.add(IdentidaddelArtista1);
				Listaintegrantes1.add(artista1);
				listadecanciones1.add(cancion1);
				listadecanciones1.add(cancion2);
				listadecanciones1.add(cancion3);

				album1.setIdAlbum(1);
				album1.setNombredelAlbum("Musica de Anime Japonesa");
				album1.setIdentidades(Listaidentidades1);
				album1.setIntegrantes(Listaintegrantes1);
				album1.setCanciones(listadecanciones1);

				System.out.println(album1);

			}

			case 2 -> {

				Persona IdentidaddelArtista2 = new Persona();

				IdentidaddelArtista2.setId(2);
				IdentidaddelArtista2.setNacionalidad("Noruega");
				IdentidaddelArtista2.setNombre("Alan Olav ");
				IdentidaddelArtista2.setApellido(" Walker");
				IdentidaddelArtista2.setEdad(2023 - 1997);
				IdentidaddelArtista2.setGenero("Masculino");

				Artistas artista2 = new Artistas();

				artista2.setIdArtista(2);
				artista2.setNombreAritisco("Alan Walker");
				artista2.setOcupacion("	DJ, compositor y productor");

				Cancion cancion4 = new Cancion();

				cancion4.setIddelacancion(1);
				cancion4.setNombredelacancion("Man On The Moon");
				cancion4.setGenerodelacancion("Alternativa/independiente, Dance/Electrónica, Pop");

				Cancion cancion5 = new Cancion();

				cancion5.setIddelacancion(1);
				cancion5.setNombredelacancion("Paradise");
				cancion5.setGenerodelacancion("Dance/Electrónica");

				Cancion cancion6 = new Cancion();

				cancion6.setIddelacancion(1);
				cancion6.setNombredelacancion("Out of Love");
				cancion6.setGenerodelacancion("Alternativa/independiente, Dance/Electrónica, Pop");
			

				Album album2 = new Album();


				Listaidentidades2.add(IdentidaddelArtista2);
				Listaintegrantes2.add(artista2);
				listadecanciones2.add(cancion4);
				listadecanciones2.add(cancion5);
				listadecanciones2.add(cancion6);

				album2.setIdAlbum(1);
				album2.setNombredelAlbum("Musica de Anime Japonesa");
				album2.setIdentidades(Listaidentidades2);
				album2.setIntegrantes(Listaintegrantes2);
				album2.setCanciones(listadecanciones2);

				System.out.println(album2);
				}
			
		case 3 -> {
			Persona IdentidaddelArtista3 = new Persona();

			IdentidaddelArtista3.setId(1);
			IdentidaddelArtista3.setNacionalidad("	Brasileña");
			IdentidaddelArtista3.setNombre("Alok Achkar");
			IdentidaddelArtista3.setApellido("Peres Petrillo");
			IdentidaddelArtista3.setEdad(2023 - 1991);
			IdentidaddelArtista3.setGenero("Masculino");

			Artistas artista3 = new Artistas();

			artista3.setIdArtista(1);
			artista3.setNombreAritisco("Alok");
			artista3.setOcupacion("	DJ, compositor y productor discográfico");

			Cancion cancion7 = new Cancion();

			cancion7.setIddelacancion(1);
			cancion7.setNombredelacancion("Vale Vale");
			cancion7.setGenerodelacancion("Dance/Electrónica");

			Cancion cancion8 = new Cancion();

			cancion8.setIddelacancion(1);
			cancion8.setNombredelacancion("Wherever You Go (feat. John Martin)");
			cancion8.setGenerodelacancion(" Dance/Electrónica");

			Cancion cancion9 = new Cancion();

			cancion9.setIddelacancion(1);
			cancion9.setNombredelacancion("Deep Down");
			cancion9.setGenerodelacancion("Dance/Electrónica");

			Album album3 = new Album();


			Listaidentidades3.add(IdentidaddelArtista3);
			Listaintegrantes3.add(artista3);
			listadecanciones3.add(cancion7);
			listadecanciones3.add(cancion8);
			listadecanciones3.add(cancion9);

			album3.setIdAlbum(1);
			album3.setNombredelAlbum("Musica idependiente");
			album3.setIdentidades(Listaidentidades3);
			album3.setIntegrantes(Listaintegrantes3);
			album3.setCanciones(listadecanciones3);

			System.out.println(album3);
		}
		
			case 4 -> {
				
				Grupo grupo1 = new Grupo();

				grupo1.setIddelGrupo(4);
				grupo1.setNombredelGrupo("Imaginedragons");
				grupo1.setAñosdeActividad(2023 - 2008);
				grupo1.setNacionalidaddelGrupo("Las Vegas, Nevada, Estados Unidos");
				
				Persona Identidad1 = new Persona();
				
				Identidad1.setId(2);
				Identidad1.setNacionalidad("Estadounidense");
				Identidad1.setNombre("Daniel");
				Identidad1.setApellido("Coulter Reynolds");
				Identidad1.setEdad(2023 - 1987);
				Identidad1.setGenero("Masculino");
				
				Persona Identidad2 = new Persona();
				
				Identidad2.setId(2);
				Identidad2.setNacionalidad("Estadounidense");
				Identidad2.setNombre("Daniel");
				Identidad2.setApellido("Wayne Sermon");
				Identidad2.setEdad(2023 - 1984);
				Identidad2.setGenero("Masculino");
				
				Persona Identidad3 = new Persona();
				
				Identidad3.setId(2);
				Identidad3.setNacionalidad("Estadounidense");
				Identidad3.setNombre("Benjamin Arthur");
				Identidad3.setApellido("McKee");
				Identidad3.setEdad(2023 - 1985);
				Identidad3.setGenero("Masculino");
				
				Persona Identidad4 = new Persona();
				
				Identidad4.setId(2);
				Identidad4.setNacionalidad("Estadounidense");
				Identidad4.setNombre("Daniel James");
				Identidad4.setApellido("Platzman");
				Identidad4.setEdad(2023 - 1986);
				Identidad4.setGenero("Masculino");
				
				
				Artistas Integrante1 = new Artistas();

				Integrante1.setIdArtista(2);
				Integrante1.setNombreAritisco("Dan Reynolds");
				Integrante1.setOcupacion("Cantante, compositor, músico");

				Artistas Integrante2 = new Artistas();

				Integrante2.setIdArtista(2);
				Integrante2.setNombreAritisco("Wayne Sermon");
				Integrante2.setOcupacion("músico");
				
				Artistas Integrante3 = new Artistas();

				Integrante3.setIdArtista(2);
				Integrante3.setNombreAritisco("Ben McKee");
				Integrante3.setOcupacion("Bajista, músico");
				
				Artistas Integrante4 = new Artistas();

				Integrante4.setIdArtista(2);
				Integrante4.setNombreAritisco("Daniel Platzman");
				Integrante4.setOcupacion("Baterista, músico y compositor de cine.");
				
				Cancion cancion10 = new Cancion();

				cancion10.setIddelacancion(1);
				cancion10.setNombredelacancion("Bones");
				cancion10.setGenerodelacancion("Rock, Alternativa/independiente, Música infantil");

				Cancion cancion11 = new Cancion();

				cancion11.setIddelacancion(1);
				cancion11.setNombredelacancion(" Enemy");
				cancion11.setGenerodelacancion(" R&B/Soul, Alternativa/independiente, Hip-hop/rap");

				
				Album album4 = new Album();
				
				Listaidentidades4.add(Identidad1);
				Listaidentidades4.add(Identidad2);
				Listaidentidades4.add(Identidad3);
				Listaidentidades4.add(Identidad4);

				Listaintegrantes4.add(Integrante1);
				Listaintegrantes4.add(Integrante2);
				Listaintegrantes4.add(Integrante3);
				Listaintegrantes4.add(Integrante4);
				
				listadecanciones3.add(cancion10);
				listadecanciones3.add(cancion11);
				
				album4.setIdAlbum(1);
				album4.setNombredelAlbum("Mercury – Act 2 (Mercury – Acts 1 & 2)");
				album4.setIdentidades(Listaidentidades4);
				album4.setIntegrantes(Listaintegrantes4);
				album4.setCanciones(listadecanciones4);

				System.out.println(album4);
				}
			case 5 -> {
				
				Grupo grupo2 = new Grupo();

				grupo2.setIddelGrupo(4);
				grupo2.setNombredelGrupo("Daft Punk");
				grupo2.setAñosdeActividad(2021 - 1993);
				grupo2.setNacionalidaddelGrupo("Las Vegas, Nevada, Estados Unidos");
				
				Persona Identidad5 = new Persona();
				
				Identidad5.setId(2);
				Identidad5.setNacionalidad("París, Francia");
				Identidad5.setNombre("Thomas");
				Identidad5.setApellido("Bangalter");
				Identidad5.setEdad(2023 - 1975);
				Identidad5.setGenero("Masculino");
				
				Persona Identidad6 = new Persona();
				
				Identidad6.setId(2);
				Identidad6.setNacionalidad("París, Francia");
				Identidad6.setNombre("Guy-Manuel de Homem-Christo");
				Identidad6.setApellido("");
				Identidad6.setEdad(2023 - 1974);
				Identidad6.setGenero("Masculino");
				
				Artistas Integrante5 = new Artistas();

				Integrante5.setIdArtista(2);
				Integrante5.setNombreAritisco("T-Bang");
				Integrante5.setOcupacion("	DJ, productor, compositor, escritor y director de cine");

				Artistas Integrante6 = new Artistas();

				Integrante6.setIdArtista(2);
				Integrante6.setNombreAritisco("G-Man");
				Integrante6.setOcupacion("DJ y productor");
				
				Cancion cancion12 = new Cancion();

				cancion12.setIddelacancion(1);
				cancion12.setNombredelacancion("One More Time");
				cancion12.setGenerodelacancion("House francés , Dance/Electrónica , Pop");

				Cancion cancion13 = new Cancion();

				cancion13.setIddelacancion(1);
				cancion13.setNombredelacancion("Too Long");
				cancion13.setGenerodelacancion("Dance/Electrónica");
				
			Album album5 = new Album();
				
				Listaidentidades5.add(Identidad5);
				Listaidentidades5.add(Identidad6);

				Listaintegrantes5.add(Integrante6);
				Listaintegrantes5.add(Integrante5);

				
				listadecanciones5.add(cancion12);
				listadecanciones5.add(cancion13);
				
				album5.setIdAlbum(1);
				album5.setNombredelAlbum("interstella 5555");
				album5.setIdentidades(Listaidentidades5);
				album5.setIntegrantes(Listaintegrantes5);
				album5.setCanciones(listadecanciones5);

				System.out.println(album5);
			}
			case 6 -> System.out.println("fin de la busqueda");

			default -> System.out.println("Opción inválida");
			}
		}
	}
}
