package variables_03;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		int base=0;
		int altura=0;
		int area=0;
		
		System.out.println("Introduce base: ");
		base=sn.nextInt();
		System.out.println("Introduce altura: ");
		altura=sn.nextInt();
		
		area= base * altura;
		
		System.out.println("El área de un rectángulo con con base " + base + " y altura " + altura + " es " + area);
		
		
		

	}

}
