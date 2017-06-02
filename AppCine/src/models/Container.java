package models;

import java.util.LinkedList;
import java.util.ListIterator;

public class Container {

	static LinkedList<Pelicula> Cartelera = new LinkedList<Pelicula>();


	static  LinkedList<Pelicula> Compra = new LinkedList<Pelicula>();

	public static LinkedList<Pelicula> getCartelera() {
		return Cartelera;
	}

}
