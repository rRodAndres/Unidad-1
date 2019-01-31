package primeraUnidad;

import java.util.Scanner;

public class programa07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer =new Scanner(System.in);
		double c;
	System.out.println("..:::Conversor de °Fahrenheit a °Centigrados:::..");
	System.out.println("");
	System.out.println("Ingresa los grados fahrenheit a convertir");
		float f=leer.nextFloat();
			c=(f-32)/1.8;
			
	System.out.println("De °"+f+" fahrenheit se convirtio a °"+c+" centigrados");

	}

}
