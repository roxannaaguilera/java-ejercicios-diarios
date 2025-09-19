package variables_01;

import java.util.Scanner;

public class Ejercicio_05 {

	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		int resultado=0;
		
		System.out.println("Introduce un número: ");
		num1=sn.nextInt();
		System.out.println("Introduce un número: ");
		num2=sn.nextInt();
		System.out.println("Introduce un número: ");
		num3=sn.nextInt();
		System.out.println("Introduce un número: ");
		num4=sn.nextInt();
		
		resultado= (num2 + num3 + num4) - num1;
		
		System.out.println(resultado);
		

	}

}
