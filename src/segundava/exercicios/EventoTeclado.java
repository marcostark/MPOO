package segundava.exercicios;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EventoTeclado extends KeyAdapter{

	/*
	 * Extendendo da classe KeyAdapter é possivél implementar
	 * apenas apenas o metodo que desejar (KeyTyped, KeyReleased, KeyPressed)
	 * */
	
	@Override
	public void keyPressed(KeyEvent e) {
		super.keyPressed(e);
	}
	
	

}
