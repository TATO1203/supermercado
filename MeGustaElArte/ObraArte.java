package MeGustaElArte;

public class ObraArte {

	private String Creador;
	private String Comunicacion;
	
	public ObraArte(String creatividad, String comunicacion) {
		super();
		Creador = creatividad;
		Comunicacion = comunicacion;
	}

	public String getCreatividad() {
		return Creador;
	}

	public void setCreatividad(String creatividad) {
		Creador = creatividad;
	}

	public String getComunicacion() {
		return Comunicacion;
	}

	public void setComunicacion(String comunicacion) {
		Comunicacion = comunicacion;
	}
	
	
}
