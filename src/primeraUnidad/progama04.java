package primeraUnidad;

import java.util.Scanner;

public class progama04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte edad;
		
		Scanner leer= new Scanner(System.in);
		
		System.out.print("Escriba su edad: ");
		edad=leer.nextByte();
		
		if(edad>=18)
		{
			System.out.print("Usted es mayor de edad");
		}
		else
		{
			System.out.print("Usted es menor de edad");
		}
		

	}

}
