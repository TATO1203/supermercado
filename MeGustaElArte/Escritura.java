package MeGustaElArte;

public class Escritura extends ObraArte{

	private String texto;

	public Escritura(String Creador, String comunicacion, String texto) {
		super(Creador, comunicacion);
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
}
