package principal;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PControles extends JPanel{
	private JButton nuevoButton;
    private JButton reiniciarButton;
    private JButton top10Button;
    private JButton cambiarJugadorButton;
    
    public PControles() {
        nuevoButton = new JButton("Nuevo");
        reiniciarButton = new JButton("Reiniciar");
        top10Button = new JButton("Top 10");
        cambiarJugadorButton = new JButton("Cambiar Jugador uno");
        
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(nuevoButton, gbc);
        
        gbc.gridy = 1;
        add(reiniciarButton, gbc);
        
        gbc.gridy = 2;
        add(top10Button, gbc);
        
        gbc.gridy = 3;
        add(cambiarJugadorButton, gbc);
    }
    
    public JButton getNuevoButton() {
        return nuevoButton;
    }
    
    public JButton getReiniciarButton() {
        return reiniciarButton;
    }
    
    public JButton getTop10Button() {
        return top10Button;
    }
    
    public JButton getCambiarJugadorButton() {
        return cambiarJugadorButton;
    }
	    
	  
}
