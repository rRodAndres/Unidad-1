package primeraUnidad;

import java.text.DecimalFormat;
import java.util.Scanner;

public class programa10B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner op=new Scanner(System.in);
		DecimalFormat formateador=new DecimalFormat("###,###.##");
		byte numero, i=0;
		double suma=0;
		
		
		System.out.println("Ingrese un n�mero del 0 al 76");
		System.out.println("Ning�n valor por encima del indicado es invalido.");
		
		do{
			System.out.println("Ingrese los n�mero:");
				numero=op.nextByte();
				if(numero>=0 && numero<=76){
					suma+=numero;
					i++;		
				}
		}while(numero<=76);
			System.out.println("La suma es:"+suma+"El promedio es:"+formateador.format(suma/i));
		

	}

}
