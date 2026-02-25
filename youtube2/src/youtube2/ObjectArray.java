package youtube2;
class Monkey{
	String trpe = "Spider Monkey";
	
	public static void sayOhhaAhh() {
		System.out.println("ohhhaahhhhohhh");
	}
}




public class ObjectArray {

	public static void main(String[] args) {
		Monkey m1 = new Monkey();
		Monkey m2 = new Monkey();
		Monkey m3 = new Monkey();
		
		Monkey[] monkeys = {m1,m2,m3};
		
		for(Monkey m:monkeys) {
			m.sayOhhaAhh();
		}
		
	}

}
