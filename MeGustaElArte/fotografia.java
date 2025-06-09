package MeGustaElArte;

public class fotografia extends ObraArte{

	private String resolucion;

	public fotografia(String Creador, String comunicacion, String resolucion) {
		super(Creador, comunicacion);
		this.resolucion = resolucion;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	
	
}
