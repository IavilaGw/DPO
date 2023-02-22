package modelo;

import java.util.ArrayList;

public class Combo implements Producto{
	private double descuento;
	private String NombreCombo;
	private ArrayList<ProductoMenu> productos;
	
	


	public Combo(double descuento, String nombreCombo, ArrayList<ProductoMenu> productos) {
		super();
		this.descuento = descuento;
		NombreCombo = nombreCombo;
		this.productos = productos;
	}


	public synchronized double getDescuento() {
		return descuento;
	}


	public synchronized void setDescuento(double descuento) {
		this.descuento = descuento;
	}


	public synchronized String getNombreCombo() {
		return NombreCombo;
	}


	public synchronized void setNombreCombo(String nombreCombo) {
		NombreCombo = nombreCombo;
	}


	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
