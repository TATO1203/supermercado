package Bob2;
import java.util.Scanner;
public class casa extends Edificio{

	private String chimenea;

	public casa(int pisos, int habitaciones, int puertas, String hubi) {
		super(pisos, habitaciones, puertas, hubi);


		}

		public String getChimenea() {
			return chimenea;
		}

		public void setChimenea(String chimenea) {
			this.chimenea = chimenea;
		}
	

public static void bajacasa(casa[] casa1, Scanner lector) {
	
	System.out.println("Ingresa la hubicacion de la casa: ");
	String hubicacion = lector.next();
	
	for(int i=0; i<casa1.length; i++) {
		if(casa1[i] != null && casa1[i].getHubi().length() == hubicacion.length()) {
			
			casa1[i] = null;
			break;
		}
	}

}
public static void modifcasa(casa[] cas,  Scanner lector) {

System.out.println("Ingresa la hubicacion de la casa: ");
String hubicacion = lector.next();

for(int i=0; i<hubicacion.length();) {
	if(cas[i] != null && cas[i].getHubi().length() == hubicacion.length()) {
		
		System.out.println("Casa encontrada");
		
		System.out.println("Ingresa la nueva hubicacion de la casa: ");
			
		cas[i].setHubi(lector.next());
			
		System.out.println("Ingresa la nueva cantidad de habitaciones de la casa : ");
			
		cas[i].setHabitaciones(lector.nextInt());
	}else {
		System.out.println("No se encontro el apartamento");
	}
		break;
	
}
}


public static void altacasa(casa[] casa1,  Scanner lector) {


System.out.println("Ingresa la hubicacion: ");
String nombre = lector.next();

for(int i=0; i<casa1.length; i++) {
	if(casa1[i] == null) {
		
		String hubicacion1 = null;
		casa1[i] = new casa(i, i, i, nombre);
		
		break;

}
}

}

public static void listarcasa(casa[] casa1) {

System.out.println("--------------------------------------------------------------------------------------------");

for(int i=0; i<casa1.length; i++) {
	if(casa1[i] != null) {
		System.out.print("hubicacion: " + casa1[i].getHubi());
		
		System.out.println(" | habitaciones: " + casa1[i].getHabitaciones());
		System.out.println("--------------------------------------------------------------------------------------------");
	
	}else {
		
	}
}


}

}

