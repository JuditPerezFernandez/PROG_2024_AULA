package Aula;

import java.util.Arrays;

public class Aula {

	// Atributos
	private Alumno[] alumnos;
	private int cuantos;

	// Constructor con la capacidad e inicializamos la lista de alumnos
	public Aula(int capacidad) {

		this.cuantos = 0;
		alumnos = new Alumno[capacidad];
	}

	public void add(Alumno nuevoAlumno) {

		if (cuantos < alumnos.length) {
			alumnos[cuantos] = nuevoAlumno;
			cuantos++;
		}
		// Esto es lo mismo que: System.out.println(toString);
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Aula [\nalumnos=" + Arrays.toString(alumnos) + "\ncuantos=" + cuantos + "]\n";
	}

}
