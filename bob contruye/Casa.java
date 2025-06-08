package Bob;

public class Casa extends Edificio{
	
	private String chimenea;

	public Casa(int pisos, int habitaciones, int puertas, String hubi, String chimenea) {
		super(pisos, habitaciones, puertas, hubi);
		this.chimenea = chimenea;
	}

	public String getChimenea() {
		return chimenea;
	}

	public void setChimenea(String chimenea) {
		this.chimenea = chimenea;
	}
	
	
	
	
}
