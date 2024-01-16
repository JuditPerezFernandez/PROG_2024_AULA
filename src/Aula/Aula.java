package Aula;

public class Aula {

	//Atributos
	private Alumno alumno[];
	private int capacidad;
	private int contadorAlumnos=0;
	
	//Constructor con la capacidad e inicializamos la lista de alumnos
	public Aula(int capacidad) {

		this.capacidad = capacidad;
		alumno = new Alumno[capacidad];
	}

	/*
	 * Creo el metodo añadir alumno.Dejamos añadir alumnos siempre y cuando el numero
	 * de alumnos añadidos no supere la capacidad maxima.
	 */
	public void anadirAlummno(Alumno nuevoAlumno) {
		if(contadorAlumnos<=capacidad) {
			alumno[contadorAlumnos]=nuevoAlumno;
			contadorAlumnos++;
		}
	}
	/*
	 * Devuelve la informacion de todos los alumnos.
	 */
	public String toString() {
		String alumnos=" ";
		
		//Recorro todos los alummno de la clase para poder mostrar su informacion
		for (int posicion=0;posicion<alumno.length;posicion++) {
			alumnos= alumnos+"\n"+alumno[posicion].toString();
		}
		return alumnos;
	}
}
