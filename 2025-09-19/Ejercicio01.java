package variables_03;

import java.util.Scanner;

public class Ejercicio01 {
	// 1. Solicita al usuario la base y la altura de un triángulo. 
	// Muestra en pantalla el área del triángulo.

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		
	int base=0;
	int altura=0;
	int areaTriangulo=0;
	
	System.out.println("Introduce base: ");
	base=sn.nextInt();
	System.out.println("Introduce altura: ");
	altura=sn.nextInt();
	
	areaTriangulo=(base*altura)/2;
	
	System.out.println("El área de un triángulo es: " + areaTriangulo);
	
	}

}
