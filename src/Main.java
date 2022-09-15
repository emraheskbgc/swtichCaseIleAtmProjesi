import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int balance = 1500;
        int right = 3;
        int select;
        int price;
        while (right > 0){
            System.out.print("Lütfen Kullanıcı Adını Giriniz = ");
            userName = input.nextLine();
            System.out.print("Lütfen Parolanızı Giriniz = ");
            password = input.nextLine();
            if (userName.equals("emrah") && password.equals("367244")){
                System.out.println("Merhaba A Bankasına Hoşgeldiniz!");
                do {
                    System.out.println(
                            "1-Para Yatırma\n"+
                            "2-Para Çekme \n"+
                            "3-Bakiye Sorgulama\n"+
                            "4-Çıkış Yap"
                    );
                    System.out.print("Lütfen Seçim Yapınız = ");
                    select = input.nextInt();
                    switch (select){
                        case 1 :
                            System.out.print("Yatırılıcak Para Miktarı = ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2 :
                            System.out.print("Çekilecek Para Miktarı = ");
                            price = input.nextInt();
                            if (price > balance){
                                System.out.println("Bakiyeniz Yetersizdir .");
                            }else{
                                balance -= price;
                            }
                            break;
                        case 3 :
                            System.out.println("Bakiyeniz = " + balance);
                            break;
                    }
                }while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere");
                break;
            }else{
                right--;

                if (right == 0){
                    System.out.println("Hesabınız Bloke Olmuştur Lütfen Bankamız ile İltişime Geçiniz!");
                }else
                {
                    System.out.println("Kullanıcı Adınız Veya Parolanız Yanlıştır. Lütfen Tekrar Deneyiniz.");
                    System.out.println("Kalan Hakkınız = " + right);
                }

            }
        }


    }
}
