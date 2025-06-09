package MeGustaElArte;

public class Pintura extends ObraArte{

	private String Lienzo;

	public Pintura(String Creador, String comunicacion, String lienzo) {
		super(Creador, comunicacion);
		Lienzo = lienzo;
	}

	public String getLienzo() {
		return Lienzo;
	}

	public void setLienzo(String lienzo) {
		Lienzo = lienzo;
	}
	
	
}
