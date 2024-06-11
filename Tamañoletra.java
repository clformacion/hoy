
//tamaño de las letras
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Tamañoletra extends JFrame {

	
		
	public static void main(String[] args) throws InterruptedException {
		String[]fontNames =GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		//System.out.println(Arrays.toString(fontNames));
		
		JFrame frame = new JFrame("Mi Software");
		JLabel label =new JLabel();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(label);
	    frame.setSize(800, 1000);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	   
	   
	    

		for(String font : fontNames) {
			label.setText("BIENVENIDOS");
			label.setFont(new Font("Arial",Font.PLAIN,90));
			label.setVisible(true);
			Thread.sleep(1000);
			
			
			
		}
		
		
		
		

	}

	
	
	
		 
		

		
	
	

}

