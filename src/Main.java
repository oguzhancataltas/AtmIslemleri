import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int select;
        int balance = 1500;
        int out = 1;



        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = scanner.nextLine();

            System.out.print("Parolanız : ");
            password = scanner.nextLine();

            if (userName.equals("Patika") && password.equals("dev123")) {
                System.out.println("Kullanıcı Girişi Başarılı.");
                System.out.println("Kodluyoruz Bankasına Hoşgeldiniz");
                do {

                    System.out.println(
                            "1-) Para Yatırma\n" +
                            "2-) Para Çekme\n" +
                            "3-) Bakiye Sorgulama\n"
                    );
                    System.out.print("Lütfen İşlem Seçiniz : ");
                    select = scanner.nextInt();

                    switch (select) {
                        case 1:

                            System.out.print("Yatıracağınız Tutarı Giriniz : ");
                            int price = scanner.nextInt();

                            balance += price;

                            System.out.println("Yeni Bakiyeniz : " + balance);
                            System.out.println("Başka bir işlem yapmak ister misiniz ?\n" +
                                    "1-) Evet\n" +
                                    "2-) Hayır");
                            System.out.print("Seçiminiz : ");
                            out = scanner.nextInt();
                            if ( out == 2){
                                System.out.println("Çıkış Yapılıyor !!!");

                            }
                            break;

                        case 2:
                            System.out.print("Çekeceğiniz Tutarı Giriniz : ");
                            price = scanner.nextInt();

                            if (price > balance){
                                System.out.println("Yeterli Bakiyeniz bulunmamaktadır!!!");
                            }else {
                                balance -= price;
                                System.out.println("Yeni Bakiyeniz : " + balance);
                            }
                            System.out.println("Başka bir işlem yapmak ister misiniz ?\n" +
                                    "1-) Evet\n" +
                                    "2-) Hayır");
                            System.out.print("Seçiminiz : ");
                            out = scanner.nextInt();
                            if ( out == 2){
                                System.out.println("Çıkış Yapılıyor !!!");

                            }
                            break;

                        case 3:
                            System.out.println("Mevcut Bakiyeniz : " + balance);

                            System.out.println("Başka bir işlem yapmak ister misiniz ?\n" +
                                    "1-) Evet\n" +
                                    "2-) Hayır");
                            System.out.print("Seçiminiz : ");
                            out = scanner.nextInt();

                            if ( out == 2){
                                System.out.println("Çıkış Yapılıyor !!!");

                            }
                            break;

                    }

                }while (out != 2);
                System.out.println("İyi Günler");
                break;
            }else {
                right--;
                if (right == 0){
                    System.out.println("Giriş Hakkınız Kalmadı. Banka ile iletişime geçin.");
                    break;
                }else {
                    System.out.println("Hatalı Giriş !!!");
                    System.out.println("Kalan Hakkınız : " + right);
                }

            }
        }

    }
}
