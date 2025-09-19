package variables_01;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Scanner sn= new Scanner(System.in);
		String nombre="";
		double sueldo=0;
		
		System.out.println("Introduce tu nombre: ");
		nombre=sc.nextLine();
		
		System.out.println("Introduce tu sueldo mensual: ");
		sueldo=sn.nextDouble();
		
		System.out.println(nombre + " cobra " + sueldo + " euros al año");

	}

}
