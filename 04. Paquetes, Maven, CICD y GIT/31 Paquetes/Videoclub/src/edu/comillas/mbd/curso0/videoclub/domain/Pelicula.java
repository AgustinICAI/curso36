package edu.comillas.mbd.curso0.videoclub.domain;

import java.util.Objects;

public class Pelicula
{
	private String nombre;
	private int ano;
	private int duracion;
	
	public Pelicula (String nombre, int ano, int duracion)
	{
		this.nombre = nombre;
		this.ano = ano;
		this.duracion = duracion;		
	}
	public Pelicula (String nombre)
	{
		this.nombre = nombre;	
	}
	
	String getNombre()
	{
		return this.nombre;
	}
	
	int getAno ()
	{
		return this.ano;
	}
	
	int getDuracion ()
	{
		return this.duracion;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pelicula pelicula = (Pelicula) o;
		return Objects.equals(nombre, pelicula.getNombre());
	}
	/*
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}*/

	@Override
	public String toString() {
		return "Pelicula{" +
				"nombre='" + nombre + '\'' +
				", ano=" + ano +
				", duracion=" + duracion +
				'}';
	}
}