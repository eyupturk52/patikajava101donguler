import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String userName,password;
        Scanner input =new Scanner(System.in);
        int right=3;
        int balance=1500;
        int select;
        boolean islem=true;
        while(right>0) {
            System.out.print("kullanıcı adınız:");
            userName = input.nextLine();
            System.out.println("şifrenizi giriniz:");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("merhaba kodluyoruz bankasına hoşgeldiniz:");
                while (islem){
                    System.out.print("1-para yatırma\n" +
                            "2-para çekme\n" +
                            "3-bakiye sorgula\n" +
                            "4-çıkış yap\n");
                System.out.println("yapmak istediğiniz işlemi seçin:");
                select = input.nextInt();
                switch (select) {
                    case 1:
                        System.out.println("para miktarı:");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println("toplam bakiye:" + balance);
                        break;
                    case 2:
                        System.out.println("çekmek istediğiniz tutar:");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("bakiye yetersiz");
                        } else {
                            balance -= price;
                        }
                        System.out.println("toplam bakiye:" + balance);
                        break;
                    case 3:
                        System.out.println("bakiye:" + balance);
                        break;
                    case 4:
                        System.out.println("tekrar görüşmek üzere");
                        right=-1;
                        islem = false;
                        break;
                    default:
                        System.out.println("hatalı tercih yaptınız");
                        islem = false;
                        break;
                }
            }
        }
        else{
                    right--;
                    System.out.println("hatalı kullanıcı adı veya şifre." +
                            "tekrar deneyin:");

                if(right==0){
                    System.out.println("kartınız iptal olmuştur.lütfen şubeye gidiniz");
                }
                else{
                    System.out.println("kalan hakkınız:" +right);
                }

            }
        }
    }
}
