package supermercado;

public class Electronica extends Producto {
	
	
	private String cantWatts;

	public String getCantWatts() {
		return cantWatts;
	}

	public void setCantWatts(String cantWatts) {
		this.cantWatts = cantWatts;
	}

	public Electronica(double precio, String nombre, String marca, String tipo, String cantWatts) {
		super(precio, nombre, marca, tipo);
		this.cantWatts = cantWatts;
	}

	
	}
	

