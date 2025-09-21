package variables_03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Scanner sn= new Scanner(System.in);
		
		String nombre="";
		double sueldo=0;
		int nHijos=0;
		int nFamiliarCargo=0;
		double sueldoAnual=0;
		
		System.out.println("Introduce tu nombre: ");
		nombre=sc.nextLine();
		
		System.out.println("Introduce tu sueldo mensual: ");
		sueldo=sc.nextDouble();
		
		System.out.println("Introduce tu n° de hijos: ");
		nHijos=sc.nextInt();
		
		System.out.println("Introduce el n° de familiares que tienes a cargo : ");
		nFamiliarCargo=sc.nextInt();
		
		if(nHijos>0) {
			sueldo = sueldo + (nHijos * 50);
			
		}if(nFamiliarCargo>0) {
			sueldo= sueldo + (nFamiliarCargo * 100);
		}
		
		sueldoAnual= sueldo * 12;
		
		System.out.println("El sueldo mensual es: "+ sueldo + " El sueldo anual es: " + sueldoAnual);
		

	}

}
