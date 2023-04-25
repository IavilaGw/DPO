package principal;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.formdev.flatlaf.FlatLightLaf;

public class FPrincipal extends JFrame {
	
	private PControles controles;
	private PCuadricula cuadricula;
	private PEstado estado;
	private POpciones opciones;
    
    
	public FPrincipal(){
		
		this.setTitle("Lights Off");
		this.setSize(12000,700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		this.controles = new PControles();
		this.estado = new PEstado();
		this.cuadricula=new PCuadricula(5);
		this.opciones=new POpciones(cuadricula);	
		
		this.add(this.controles, BorderLayout.EAST);
		this.add(this.cuadricula,BorderLayout.CENTER);
		this.add(this.estado,BorderLayout.SOUTH);
		this.add(this.opciones, BorderLayout.NORTH);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		FlatLightLaf.install();
		new FPrincipal();
	}

}
