package variables_03;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sn=new Scanner(System.in);
		String nombre="";
		String apellido="";
		int edad=0;
		String profesion="";
		
		System.out.println("Nombre: ");
		nombre=sc.nextLine();
		
		System.out.println("Apellido: ");
		apellido=sc.nextLine();
		
		System.out.println("Edad: ");
		edad=sn.nextInt();
		
		System.out.println("Profesión: ");
		profesion=sc.nextLine();
		
		System.out.println("El usuario se llama " + nombre + " " + apellido + "," + "tiene " + edad + " años" + " y es " + profesion);

	}

}
