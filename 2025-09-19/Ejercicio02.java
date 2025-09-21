package variables_03;

import java.util.Scanner;

public class Ejercicio02 {
	
	// 2. Solicita a un alumno su nota final en las asignaturas de matemáticas, ciencias, tecnología, lengua,
	// historia y religión. Muestra en pantalla la media de la nota que tiene en las asignaturas de
	// ciencias y la media de las asignaturas de letras.

	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		
		int notaFinalMate=0;
		int notaFinalCiencias=0;
		int notaFinalTecnologia=0;
		int notaFinalLengua=0;
		int notaFinalHistoria=0;
		int notaFinalReligion=0;
		int mediaCiencias=0;
		int mediaLetras=0;
		
		System.out.println("Introduce nota final Matemáticas: ");
		notaFinalMate=sn.nextInt();
		System.out.println("Introduce nota final Ciencias: ");
		notaFinalCiencias=sn.nextInt();
		System.out.println("Introduce nota final Tecnología: ");
		notaFinalTecnologia=sn.nextInt();
		System.out.println("Introduce nota final Lengua: ");
		notaFinalLengua=sn.nextInt();
		System.out.println("Introduce nota final Historia: ");
		notaFinalHistoria=sn.nextInt();
		System.out.println("Introduce nota final Religión: ");
		notaFinalReligion=sn.nextInt();
		
		mediaCiencias=(notaFinalMate + notaFinalCiencias + notaFinalTecnologia) / 3;
		mediaLetras= (notaFinalLengua + notaFinalHistoria + notaFinalReligion) / 3;
		
		System.out.println("La media de notas asignaturas de ciencias es: " + mediaCiencias + " y la media de notas de las asignaturas de letras es:  " + mediaLetras );

	}

}
