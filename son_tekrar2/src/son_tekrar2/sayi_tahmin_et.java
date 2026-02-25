package son_tekrar2;

import java.util.Random;
import java.util.Scanner;

public class sayi_tahmin_et {

	public static void main(String[] args) {
		Random randomm = new Random();
		int random_number = randomm.nextInt(20)+1;
		System.out.println(random_number);
		Scanner input = new Scanner(System.in);
		System.out.println("0-20 arasında sayıyı tahmin ediniz: ");
		int tahmin = input.nextInt();
		
		
		int tahmin_hakki = 4;
		while(tahmin_hakki>0) {
			
			if(tahmin<0 || tahmin >20 ) {
				System.out.println("LÜTFEN GİRDİĞİNİZ SAYI 0-20 ARASINDA OLSUN");
				System.out.println("Tekrar tahmin ediniz: "); 
				tahmin = input.nextInt();
			}else {
				System.out.println("TEKRAR TAHMİN EDİNİZ: ");
				tahmin = input.nextInt();
			}
			tahmin_hakki--;
			
			if(tahmin == random_number) {
				System.out.println("TEBRİKLER! SAYIYI TAHMİN ETTİNİZ.");
				break;}
			
			if(tahmin_hakki<=0) {
				System.out.println("TAHMİN HAKKINIZ BİTMİŞTİR.\nTAHMİN EDİLEN SAYI: "+random_number);
			}
		}

	}

}
