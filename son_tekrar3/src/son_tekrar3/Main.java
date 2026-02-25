package son_tekrar3;

public class Main {

	public static void main(String[] args) {
		Islemler_thread i1 = new Islemler_thread("ilk");
		Thread t1 = new Thread(i1);
		
		Islemler_thread i2  = new Islemler_thread("son");
		Thread t2 = new Thread(i2);
		
		t1.start();
		t2.start();
	}

}
