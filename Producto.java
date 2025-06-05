package supermercado;

public class Producto {
	
	private double precio;
	private String nombre;
	private String marca;
	private String tipo;
	
	public Producto(double precio, String nombre, String marca, String tipo) {
		super();
		this.precio = precio;
		this.nombre = nombre;
		this.marca = marca;
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
