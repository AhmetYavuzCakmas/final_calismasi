package heli;

public class Main {

	public static void main(String[] args) {
		Motor myMotor= new Motor(700, 1000);
		Pervane myPervane = new Pervane(10,2000);
		Depo myDepo = new Depo(200);
		Helikopter sikorsky = new Helikopter(178, myMotor, myPervane, myDepo);
		
		sikorsky.getMotor().motoruCalistir();
		sikorsky.getMotor().motoruKapat();
		
		Motor myMotor1= new Motor(520, 1200);
		Pervane myPervane1 = new Pervane(20,8000);
		Depo myDepo1 = new Depo(300);
		Helikopter bell = new Helikopter(189, myMotor1, myPervane1, myDepo1);
		
		sikorsky.getMotor().motoruCalistir();
		sikorsky.getMotor().motoruKapat();
		
	}

}
