package son_tekrar2;

public class ödev1 {

	public static void main(String[] args) {
		//Recursive (özyineleme)
		
		System.out.println(r(10));
	}
	static int r(int x) {
		if(x==1) {
			return 1;
		}
		return x+r(x-1);
	}
}
