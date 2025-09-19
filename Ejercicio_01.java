package variables_01;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nombre="";
		String apellidos="";
		
		System.out.println("Introduce tu nombre: ");
		nombre=sc.nextLine();
		
		System.out.println("Introduce tu apellido: ");
		apellidos=sc.nextLine();
		
		System.out.println(nombre + " " + apellidos);

	}

}
