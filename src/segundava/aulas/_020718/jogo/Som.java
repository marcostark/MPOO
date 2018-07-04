package segundava.aulas._020718.jogo;
import java.applet.Applet;
import java.applet.AudioClip;

public class Som {
	
	private AudioClip abertura, andar;
	
	public Som(){
		abertura = Applet.newAudioClip(this.getClass().getResource("abertura.wav"));
		andar = Applet.newAudioClip(this.getClass().getResource("caixa.wav"));
	}

	public void aberturaSom(){abertura.play();}
	public void aberturaSomParar(){abertura.stop();}
	public void andarSom(){andar.play();}
}