package segundava.exercicios.tileSprite;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.imageio.ImageIO;

public class TileMap{
	public  int mapa[][];
	public  BufferedImage camada;
	private BufferedImage tileSet;
	private int mapaWidth;
	private int mapaHeight;
	private int tileWidth;
	private int tileHeight;

	public TileMap(int mapaWidth, int mapaHeight, int tileWidth, int tileHeight, String img, String arquivo) {
		this.mapaWidth=mapaWidth;
		this.mapaHeight=mapaHeight;
		this.tileWidth=tileWidth;
		this.tileHeight=tileHeight;
		
		mapa = new int[mapaWidth][mapaHeight];
		mapa = carregaMatriz(mapa, arquivo);
		
		try {
			tileSet = ImageIO.read(new File(img));
		} catch (IOException e) {
			System.out.println("Erro ao carregar o TileSet.\nEncerrando aplicação");
			System.exit(0);
		}
	}

	public int[][] carregaMatriz(int[][] matz, String arquivo) {
		ArrayList<String> linhasMatrizCamada = new ArrayList<String>();
		InputStream is = getClass().getResourceAsStream (arquivo);
		BufferedReader br = new BufferedReader (new InputStreamReader (is));   
		String linha="";
		
		try {

			while ((linha = br.readLine()) != null){
				//System.out.println(linha);
				linhasMatrizCamada.add(linha);
			}
			int j = 0;
			for (int i = 0; i < linhasMatrizCamada.size(); i++) {
				StringTokenizer token = new StringTokenizer(linhasMatrizCamada.get(i), ",");

				while (token.hasMoreElements()) {
					matz[i][j] = Integer.parseInt(token.nextToken());
					j++;
				}
				j = 0;
			}
		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println("Não carregou arquivo mapa");
			System.exit(0);
		}
		catch (IOException ioException) {
			System.out.println("Erro na leitura do mapa");
			System.exit(0);
		}
		return matz;
	}

	public void montarMapa(int lar, int alt) {

		camada = new BufferedImage(lar, alt, BufferedImage.TYPE_4BYTE_ABGR);
		camada.createGraphics();

		int tile;
		int tileRow;
		int tileCol;
		int colunasTileSet=tileSet.getWidth()/tileWidth;
		
		//System.out.println(colunasTileSet);
		
		for (int i = 0; i < mapaWidth; i++) {
			for (int j = 0; j < mapaHeight; j++) {
				tile = (mapa[i][j] != 0) ? (mapa[i][j]-1) : 0;
				tileRow = (tile / (colunasTileSet)) | 0;
				tileCol = (tile % (colunasTileSet)) | 0;
				camada.getGraphics().drawImage(tileSet, (j * tileHeight), (i * tileWidth), (j * tileHeight) + tileHeight,
						(i * tileWidth) + tileWidth, (tileCol * tileHeight), (tileRow * tileWidth),
						(tileCol * tileHeight) + tileHeight, (tileRow * tileWidth) + tileWidth, null);
			}
		}
	}
}