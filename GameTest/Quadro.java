package GameTest;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;

import javax.swing.*;

public class Quadro extends JPanel implements ActionListener, KeyListener {
	
	/**
	 * @return ID
	 */
	private static final long serialVersionUID = 1L;

	private final int ATRASO  = 25;
	
	public static final int TAMANHO_CABECALHO = 50;
	
	public static final int LINHAS = 12;
	
	public static final int COLUNAS = 18;
	
	private Jogador oJogador;
	
	private Timer oTempo;
	
	public Quadro() {
		
		setPreferredSize(new Dimension(TAMANHO_CABECALHO * COLUNAS, TAMANHO_CABECALHO * LINHAS));
		
		setBackground(new Color(232, 232, 232));
		
		oJogador = new Jogador();
		
		oTempo = new Timer(ATRASO, this);
		
		oTempo.start();
		
	}

	@Override
	public void keyTyped(KeyEvent oEvento) {
		
	}

	@Override
	public void keyPressed(KeyEvent oEvento) {
		System.out.println(oJogador.getPosicao());
		oJogador.keyPressed(oEvento);		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void actionPerformed(ActionEvent oEvento) {
		oJogador.tick();
	}
	
	public void paintComponent(Graphics oGraph) {
		
		super.paintComponent(oGraph);
		
		renderizaBackground(oGraph);
		
		renderizaJogador(oGraph, this);
		
		Toolkit.getDefaultToolkit().sync();
	}
	
	private void renderizaJogador(Graphics oGraph, ImageObserver oObserver) {
		
		oJogador.draw(oGraph, oObserver);
	}
	
	private void renderizaBackground(Graphics oGraph) {
		
		oGraph.setColor(new Color(232, 232, 232));
		
		for(int iLinha = 0; iLinha < LINHAS; iLinha++) {
			for(int iColuna = 0; iColuna < COLUNAS; iColuna++) {
				if((iLinha + iColuna) % 2 == 1) {
					oGraph.fillRect(
							iColuna *TAMANHO_CABECALHO, 
							iLinha * TAMANHO_CABECALHO,
							TAMANHO_CABECALHO,
							TAMANHO_CABECALHO);
				}
			}
		}
	}
}
