package Aula;

public class Start {

	public static void main(String[] args) {
		
		Aula aula= new Aula(5);
		for(int numAlumno=0;numAlumno<5;numAlumno++) {
			Alumno alumno=new Alumno("Alumno "+numAlumno,15);
			aula.anadirAlummno(alumno);
		}
		System.out.println(aula.toString());
	}

}
