package principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PEstado extends JPanel{
	
	 private JLabel labelJugador;
	    private JTextField textFieldJugador;
	    private JLabel labelJugadas;
	    private JTextField textFieldJugadas;

	    public PEstado() {
	        setLayout(new GridLayout(1, 4, 10, 10)); // 1 fila, 4 columnas, separación de 10 píxeles

	        // Crear los componentes y agregarlos al panel
	        labelJugador = new JLabel("Jugador:");
	        textFieldJugador = new JTextField();
	        labelJugadas = new JLabel("Jugadas:");
	        textFieldJugadas = new JTextField();
	        textFieldJugadas.setEditable(false);
	        add(labelJugadas);
	        add(textFieldJugadas);
	        add(labelJugador);
	        add(textFieldJugador);
	        

	        // Establecer el tamaño de los campos de texto
	        textFieldJugador.setPreferredSize(new Dimension(100, 30));
	        textFieldJugadas.setPreferredSize(new Dimension(100, 30));
	    }
	        
	
    }	


