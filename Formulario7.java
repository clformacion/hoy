
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.swing.*;



public class Formulario7<frmother> extends JFrame {
private JMenuBar mb;
private JMenu menu1,menu2,menu3,menu4,menu5,menu6,menu7,menu8,menu9;
private JMenuItem mi1,mi2,mi3,mi4,mi5;
private JLabel label1;


JPanel base =(JPanel)this.getContentPane();
ImageIcon in = new ImageIcon("src/imagen/java.jpg");
JLabel imagen = new JLabel();

public Formulario7() {
	
	mb=new JMenuBar();
	setJMenuBar(mb);
	menu1=new JMenu("Opciones");
	mb.add(menu1);
	menu2=new JMenu("Tamaño de la ventana");
	menu1.add(menu2);
	menu3=new JMenu("Color de Fondo");
	menu1.add(menu3);
	mi1=new JMenuItem("640*480");
	menu2.add(mi1);
	//
	mi2=new JMenuItem("1640*1480");
	menu2.add(mi2);
	//
	mi3=new JMenuItem("rojo");
	menu3.add(mi3);
	//
	
	mi4=new JMenuItem("verde");
	menu3.add(mi4);
	//
	menu4=new JMenu("Opciones");
	menu4.setBounds(10, 0, 10, 0);
	mb.add(menu4);
	//

	
	menu5=new JMenu("Opciones");
	mb.add(menu5);
	//
	
	
	menu6=new JMenu("Opciones");
	mb.add(menu6);
	//
	
	
	menu7=new JMenu("Opciones");
	mb.add(menu7);
	//
	
	menu8=new JMenu("Opciones");
	mb.add(menu8);
	//
	
	
	menu9=new JMenu("Opciones");
	mb.add(menu9);
	//
	
	
	
	
	imagen.setIcon(in);
	imagen.setBounds(700, 100, 1500, 1250);
	add(imagen);
	
	
	
	
	
	
	


}
	
  
		
	public static void main(String[] args) {
	Formulario7 formulario=new Formulario7();
	formulario.setBounds(0,0,600, 300);
	formulario.setVisible(true);
	formulario.setLocationRelativeTo(null);
	formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	formulario.setTitle("MI SOFTWARE");
	
	formulario.setLocation(500,250);
	
	
	}
	
	
	

}
