package principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;

import uniandes.dpoo.taller4.modelo.Tablero;

public class POpciones extends JPanel{

    private ButtonGroup difficultyGroup;
    private PCuadricula cuadricula;

    public POpciones(PCuadricula tablero) {
    	this.cuadricula=tablero;
    	
        JRadioButton easyButton = new JRadioButton("Fácil");
        JRadioButton mediumButton = new JRadioButton("Media");
        JRadioButton hardButton = new JRadioButton("Difícil");

        difficultyGroup = new ButtonGroup();
        difficultyGroup.add(easyButton);
        difficultyGroup.add(mediumButton);
        difficultyGroup.add(hardButton);

        easyButton.setSelected(true);

        JComboBox<String> sizeComboBox = new JComboBox<>();
        sizeComboBox.addItem("Pequeño 5x5");
        sizeComboBox.addItem("Mediano 7x7");
        sizeComboBox.addItem("Grande 9x9");
        


        sizeComboBox.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                String sizeStr = (String)sizeComboBox.getSelectedItem();
                int size = Integer.parseInt(sizeStr.split("x")[1]);
                cuadricula=new PCuadricula(size);
        	}
        });
        
        

        JToolBar toolBar = new JToolBar();
        toolBar.setFloatable(false);
        toolBar.add(new JLabel("Tamaño: "));
        toolBar.add(sizeComboBox);
        toolBar.addSeparator();
        toolBar.add(new JLabel("Dificultad: "));
        toolBar.add(easyButton);
        toolBar.add(mediumButton);
        toolBar.add(hardButton);

        setLayout(new BorderLayout());
        add(toolBar, BorderLayout.PAGE_START);
    	this.setBackground(Color.BLUE);

    }
}


