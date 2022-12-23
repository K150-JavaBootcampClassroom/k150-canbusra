import java.util.Random;
import java.util.Scanner;

public class RANDOM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int sayac = 0;
        int sayi;
        int rastgele;
        while (true) {
            rastgele = rnd.nextInt(500);
            System.out.println("Rastgele atanan değer:" + rastgele);
            sayac++;
            if (50 < rastgele && 100 > rastgele) {

                System.out.println("50 ile 100 arasındaki sayı "+sayac + ".seçimde bulundu");
                break;

            }




        }
    }
}

