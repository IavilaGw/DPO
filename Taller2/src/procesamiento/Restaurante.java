package procesamiento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


import modelo.Ingrediente;
import modelo.Pedido;
import modelo.Producto;
import modelo.ProductoMenu;
import modelo.Combo;

public class Restaurante {
	private ArrayList<Ingrediente> ingredientes;
	private ArrayList<Producto> menuBase;
	private ArrayList<Combo> combos;
	
	
	private void cargarMenu(File archivoMenu) throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(archivoMenu));
		String linea= br.readLine();

		while(linea != null) {
			String[] partes = linea.split(";");
			int precio = Integer.parseInt(partes[1]);
			ProductoMenu p = new ProductoMenu(partes[0], precio);
			this.menuBase.add(p);
			}	
		br.close();
	}
	private void cargarCombos(File archivoCombos) throws FileNotFoundException, IOException {
		
		
		BufferedReader br = new BufferedReader(new FileReader(archivoCombos));
		String linea= br.readLine();

		while(linea != null) {
			ArrayList<ProductoMenu> productos = new ArrayList<>();
			String[] partes = linea.split(";");
			int descuento= Integer.parseInt(partes[1]);
		    for (int i=0;i<this.menuBase.size();i++) {
		        
		        Producto a = this.menuBase.get(i);
		        if(a.getNombre() ==  partes[2] || a.getNombre() == partes[3] || a.getNombre() == partes[4]) {
		        	 String nombre = a.getNombre();
				        int precio = a.getPrecio();
						ProductoMenu p = new ProductoMenu(nombre, precio);
						productos.add(p);
		        }
		       
				

		      }
			Combo c = new Combo(descuento, partes[0],productos);
			this.combos.add(c);
			}	
		br.close();
	}
	private void cargarIngredientes(File archivoINgredientes) throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(archivoINgredientes));
		String linea= br.readLine();

		while(linea != null) {
			String[] partes = linea.split(";");
			int costoAdicional= Integer.parseInt(partes[1]);
			Ingrediente in = new Ingrediente(partes[0], costoAdicional);
			this.ingredientes.add(in);
			}	
		br.close();
	}
public void cargarInformacionRestaurante(File archivoIngredientes, File archivoMenu, File archivoCombos) throws FileNotFoundException, IOException {
	cargarIngredientes(archivoIngredientes);
	cargarCombos(archivoCombos);
	cargarMenu(archivoMenu);
}

public void iniciarPedido(String nombre, String direccionCliente) {
	Pedido pedido = new Pedido(nombre, direccionCliente);
	
}
public Restaurante() {
	super();
}


	 
}
