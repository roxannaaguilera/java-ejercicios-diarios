package variables_01;

import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		int edad1=0;
		int edad2=0;
		int edad3=0;
		int edad4=0;
		int edadMedia=0;
		
		System.out.println("Introduce una edad: ");
		edad1=sn.nextInt();
		System.out.println("Introduce una edad: ");
		edad2=sn.nextInt();
		System.out.println("Introduce una edad: ");
		edad3=sn.nextInt();
		System.out.println("Introduce una edad: ");
		edad4=sn.nextInt();
		
		edadMedia=(edad1 + edad2 + edad3 + edad4) /4;
		
		System.out.println("La edad media es: " + edadMedia);
	}
}
