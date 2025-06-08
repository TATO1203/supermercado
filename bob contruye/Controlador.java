package Bob;
import java.util.Scanner;
public class Controlador {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		Casa casa1 = new Casa(0, 0, 0, null, null);
		Apartamento apa1 = new Apartamento(0, 0, 0, null, null);
		
		System.out.println("Bienvenido al Programa :D");
		System.out.println("");
		System.out.println("Empecemos por Casa :)");
		System.out.println("");
		System.out.println("Cuantos pisos tiene tu casa?");
		casa1.setPisos(lector.nextInt());
		
		System.out.println("Cuantas habitaciones tiene?");
		casa1.setHabitaciones(lector.nextInt());
		
		System.out.println("");
		System.out.println("Cuantas puertas tiene tu casa?");
		casa1.setPuertas(lector.nextInt());
		
		System.out.println("");
		System.out.println("Donde se hubica tu casa");
		casa1.setHubi(lector.next());
		
		System.out.println("Tu casa tiene chimenea?");
		casa1.setChimenea(lector.next());
		System.out.println("");
		
		System.out.println("Ahora seguimos con el Apartamento 😎");
		System.out.println("");
		System.out.println("Cuantos pisos tiene el apartamento?");
		apa1.setPisos(lector.nextInt());
		System.out.println("");
		System.out.println("Cuantas habitaciones tiene?");
		apa1.setHabitaciones(lector.nextInt());
		System.out.println("");
		System.out.println("Cuantas puertas tiene?");
		apa1.setPuertas(lector.nextInt());
		System.out.println("");
		System.out.println("Donde se hubica el apartamento?");
		apa1.setHubi(lector.next());
		System.out.println("");
		System.out.println("Que clase de restricciones tiene tu apartamento?");
		System.out.println("");
		
		System.out.println("-------------------------------------------");
		System.out.println("CASA:");
		System.out.println("pisos: " + casa1.getPisos());
		System.out.println("Habitaciones: " + casa1.getHabitaciones());
		System.out.println("Puertas: " + casa1.getPuertas());
		System.out.println("Hubicacion: " + casa1.getHubi());
		System.out.println("Chimenea: " + casa1.getChimenea());
		System.out.println("-------------------------------------------");
		
		System.out.println("");
		
		System.out.println("-------------------------------------------");
		System.out.println("Apartamento:");
		System.out.println("pisos: " + apa1.getPisos());
		System.out.println("Habitaciones: " + apa1.getHabitaciones());
		System.out.println("Puertas: " + apa1.getPuertas());
		System.out.println("Hubicacion: " + apa1.getHubi());
		System.out.println("Restricciones: " + apa1.getRestricciones());
		System.out.println("-------------------------------------------");
	}

}
