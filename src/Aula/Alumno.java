package Aula;

public class Alumno {

	// Atributos
	private String nombre;
	private int edad;

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;

	}

	public String toString() {
		return "Nombre:" + nombre + " Edad: " + edad;
	}
}
