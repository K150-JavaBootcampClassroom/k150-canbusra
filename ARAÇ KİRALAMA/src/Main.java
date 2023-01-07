
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        int sirkethesap = 123456;
        int vatandashesap= 654321;
        int hesap;
        System.out.println("lütfen hesabınıza giriş yapınız!!!");
        System.out.println("----------------------------------");
        Scanner sc = new Scanner(System.in);
        hesap = sc.nextInt();

        if (hesap == sirkethesap) {
            System.out.println("SUV model arabalar:");
            System.out.println("Sedan model arabalar:");
            System.out.println("Hatchback model arabalar:");
        }
        if(hesap==vatandashesap){
            System.out.println("Hatchback model arabalar:");
        }



        }
    }
