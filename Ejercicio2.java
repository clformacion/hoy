import java.awt.*;

import javax.swing.JFrame;

public class Ejercicio2 extends Panel {
     
   public Ejercicio2() {
	   setBackground(Color.black);
	   
   }
   
   public void paint(Ejercicio2 g) {
	   g.setColor(new Color(0,255,0));
	   g.setFont(new Font("Arial", Font.PLAIN,16));
	   g.drawString("MI PRIMER SOFTWARE", 30, 100);
	   g.setColor(new Color(1,0,0,0));
	   g.fillRect(30,100,150,10);
   }
    	 
	
	
	
	private void fillRect(int i, int j, int k, int l) {
	// TODO Auto-generated method stub
	
}

	private void drawString(String string, int i, int j) {
	// TODO Auto-generated method stub
	
}

	private void setColor(Color color) {
	// TODO Auto-generated method stub
	
}

	public static void main(String[] args) {
	 Frame f= new Frame("prueba");
	 Ejercicio2 grafico= new Ejercicio2();
	 f.add(grafico);
	 f.setSize(600,300);
	 f.setVisible(true);
	

	}



		
	}


