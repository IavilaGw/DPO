package principal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

import uniandes.dpoo.taller4.modelo.Tablero;

public class PCuadricula extends JPanel{
	
	 private Tablero tablero;
	 private int ultima_fila;
	 private int ultima_columna;

	    public PCuadricula(int n) {
	        this.tablero = new Tablero(n);
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	    	boolean[][] t= tablero.darTablero();
	        super.paintComponent(g);
	        Graphics2D g2d = (Graphics2D) g;

	        int tamCelda = 50; 
	        int margen = 20; 

	        int filas = t.length;
	        int columnas = t[0].length;

	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                if (t[i][j]) {
	                    g2d.setColor(Color.BLACK);
	                } else {
	                    g2d.setColor(Color.WHITE);
	                }
	                g2d.fillRect(j * tamCelda + margen, i * tamCelda + margen, tamCelda, tamCelda);

	                g2d.setColor(Color.GRAY);
	                g2d.drawRect(j * tamCelda + margen, i * tamCelda + margen, tamCelda, tamCelda);
	            }
	        }
	    }
	    public void mousePressed(MouseEvent e)
	    {
	    int click_x = e.getX();
	    int click_y = e.getY();
	    int[] casilla = convertirCoordenadasACasilla(click_x, click_y);
	    tablero.jugar(casilla[0], casilla[1]);
	    this.ultima_fila = casilla[0];
	    this.ultima_columna = casilla[1];
	    repaint();
	    }
	    private int[] convertirCoordenadasACasilla(int x, int y)
	    {
	    int ladoTablero = tablero.darTablero().length;
	    int altoPanelTablero = getHeight();
	    int anchoPanelTablero = getWidth();
	    int altoCasilla = altoPanelTablero / ladoTablero;
	    int anchoCasilla = anchoPanelTablero / ladoTablero;
	    int fila = (int) (y / altoCasilla);
	    int columna = (int) (x / anchoCasilla);
	    return new int[] { fila, columna };
	    }
	    
	}


	
	
	

  

