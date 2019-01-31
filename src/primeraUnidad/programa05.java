package primeraUnidad;

import java.util.Scanner;

public class programa05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte c;
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Escribe tu calificaión");
		
		c=leer.nextByte();
		if(c>=80)
		{
			System.out.println("aprobado");
		}
		else
		{
			System.out.println("reprobado");
		}
		
			}

}
