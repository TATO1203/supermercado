package supermercado;

public class Ropa extends Producto {

	private String talla;

	public Ropa(double precio, String nombre, String marca, String tipo, String talla) {
		super(precio, nombre, marca, tipo);
		this.talla = talla;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}
	
	
}
