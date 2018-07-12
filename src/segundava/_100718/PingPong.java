package segundava._100718;

public class PingPong extends Thread {

	private String palavra;
	private int esperar;

	public PingPong(String palavra, int esperar) {
		this.palavra = palavra;
		this.esperar = esperar;
	}

	public void run() {
		try {
			for (;;) {
				System.out.println(this.palavra);
				Thread.sleep(esperar);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
