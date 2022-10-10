package GameTest;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Jogador {
	
	private BufferedImage oImagem;
	
	private Point oPosicao;
	
	public Jogador() {
		
		carregaImagem();
		
		oPosicao = new Point(0,0);
	}
	
	private void carregaImagem() {
		try {
			oImagem = ImageIO.read(new File("./src/GameTest/TempleRun/player.png"));
		} catch (IOException oEx) {
			System.out.println("Erro ao abrir o arquivo de imagem: " + oEx.getMessage());
		}
	}
	
	public void draw(Graphics oGraph, ImageObserver oObserver) {
		
		oGraph.drawImage(
			oImagem,
			oPosicao.x * Quadro.TAMANHO_CABECALHO,
			oPosicao.y * Quadro.TAMANHO_CABECALHO,
			oObserver
		);	
	}
	
	public void keyPressed(KeyEvent oEvento) {
		
		getPosicao();
		
		int iKey = oEvento.getKeyCode();
		
		if(iKey == KeyEvent.VK_UP) {
			oPosicao.translate(0, -1);
		}
		if(iKey == KeyEvent.VK_RIGHT) {
			oPosicao.translate(1, 0);
		}
		if(iKey == KeyEvent.VK_DOWN) {
			oPosicao.translate(0, 1);
		}
		if(iKey == KeyEvent.VK_LEFT) {
			oPosicao.translate(-1, 0);
		}	
	}
	
	public void tick() {
		
		if(oPosicao.x < 0) {
			oPosicao.x = 0;
		}
		else if(oPosicao.x >= Quadro.COLUNAS) {
			oPosicao.x = Quadro.COLUNAS - 1;
		}
		
		if(oPosicao.y < 0) {
			oPosicao.y = 0;
		}
		else if(oPosicao.y >= Quadro.LINHAS) {
			oPosicao.y = Quadro.LINHAS - 1;
		}
	}
	
	public Point getPosicao() {
		return oPosicao;
	}
}
