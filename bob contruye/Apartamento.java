package Bob;

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
		
}
