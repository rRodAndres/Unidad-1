import java.util.Scanner;

public class Switch {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte edad;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingresa tu edad");
		edad = leer.nextByte();

		
		switch(edad){
		
		case 0:
			System.out.println("Es un recien nacido");
			break;
		
		case 18:
			System.out.println("Es mayor de edad");
			break;
		
		case 65:
			System.out.println("Esta en edad de jubilación");
			break;
			
		default:
			System.out.println("La edad no es válida");
			break;
			
			

		}
		

	}

}
