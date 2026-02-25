package youtube;

import java.util.Date;

import java.util.concurrent.ConcurrentHashMap;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
public class alexlee {

	public static void main(String[] args) {
		/*
		public static void main(String[] args) {
			String backpack[] = {"a","n","v"};
			int zombies[] = {1,2 ,3,5,889};
	*/

		Scanner input = new Scanner(System.in);
		
		System.out.print("enter a number: ");
		int a =input.nextInt();
		
		System.out.print("enter another a number: ");
		int b =input.nextInt();
		
		System.out.println("sonuç: "+(a+b));

	
/*		
		System.out.println("enter a sentence: ");
		 Scanner input  = new Scanner(System.in);
		 
		 String a = input.next();
		 System.out.println(a);
*/
/*		
		int[] grades = {79, 454, 48,33};
		for(int i=0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
*/
/*	
		for(int i = 0; i<5;i++) {
			for(int j = 0;j<3;j++) {
				System.out.println("i: "+i+" j: "+j );
			}
		}
*/
/*
		Scanner input = new Scanner(System.in);
		System.out.print("sayı giriniz: ");
		int a = input.nextInt();
		for(int i= 1;i<=a;i++) {
			for(int j=0; j<i;j++) {
				System.out.print("<");
			}
			System.out.println();
		}
		for(int i =a-1;i>0;i--) {
			for(int j=0; j<i;j++) {
				System.out.print(">");
			}
			System.out.println();
		}
*/
/*
		multiplay(88,89);
		
		
	}
	public static void multiplay(int a,int b) {
		System.out.println(a +" * "+ b +": " +(a * b));
*/
		/*
		String shouting = caps("anne neden günlüğümü okuyorsun? ");
		System.out.println(shouting);
	*/
		
/*
		konusma("yavuz",45);

	}
	*/
		
	/*
	public static String caps( String s) {
		return s.toUpperCase();
	}*/
	/*
	public static String konusma(String isim, int sayi) {
		System.out.println("anne "+isim+" i gördün mü "+sayi+ " yaşında");
		return isim;
	*/
		
/*
		String sentence = "ne kadar kopyalama yaptık bunu gösteririr";
		
		String character = "";
		String duplicate = "";
		for (int i = 0;i < sentence.length();i++) {
			String current = Character.toString(sentence.charAt(i));
			if(character.contains(current)) {
				if(!duplicate.contains(current)) {
					duplicate += current;
				}
			}
			System.out.println(current);
			character += current;
			
		}
		System.out.println(duplicate);
		System.out.println(character);
		
*/
/*
		Date currentDate = new Date();
		System.out.println(currentDate);
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm");
		System.out.println(timeFormat.format(currentDate));
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(dateFormat.format(currentDate));
		
		SimpleDateFormat dayOfWeek = new SimpleDateFormat("EEEE");
		System.out.println(dayOfWeek.format(currentDate));
	*/
	/*	
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(2004, 6,22);
		int years = Period.between(birthday,today).getMonths();
		System.out.println(years);
		*/
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("harf tahmini yapınız: ");
		String harf = input.nextLine();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		int rastgele = random.nextInt(alphabet.length());
		char rastgeleharf = alphabet.charAt(rastgele);
		System.out.println(rastgeleharf);
		while(rastgeleharf != harf.charAt(0)) {
			System.out.println("Yanlış tahmin! Tekrar harf tahmini yapınız: ");
            harf = input.nextLine(); 
		}
		System.out.println("Tebrikler! Doğru harfi bildiniz: " + rastgeleharf);
	*/
		/*
		System.out.println("cümle giriniz: ");
		Scanner input = new Scanner(System.in);
		String cumle = input.nextLine();
		
		ArrayList<String>  kelimeler= new ArrayList<String>();
		Scanner cumleScanner = new Scanner(cumle);
		
		while(input.hasNext()) {
			kelimeler.add(input.next());
			
		}
		System.out.println(kelimeler);
	*/
		/*
		System.out.println("Cümle giriniz: ");
        Scanner input = new Scanner(System.in);
        String cumle = input.nextLine();
        
        ArrayList<String> kelimeler = new ArrayList<String>();
        Scanner cumleScanner = new Scanner(cumle); // Cumle için yeni bir Scanner oluştur
        
        while(cumleScanner.hasNext()) {
            kelimeler.add(cumleScanner.next());
        }
        
        System.out.println("Ayrılan kelimeler: " + kelimeler);
	*/
	/*
		File file = new File("/Users/User/Desktop/captmidn.txt");
		Scanner input = new Scanner(file);
		while(input.hasNextLine()) {
			System.out.println(input.nextLine());
			
		}
		*/	
		
		
		/*
		String  r = reverse("yavuz");
		System.out.println(r);
	}
	public static String reverse(String s) {
		char[] letters = new char[s.length()];
		
		int letterIndex = 0;
		for (int i = s.length()-1;i>=0;i--) {
			letters[letterIndex] = s.charAt(i);
			letterIndex++;
		}
		String reverse ="";
		for(int i = 0;i<s.length();i++){{
			reverse = reverse+letters[i];
		}
		
		return reverse;
	
		}
		*/
	}	
}
