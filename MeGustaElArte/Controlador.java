package MeGustaElArte;
import java.util.Scanner;
public class Controlador {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		
		Pintura pin1 = new Pintura(null, null, null);
		Escritura esc1 = new Escritura(null, null, null);
		fotografia fot1 = new fotografia(null, null, null);
		
		System.out.println("Bienvenido al programa");
		System.out.println("Empecemos por pintura: ");
		System.out.println("Ingrese el nombre del pintor de la pintura");
		pin1.setCreatividad(lector.nextLine());
		System.out.println("");
		System.out.println("Ingresa cual es el mensaje de tu pintura: ");
		pin1.setComunicacion(lector.nextLine());
		System.out.println("");
		System.out.println("Ingrese el tipo de lienzo que se utilizo para la pintura: ");
		pin1.setLienzo(lector.nextLine());
		System.out.println("");
		
		System.out.println("Ahora con la Escritura: ");
		System.out.println("Ingrese el autor de su texto: ");
		esc1.setCreatividad(lector.nextLine());
		System.out.println("");
		System.out.println("Ingrese cual es el mensaje de su texto:");
		esc1.setComunicacion(lector.nextLine());
		System.out.println("");
		System.out.println("Ingrese el tipo de texto: ");
		esc1.setTexto(lector.nextLine());
		System.out.println("");
		
		System.out.println("Ahora con Fotografia");
		System.out.println("Ingrese el fotografo que tomo la fotografia: ");
		fot1.setCreatividad(lector.nextLine());
		System.out.println("");
		System.out.println("Ingrese el mensaje que tiene o que da a entender su fotografia: ");
		fot1.setComunicacion(lector.nextLine());
		System.out.println("");
		System.out.println("Ingrese la resolucion de su fotografia");
		fot1.setResolucion(lector.nextLine());
		
		System.out.println("");
		System.out.println("");
		System.out.println("-------------------------------------------");
		System.out.println("Pintura:");
		System.out.println("Creador: " + pin1.getCreatividad());
		System.out.println("Comunicacion: " + pin1.getComunicacion());
		System.out.println("Lienzo: " + pin1.getLienzo());
		System.out.println("-------------------------------------------");
		
		System.out.println("");
		
		System.out.println("-------------------------------------------");
		System.out.println("Escritura:");
		System.out.println("Creador: " + esc1.getCreatividad());
		System.out.println("Comunicacion: " + esc1.getComunicacion());
		System.out.println("Tipo: " + esc1.getTexto());
		System.out.println("-------------------------------------------");
		
		System.out.println("");

		System.out.println("-------------------------------------------");
		System.out.println("Fotografia:");
		System.out.println("Creador: " + fot1.getCreatividad());
		System.out.println("Comunicacion: " + fot1.getComunicacion());
		System.out.println("Resolucion: " + fot1.getResolucion());
		System.out.println("-------------------------------------------");
		


	}

}
