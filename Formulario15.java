//ESTRUCTURA DE LA PAGINA DE LOS CUATRO LADOS


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class Formulario15 extends Frame {
	
	
	

	public static void main(String[] args) {
		Formulario15 formulario=new Formulario15();
		formulario.setLayout(new BorderLayout(10,10));
		formulario.add(new Button("NORTE"), BorderLayout.NORTH);
		formulario.add(new Button("SUR") , BorderLayout.SOUTH);
		formulario.add(new Button("ESTE") , BorderLayout.EAST);
		formulario.add(new Button("OESTE") , BorderLayout.WEST);
		formulario.add(new Button("SUR") , BorderLayout.CENTER);
		formulario.setSize(200, 200);
		formulario.setVisible(true);
		

	}

}
