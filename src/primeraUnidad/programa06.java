package primeraUnidad;

import java.util.Scanner;

public class programa06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer =new Scanner(System.in);
		System.out.println("Escribe un número, y te dire si es par o impar");
		
			int n=leer.nextInt();
			
		if(n%2==0) {
			System.out.println("El número "+n+" es par");
		}
		else {
			System.out.println("El número "+n+" es impar");
		}

	}

}
