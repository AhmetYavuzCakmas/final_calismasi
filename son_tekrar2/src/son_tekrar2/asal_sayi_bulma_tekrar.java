package son_tekrar2;

import java.util.Scanner;

public class asal_sayi_bulma_tekrar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Sayi giriniz: ");
		double sayi = input.nextDouble();
		
		if(sayi<0) {
			System.out.println("negatif sayının asallığı kontrol edilemez");
		}
		if(sayi ==1) {
			System.out.println("1 asal sayı değildir");
		}
		if(sayi %1 !=0) {
			System.out.println("ondalık sayı girmeyiniz.");
		}
		
		for(int i = 2;i<=sayi/2;i++) {
				if(sayi %i==0) {
					System.out.println((int)sayi+" sayısı asal değildir");
					break;
					
				}else {
					System.out.println((int)sayi+" sayısı asaldır");
					break;
			}
		}
	}

}

