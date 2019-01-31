package primeraUnidad;

import java.util.Scanner;

public class programa11A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		double s, min=1000000000, max=0, isr, t=0;
		int emp;
		int i=1;
		
		System.out.println("Numero de empleados:");
		emp= leer.nextInt();
		t=t+emp;
		
		do {
			System.out.print("Ingrese el sueldo del empleado "+i);
			s= leer.nextDouble();
			
			if(s<min)
			{
				min=s;
			}
			if(s>max)
			{
				max=s;
			}
			
			
		}while(i<=emp);
			isr=t*033;
			t=t-isr;
			System.out.print("Nomina: "+t);
			System.out.print("isr "+isr);
			System.out.print("Maximo: "+max);
			System.out.print("Minimo: "+min);
			
		
		
		
	}

}
