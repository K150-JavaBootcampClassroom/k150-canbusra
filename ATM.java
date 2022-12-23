import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        int bakiye = 10000, paracekme,parayatirma,şifre,yapılacakişlem;
        Scanner sc=new Scanner(System.in);

        while (true)
        {
            System.out.println("Merhaba Büşra,Bankamıza Hoşgeldiniz");
            System.out.println("Bankamızın size özel tekliflerini degerlendirmek için lütfen 0212 586 12 45 numaralı müşteri hizmetinden yardım alınız");
            System.out.println("Lütfen Şifrenizi Giriniz");
            şifre=sc.nextInt();
            for (int i=1;i<4;i++){
                if (şifre==123456) {
                    System.out.println("GİRİŞ BAŞARILI");
                    break;
                }
                    else if (i==3) {
                    System.out.println("Çok Sayıda Hatalı Giriş Yaptınız,Sistemden Çıkılıyor");
                    System.exit(0);
                }
                    else{
                        System.err.println("Hatalı Şifre Girdiniz!");
                        System.err.println("Lütfen Şifrenizi Giriniz");
                        şifre=sc.nextInt();

                    }
                }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Para Çekmek İçin 1'e");
            System.out.println("Para Yatırmak İçin 2'e");
            System.out.println("Bakiye Kontrolü İçin 3'e");
            System.out.println("Çıkış İçin 4'e Basınız");
            System.out.println("Lütfen yapılacak işlemi giriniz:");
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
            yapılacakişlem=sc.nextInt();
            switch (yapılacakişlem){

                case 1:
                    System.out.println("Çekilecek miktarı giriniz:");
                    paracekme= sc.nextInt();
                    if (bakiye>=paracekme){
                        bakiye=bakiye-paracekme;
                        System.out.println("lütfen paranızı alınız");
                        int kalanbakiye=bakiye;
                        System.out.println("Kalan Bakiye:"+kalanbakiye);
                    }
                    else {
                        System.out.println("Yetersiz Bakiye");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Yatırılacak miktarı Giriniz");
                    parayatirma=sc.nextInt();
                    bakiye=bakiye+parayatirma;
                    System.out.println("Paranız Yatırılmıştır");
                    int yenibakiye=bakiye;
                    System.out.println("Yeni Bakiye:"+yenibakiye);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Bakiye:"+bakiye);
                    System.out.println();
                    break;

                case 4:
                    System.exit(0);

            }
        }

    }
}