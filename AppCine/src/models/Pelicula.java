package models;

public class Pelicula 
{
	
	private String titulo;
	private int duracion;
	private String genero;
	private float precio;
	
	
	
	public Pelicula(){};


	public Pelicula(String titulo, int duracion, String genero,float precio) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.genero = genero;
		this.precio=precio;
	}


	public String getTitulo() {
		return titulo;
	}


	public int getDuracion() {
		return duracion;
	}


	public String getGenero() {
		return genero;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}
	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}



	
	
	
	

}
