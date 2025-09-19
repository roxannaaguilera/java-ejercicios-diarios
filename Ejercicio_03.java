package variables_01;

import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String edad="";
		String nombre="";
		String apellidos="";
		String telefono="";
		
		System.out.println("nombre: ");
		nombre=sc.nextLine();
		System.out.println("edad: ");
		edad=sc.nextLine();
		System.out.println("apellidos: ");
		apellidos=sc.nextLine();
		System.out.println("teléfono: ");
		telefono=sc.nextLine();
		
		System.out.println(nombre + " " + apellidos + " tiene " + edad + " años y su telefono es " + telefono );

	}

}
