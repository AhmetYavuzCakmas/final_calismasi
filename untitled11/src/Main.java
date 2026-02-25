// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void password(String isim) {

        if (isim.length() < 3) {
            System.out.print("İsim en az 3 karakter olmalıdır.");
        }

        isim = isim.substring(0, 2);
        isim = isim + "*".repeat(isim.length() - 1);

        System.out.println(isim);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("adınızı giriniz: ");
        String isim = input.nextLine();

        System.out.print(password(isim));

    }
}