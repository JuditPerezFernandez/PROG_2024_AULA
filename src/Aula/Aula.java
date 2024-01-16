package Aula;

public class Aula {

	private Alumno alumno[];
	private int capacidad;
	private int contadorAlumnos=0;
	public Aula(int capacidad) {

		this.capacidad = capacidad;
		alumno = new Alumno[capacidad];
	}

	public void anadirAlummno(Alumno nuevoAlumno) {
		if(contadorAlumnos<=capacidad) {
			alumno[contadorAlumnos]=nuevoAlumno;
			contadorAlumnos++;
		}
	}
	public String toString() {
		String alumnos=" ";
		
		for (int posicion=0;posicion<alumno.length;posicion++) {
			alumnos= alumnos+"\n"+alumno[posicion].toString();
		}
		return alumnos;
	}
}
