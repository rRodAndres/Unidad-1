import java.util.Scanner;

public class switchletras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer= new Scanner(System.in);
		char letra;
		
		System.out.println("teclea un caracter");
		
		letra=leer.next().charAt(0);
		
		switch(letra){
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			
			System.out.println("El caracter es una voval");
			break;
		case 'b':
		case 'q':
		case 'w':
		case 'r':
		case 't':
		case 'y':
		case 'p':
		case 's':
		case 'd':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'z':
		case 'x':
		case 'c':
		case 'v':
		case 'n':
		case 'm':
			
			System.out.println("El caracter es una vocal");
			break;
		
		default: 
			System.out.println("Es un caracter especial.");
			break;
		

	}

}}
