package modelo;

public class ProductoMenu implements Producto{
	private String nombre;
	private int precioBase;
	public ProductoMenu(String nombre, int precioBase) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	public synchronized String getNombre() {
		return nombre;
	}
	public synchronized void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public synchronized int getPrecioBase() {
		return precioBase;
	}
	public synchronized void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}
	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
