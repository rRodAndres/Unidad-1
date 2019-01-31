package primeraUnidad;

import java.util.Scanner;

public class Programa3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String nombre;
		 byte edad;
		 float altura;
		
		
			Scanner leer = new Scanner(System.in);
			
			System.out.print("ingresa tu nombre:");
			nombre = leer.nextLine();
			
			System.out.print("ingresa tu edad:");
			edad = leer.nextByte();
			
			System.out.print("ingresa tu altura:");
	
			altura = leer.nextFloat();
			
			Persona a= new Persona ();
			
			a.setNombre(nombre);
			a.setEdad(edad);
			a.setEstatura(altura);
			
			System.out.println(a);
			

	}

}
