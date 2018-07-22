package segundava.exercicios.tileSprite;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Sprite{
	BufferedImage spriteSheet;   
	int width, height;
	int rows, columns;
	int posX, posY;// Atributo de Personagem
	BufferedImage[] sprites;
	int aparencia;
	
	public Sprite(File file, int aparencia, int columns, int rows, int posX, int posY) throws IOException {
		spriteSheet = ImageIO.read(file);
		this.aparencia=aparencia;
//		this.width = width;
//		this.height = height;
		
		this.width = spriteSheet.getWidth()/columns;
		this.height = spriteSheet.getHeight()/rows;

		this.rows = columns;
		this.columns = rows;
		this.posX=posX;
		this.posY=posY;

		sprites = new BufferedImage[columns * rows];
			for(int i = 0; i < columns; i++) {
			for(int j = 0; j < rows; j++) {
				sprites[(i * rows) + j] = spriteSheet.getSubimage(i * width, j * height, width, height);
			}
		}
	}
}