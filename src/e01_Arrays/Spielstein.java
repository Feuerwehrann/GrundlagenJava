package e01_Arrays;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;

public class Spielstein extends JLabel {
	
	int wert;
	
	//Konstruktor
	public Spielstein(int wert) {
		setBackground(Color.YELLOW);
		setOpaque(true);
		setWert (wert);
		setPreferredSize(new Dimension(50,50));
		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 40);
		setFont(font);
		setHorizontalAlignment(CENTER);
		setVerticalAlignment(CENTER);
	}
	
	
	//Spielstein zeichnen
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//g.drawLine(0, 0, 50, 50);
	}
	public void setWert (int wert) {
		switch (wert) {
		case 2:setBackground(Color.LIGHT_GRAY);break;
		case 4:setBackground(Color.CYAN);break;
		default:
			break;
		}
		setText(""+wert);
	}
}
