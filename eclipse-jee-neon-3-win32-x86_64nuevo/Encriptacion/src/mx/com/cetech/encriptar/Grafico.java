package mx.com.cetech.encriptar;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grafico extends JFrame  {
	JButton encriptar = new JButton("Encriptar");
	JButton desencriptar = new JButton("Descrenciptar");
	
	JPanel prncipal = new JPanel(new BorderLayout());
	
	public Grafico(){
		super("Botones");
	}
	
	
}
