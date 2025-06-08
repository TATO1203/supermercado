package Bob;

public class Edificio {

	private int pisos;
	private int habitaciones;
	private int puertas;
	private String hubi;
	public Edificio(int pisos, int habitaciones, int puertas, String hubi) {
		super();
		this.pisos = pisos;
		this.habitaciones = habitaciones;
		this.puertas = puertas;
		this.hubi = hubi;
	}
	public int getPisos() {
		return pisos;
	}
	public void setPisos(int pisos) {
		this.pisos = pisos;
	}
	public int getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public String getHubi() {
		return hubi;
	}
	public void setHubi(String hubi) {
		this.hubi = hubi;
	}
	
	
}
