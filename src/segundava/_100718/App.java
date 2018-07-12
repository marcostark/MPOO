package segundava._100718;

public class App {
	
	public static void main(String[] args) throws InterruptedException {
		
		PingPong ping = new PingPong("Ping",1000);
		PingPong pong = new PingPong("Pong",800);
		
		ping.start();
		pong.start();
		
	}

}
