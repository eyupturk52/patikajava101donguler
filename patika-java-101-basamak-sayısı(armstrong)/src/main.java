import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int sayı;
        Scanner input=new Scanner(System.in);
        System.out.println("sayıyı giriniz:");
        sayı= input.nextInt();
        int tempnumber;
        int toplam=0;
        tempnumber=sayı;
        int bölüm;
        while(tempnumber!=0){
        bölüm=tempnumber%10;
        tempnumber=tempnumber/10;
        toplam+=bölüm;
        }
        System.out.println(sayı+ " sayısının basamakları toplamı=" +toplam);

    }
}
