package Aula;

public class Alumno {

	private String nombre;
	private int edad;
	
	public Alumno(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setNombre(String nombre){
		
	}
	public void setEdad(int edad) {
		
	}
	
	public String toString() {
		return "Nombre:" + nombre+" Edad: "+edad;
	}
}
