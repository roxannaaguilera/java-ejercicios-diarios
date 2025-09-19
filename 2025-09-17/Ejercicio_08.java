package variables_01;

import java.util.Scanner;

public class Ejercicio_08 {

	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		double radioCirculo=0;
		double area=0;
		
		System.out.println("Introduce el radio de un circulo: ");
		radioCirculo= sn.nextDouble();
		
		area= Math.PI * (radioCirculo * radioCirculo);
		
		System.out.println(area);
	}
}
