package son_tekrar2;

public class palindromik_stringler {

	public static void main(String[] args) {
		String str = "kapakk",temp="";
		 
		for(int i = str.length()-1;i>=0;i--) {
			temp += str.charAt(i);
		}
		if(str.equals(temp)) {
			System.out.println("palindromik");
		}else {
			System.out.println("palindromik değil");
		}

	}

}
