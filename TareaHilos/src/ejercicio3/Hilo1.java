package ejercicio3;

public class Hilo1 extends Thread{
	private int num;
	public Hilo1(int num) {
		this.num = num;
	}
	@Override
	public void run() {
		int fac = 1;
		for(int i = num ; i>=1 ; i--) {
			fac = fac * i;
		}
		System.out.println("--- RESULTADO DEL HILO 1 ---");
		System.out.println("FACTORIAL DEL NUMERO: "+ fac);
	}
	

}
