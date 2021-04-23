package ejercicio3;

public class Principal {
	public static void main(String[] args) {
		int num = 9;
		Hilo1 h1 = new Hilo1(num);
		Thread t1 = new Thread(h1);
		t1.start();
	}

}
