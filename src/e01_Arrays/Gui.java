package e01_Arrays;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui extends JFrame {
	
	//Konstanten
	private static final String TITEL = "2048";
	
	//Objekte
	JPanel cp;
	JButton bt;
	Spielstein lb1;
	

	//Konstruktor
	public Gui() {
		System.out.println("Gui erstellt");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setTitle(TITEL);
		this.setLocationRelativeTo(null);
		this.setPreferredSize(new Dimension(600,600));
		this.setResizable(false);
		
		//Objekte erzeugen
		cp = new JPanel();
		bt = new JButton("ok");
		lb1 = new Spielstein (1);
		
		//Objekte in Panel setzen
		cp.add(bt);
		cp.add(lb1);
		
		//Setzen der ContentPane (Hauptcontainer)
		this.setContentPane(cp);
		this.pack();
	}


}
