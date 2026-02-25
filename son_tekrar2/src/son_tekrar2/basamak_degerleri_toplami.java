package son_tekrar2;

import java.util.Scanner;

public class basamak_degerleri_toplami {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("sayı giriniz: ");
		int number = input.nextInt();
		
		int number_length = String.valueOf(number).length();
		int i = 0;
		int total = 0;
		while(i<number_length) {
			total += number %10;
			number = (int)number/10;
			i++;
			
		}	
		System.out.println("girdiğiniz sayının basamak değerlerinin toplamı: "+total);
	
	}

}
