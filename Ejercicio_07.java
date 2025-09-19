package variables_01;

import java.util.Scanner;

public class Ejercicio_07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sn=new Scanner(System.in);
		String nombre="";
		int precio=0;
		double precioFinal=0;
		
		System.out.println("nombre: ");
		nombre=sc.nextLine();
		
		System.out.println("precio: ");
		precio=sc.nextInt();
		
		precioFinal= (precio * 0.21) + precio;
		
		System.out.println(precioFinal);
		
		
		
		
		

	}

}
