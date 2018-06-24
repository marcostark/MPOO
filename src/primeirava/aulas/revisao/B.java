package primeirava.aulas.revisao;

public class B extends A{

	@Override
	public void metodo(String msg) {
		super.metodo(msg);
	}
	
	
	public static void main(String[] args) {
		
		B b = new B();
		b.metodo("OLá mundo!");
		
	}
	
}
