package EventYListener;

public class Persona {

	String Nombre;
	String Apellido;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public Persona(String nombre, String apellido) {
		super();
		this.Nombre = nombre;
		Apellido = apellido;
	}
	
	
}
