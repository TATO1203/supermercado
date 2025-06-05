package supermercado;

public class Alimento extends Producto{

	private String fecha;

	public Alimento(double precio, String nombre, String marca, String tipo, String fecha) {
		super(precio, nombre, marca, tipo);
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
