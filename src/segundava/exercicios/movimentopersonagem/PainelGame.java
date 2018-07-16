package segundava.exercicios.movimentopersonagem;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PainelGame extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel tela;
	private Elemento player1;
	private Elemento player2;
	
	private int larg = 50; // Padrão
	
	private boolean jogando = true;
	private final int VELOCIDADE = 4;
	
	private boolean[] controlaTecla = new boolean[4];
	
	private final int FPS = 1000 / 20;
	
	
	public PainelGame(){
		
		player1 = new Elemento(0,0, larg, larg);
		player1.velocidade =VELOCIDADE;
		
		player2 = new Elemento(0,0, larg, larg);
		
		this.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			
			@Override
			public void keyReleased(KeyEvent e) {
				setaTecla(e.getKeyCode(), false);
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				setaTecla(e.getKeyCode(), true);
			}
		});
		tela = new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, tela.getWidth(), tela.getHeight());
				
				g.setColor(Color.BLUE);
				g.fillRect(player1.x,player1.y, player1.largura, player1.altura); // Posição e tamanho do quadrado
				g.drawString("Posição atual: " 
						+ player1.x + "x" + player1.y, 5, 10);
				
				g.setColor(Color.GREEN);
				g.fillRect(420,100, player2.largura, player2.altura); // Posição e tamanho do quadrado
				
			}
			
		};
		getContentPane().add(tela);
		setSize(640,480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		//setUndecorated(true);
		setLocationRelativeTo(null);
		setVisible(true);
		
		// Posicionando jogador no centro da tela
		player1.x = tela.getWidth() / 2 - player1.x / 2;
		player1.y = tela.getHeight()  - player1.altura;
		
	}


	public void inicia() {
		long prxAtualizacao = 0;
		while(jogando) {
			if(System.currentTimeMillis() >= prxAtualizacao){
				update(); // Atualizando o tratamento dos eventos de teclado, tudo é uma única thread
				tela.repaint();
				prxAtualizacao = System.currentTimeMillis() + FPS;
			}
		}
	}
	
	// Metodo que cuida da atualização do objeto na tela
		public void update() {
			
			if(controlaTecla[0])
				player1.y -= player1.velocidade;
			
			else if (controlaTecla[1]) 
				player1.y += player1.velocidade;
			 
			if (controlaTecla[2])
				player1.x -= player1.velocidade;
			
			else if (controlaTecla[3])
				player1.x += player1.velocidade;
			
			// Se o jogador sair por um lado da tela, aparecerá no outro
			
			if(player1.x < 0) 
				player1.x = tela.getWidth() - player1.largura;
			
			if(player1.x + player1.largura > tela.getWidth())
				player1.x = 0; // Aparece do outro lado
			
			if(player1.y < 0) 
				player1.y = tela.getHeight() - player1.altura;
			
			if(player1.y + player1.altura > tela.getHeight())
				player1.y = 0; // Aparece do outro lado
			
			player2.x = 420;
			player2.y = 100;
			
			if(Util.trataColisao(player1, player2)) {
				System.out.println("Colidindo!!");
			}
		}
	
	// Solução para melhorar a perfomace dos comandos, uma vez que estão todos em uma única Thread
	protected void setaTecla(int tecla, boolean teclaPressionada) {
		
		switch (tecla) {
		case KeyEvent.VK_ESCAPE:
			jogando = false;
			System.exit(0);
			break;
		
		case KeyEvent.VK_UP:
			controlaTecla[0] = teclaPressionada;
			break;
			
		case KeyEvent.VK_DOWN:
			controlaTecla[1] = teclaPressionada;
			break;
			
		case KeyEvent.VK_LEFT:
			controlaTecla[2] = teclaPressionada;
			break;
			
		case KeyEvent.VK_RIGHT:
			controlaTecla[3] = teclaPressionada;
			break;
		}
	}
}
