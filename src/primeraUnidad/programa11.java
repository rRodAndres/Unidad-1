package primeraUnidad;

import java.util.Scanner;

public class programa11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer= new Scanner (System.in);
		byte opc;
		float n;
		double r;
		
		do{
		
		System.out.println("Ingrese el n�mero de la operaci�n que quiere realizar");
		System.out.println("1.- Pulgadas a cent�metros.");
		System.out.println("2.- Pies a cent�metros.");
		System.out.println("3.- Pies a pulgadas.");
				
		
		opc=leer.nextByte();
		
		
		
		switch(opc){
		
		case 1:
			System.out.println("Ingrese la cantidad pulgadas");
			n=leer.nextFloat();
			r=n*2.54;
			System.out.println("La cantidad en pulgadas es "+ r );
			break;
			
			
		case 2:
			System.out.println("Ingrese la cantidad pulgadas");
			n=leer.nextFloat();
			r=n*30.48;
			System.out.println("La cantidad en cent�metros "+ r );
			break;
		
			
		case 3:
			System.out.println("Ingrese la cantidad en pies");
			n=leer.nextFloat();
			r=n*12;
			System.out.println("La cantidad en pulgadas es "+ r );
			break;
			
		}
		
		}while(opc<4);
			System.out.println("Programa T�rminado");
			
	}}
		
		

		
		
		
		
		


