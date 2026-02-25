package son_tekrar2;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		int[] liste = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i = 0;i<liste.length;i++) {
			liste[i] = scan.nextInt();
		}
		
		for(int i = 0;i<liste.length;i++) {
			System.out.println(liste[i]);
		}
	}

}
