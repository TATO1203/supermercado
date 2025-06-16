package Bob2;
import java.util.Scanner;
import Bob.Edificio;

public class Apartamento extends Edificio{

	private String Restricciones;

	public Apartamento(int pisos, int habitaciones, int puertas, String hubi, String restricciones) {
		super(pisos, habitaciones, puertas, hubi);
		Restricciones = restricciones;
	}

	public String getRestricciones() {
		return Restricciones;
	}

	public void setRestricciones(String restricciones) {
		Restricciones = restricciones;
	}

public static void bajaapartamento(Apartamento[] apartamento, Scanner lector) {
	
	System.out.println("Ingresa el nombre del apartamento a dar de baja: ");
	String hubicacion = lector.next();
	
	for(int i=0; i<apartamento.length; i++) {
		if(apartamento[i] != null && apartamento[i].getHubi().length() == hubicacion.length()) {
			
			apartamento[i] = null;
			break;
		}
	}

}
public static void modifapartamento(Apartamento[] apartamento,  Scanner lector) {

System.out.println("Ingresa el nombre del apartamento a modificar: ");
String hubicacion = lector.next();

for(int i=0; i<hubicacion.length(); i++) {
	if(apartamento[i] != null && apartamento[i].getHubi().length() == hubicacion.length()) {
		
		System.out.println("Alimento encontrado");
		
		System.out.println("Ingresa la nueva hubicacion del apartamento: ");
			
		apartamento[i].setHubi(lector.next());
			
		System.out.println("Ingresa las nuevas restricciones del apartamento : ");
			
		apartamento[i].setRestricciones(lector.next());
	}else {
		System.out.println("No se encontro el apartamento");
	}
		break;
	
}
}


public static void altaapartamento(Apartamento[] apartamento,  Scanner lector) {


System.out.println("Ingresa el nombre del apartamento: ");
String hubicacion = lector.next();

System.out.println("Ingresa las restricciones: ");
String restricciones = lector.nextLine();


for(int i=0; i<apartamento.length; i++) {
	if(apartamento[i] == null) {
		
		String restricciones1 = null;
		apartamento[i] = new Apartamento(i, i, i, hubicacion, restricciones1);
		
		break;

}
}

}

public static void listarapartamento(Apartamento[] apartamento) {

System.out.println("--------------------------------------------------------------------------------------------");

for(int i=0; i<apartamento.length; i++) {
	if(apartamento[i] != null) {
		System.out.print("hubicacion: " + apartamento[i].getHubi());
		
		System.out.println(" | restricciones: " + apartamento[i].getRestricciones());
		System.out.println("--------------------------------------------------------------------------------------------");
	
	}else {
		
	}
}


}

}



