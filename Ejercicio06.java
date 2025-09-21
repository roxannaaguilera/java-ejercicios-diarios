package variables_03;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn= new Scanner(System.in);
		
		int num1=0;
		int num2=0;
		int num3=0;
		int suma=0;
		
		System.out.println("introduce un n°: ");
		num1=sn.nextInt();
		System.out.println("introduce un n°: ");
		num2=sn.nextInt();
		System.out.println("introduce un n°: ");
		num3=sn.nextInt();
		
		suma= num1 + num2 + num3;
		
		System.out.println("La suma de " + num1 + " + " + num2 + " + " + num3 + " es " + suma);
		

	}

}
