package Bob2;
import java.util.Scanner;
public class Controlador {

	public static void main(String[] args) {
		
int opcion1;
		
	Apartamento[] ap = new Apartamento[10];
		casa[] cas = new casa[10];		
		
		do {
			
			Scanner lector = new Scanner(System.in);
			
			
			System.out.println("Ingresa opcion deseada:");
			System.out.println("");
			System.out.println("1- Ingresar");
			System.out.println("2- Mostrar Lista");
			System.out.println("3- Borrar");
			System.out.println("4- Modificar");
			System.out.println("5- Salir");
			opcion1 = lector.nextInt();
			
			
			switch (opcion1) {
			
			case 1:
				
				System.out.println("Ingresa opcion:");
				System.out.println("");
				System.out.println("1- Agregar Apartamento");
				System.out.println("2- Agregar Casa");
				System.out.println("4- Salir");
				
				int opcion2 = lector.nextInt();
				
				switch (opcion2) {
				
				case 1: 
					
					Apartamento.altaapartamento(ap,   lector);
					break;
					
				case 2:
					
					casa.altacasa(cas,   lector);
					break;
	
				default:
				}
									

				
				break;
				
			case 2:

				System.out.println("Ingresa opcion:");
				System.out.println("");
				System.out.println("1- Mostrar Apartamento");
				System.out.println("2- Mostrar Casa");
				System.out.println("3- Salir");				
				int opcion3 = lector.nextInt();
				
				switch (opcion3) {
				
				case 1: 
					
					Apartamento.listarapartamento(ap);
					break;
					
				case 2:
					
					casa.listarcasa( cas);
					break;
					
				default:
					
				}
									

				
				break;
				
			case 3:

				System.out.println("Ingresa opcion:");
				System.out.println("");
				System.out.println("1- Borrar apartamento");
				System.out.println("2- Borrar casa");
				System.out.println("3- Salir");
				
				int opcion4 = lector.nextInt();
				
				switch (opcion4) {
				
				case 1: 
					
					Apartamento.bajaapartamento(ap, lector);
					break;
					
				case 2:
					
					casa.bajacasa(cas,  lector);
					break;
					
				default:
					
				}
				
				break;
			case 4:

				System.out.println("Ingresa opcion:");
				System.out.println("");
				System.out.println("1- Modificar Apartamento");
				System.out.println("2- Modificar Casa");
				System.out.println("3- Salir");
				
				int opcion5 = lector.nextInt();
				
				switch (opcion5) {
				
				case 1: 
					
					Apartamento.modifapartamento(ap ,lector);
					break;
					
				case 2:
					
					casa.modifcasa( cas,  lector);
					break;
					
				default:
					
				}
				break;
			case 5:
				System.out.println(" ------------");
				System.out.println("|  Saliste  |");
				System.out.println(" ------------");

				break;

			default:
				System.out.println("Opcion no disponible");
				break;
			}
			
		} while (opcion1!=4);

	}
	
	
		
	

}