package variables_03;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		
		double sueldoAnual=0;
		double sueldoMensual=0;
		
		System.out.println("Introduce sueldo mensual: ");
		sueldoMensual=sn.nextDouble();
		
		sueldoAnual= sueldoMensual * 12;
		
		
		System.out.println("El usuario cobra mensualmente " + sueldoMensual + " euros, " + " lo que resulta en un sueldo anual de " +  sueldoAnual + " euros");

	}

}
