package GameTest;
import javax.swing.*;

public class App {
	
	public static void iniciaJanela() {
		JFrame oJanela = new JFrame();
		
		oJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Quadro oQuadro = new Quadro();
		
		oJanela.add(oQuadro);
		
		oJanela.addKeyListener(oQuadro);
		
		oJanela.setResizable(false);
		
		oJanela.pack();
		
		oJanela.setLocationRelativeTo(null);
		
		oJanela.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				iniciaJanela();				
			}
		});
	}

}
