package supermercado;
import java.util.Scanner;
public class Controlador {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		Electronica ele1 = new Electronica(0, null, null, null, null);
		Ropa ropa1 = new Ropa(0, null, null, null, null);
		Alimento ali1 = new Alimento(0, null, null, null, null);
		
		System.out.println("Ingrese un producto del area de Electronica");
		
		System.out.println(" ");
		
		System.out.println("Ingrese el nombre del producto: ");
		ele1.setNombre(lector.next());
		
		System.out.println("Ingrese el nombre de la marca que hizo el producto: ");
		ele1.setMarca(lector.next());
		
		System.out.println("Ahora ingrese el tipo del producto: ");
		ele1.setTipo(lector.next());
		
		System.out.println("Ingrese el precio:");
		ele1.setPrecio(lector.nextDouble());
		
		System.out.println("Ingrese la cantidad de watts que necesita el producto para funcionar: ");
		ele1.setCantWatts(lector.next());
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

		System.out.println("Ingrese un producto del area de Ropa");
		
		System.out.println(" ");
		
		System.out.println("Ingrese el nombre del producto: ");
		ropa1.setNombre(lector.next());
		
		System.out.println(" ");

		System.out.println("Ingrese el nombre de la marca que hizo el producto: ");
		ropa1.setMarca(lector.next());
		
		System.out.println(" ");

		System.out.println("Ahora ingrese el tipo del producto: ");
		ropa1.setTipo(lector.next());
		
		System.out.println(" ");

		System.out.println("Ingrese el precio:");
		ropa1.setPrecio(lector.nextDouble());
		
		System.out.println(" ");
		
		System.out.println("Ingrese la talla de su prenda: ");
		ropa1.setTalla(lector.next());
		
		System.out.println("Ingrese un producto del area de Alimentos");
		
		System.out.println(" ");
		
		System.out.println("Ingrese el nombre del producto: ");
		ali1.setNombre(lector.next());
		
		System.out.println("Ingrese el nombre de la marca que hizo el producto: ");
		ali1.setMarca(lector.next());
		
		System.out.println("Ahora ingrese el tipo del producto: ");
		ali1.setTipo(lector.next());
		
		System.out.println("Ingrese el precio:");
		ali1.setPrecio(lector.nextDouble());
		
		System.out.println("Ingrese la fecha de vencimiento del alimento: ");
		ali1.setFecha(lector.next());
		
		System.out.println("");
		System.out.println("Electronica: ");
		System.out.println("Nombre del producto " + ele1.getNombre());
		System.out.println("Marca " + ele1.getMarca());
		System.out.println("Tipo " + ele1.getTipo());
		System.out.println("Precio " + ele1.getPrecio());
		System.out.println("Cant.Watts " + ele1.getCantWatts());
		
		System.out.println("");
		
		System.out.println("Ropa: ");
		System.out.println("Nombre del producto " + ropa1.getNombre());
		System.out.println("Marca " + ropa1.getMarca());
		System.out.println("Tipo " + ropa1.getTipo());
		System.out.println("Precio " + ropa1.getPrecio());
		System.out.println("Talla " + ropa1.getTalla());
		
		System.out.println("");
		
		System.out.println("Alimento: ");
		System.out.println("Nombre del producto " + ali1.getNombre());
		System.out.println("Marca " + ali1.getMarca());
		System.out.println("Tipo " + ali1.getTipo());
		System.out.println("Precio " + ali1.getPrecio());
		System.out.println("Fecha De Vencimiento " + ali1.getFecha());
	}

}
