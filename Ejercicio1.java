package variables_02;

import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double sueldoBrutoAnual=0;
		int nHijos=0;
		int nPropiedades=0;
		int nMascotas=0;
		int edad=0;
		int nVehiculos=0;
		double impuestosAnuales=0;
		
		
		System.out.println("Sueldo bruto: ");
		sueldoBrutoAnual=sc.nextDouble();
		impuestosAnuales= sueldoBrutoAnual * 0.35;
		System.out.println(impuestosAnuales);
		
		System.out.println("N° hijos: ");
		nHijos=sc.nextInt();
		if(nHijos>0) {
			impuestosAnuales = impuestosAnuales - ((sueldoBrutoAnual * nHijos) / 100);
		}
		System.out.println(impuestosAnuales);
		
		System.out.println("N° propiedades: ");
		nPropiedades=sc.nextInt();
		if(nPropiedades>0) {
			impuestosAnuales+= sueldoBrutoAnual*(nPropiedades * 5)/100;
			System.out.println(impuestosAnuales);
		}
		
		System.out.println("N° mascotas: ");
		nMascotas=sc.nextInt();
		
		if(nMascotas>0) {
			impuestosAnuales+= sueldoBrutoAnual * (nMascotas * 3)/100;
		}
		System.out.println(impuestosAnuales);
		
		System.out.println("edad: ");
		edad=sc.nextInt();
		
		if(edad>30) {
			impuestosAnuales+= sueldoBrutoAnual * ((edad-30) * 5) /100;
		}
		System.out.println(impuestosAnuales);
		
		System.out.println("N° vehiculos: ");
		nVehiculos=sc.nextInt();
		
		if(nVehiculos>0) {
			impuestosAnuales += sueldoBrutoAnual * (nVehiculos * 4)/100;
		}
		System.out.println(impuestosAnuales);
	}

}
