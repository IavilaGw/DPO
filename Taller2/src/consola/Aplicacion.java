package consola;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import procesamiento.Restaurante;

public class Aplicacion {
	private Restaurante restaurante;
	public  void mostrarMenu() {
		
		
			System.out.println("\nOpciones de la aplicación\n");
			System.out.println("1. Iniciar un nuevo pedido");
			System.out.println("2. Agregar un elemento al pedido");
			System.out.println("3. Cerrar un pedido y guardar factura");
			System.out.println("4. Consultar n pedido y guardar factura");
			System.out.println("5. Salir de la aplicación\n");
		
	}
	public void  ejecutarOpcion(int opcionSeleccionada) throws FileNotFoundException, IOException {
		
		while(opcionSeleccionada != 5) {
			
		if (opcionSeleccionada == 1)	{
			Restaurante r=new Restaurante();
			File i = new File("/data/ingredientes.txt");
			File m = new File("/data/menu.txt");
			File c = new File("/data/combos.txt");

			r.cargarInformacionRestaurante(i,m,c);
			}
		else if (opcionSeleccionada == 2)
			;
		else if (opcionSeleccionada == 3)
			;
		else if (opcionSeleccionada == 4 )
			;
		else if (opcionSeleccionada == 5 )
			;
	}
		}
 public static void main(String[] args) throws NumberFormatException, IOException {
	Aplicacion ap = new Aplicacion();
	ap.mostrarMenu();
	System.out.print("Seleccione la opción deseada: ");
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int  opcionSeleccionadad= Integer.parseInt(reader.readLine());
	ap.ejecutarOpcion(opcionSeleccionadad);
}
}
