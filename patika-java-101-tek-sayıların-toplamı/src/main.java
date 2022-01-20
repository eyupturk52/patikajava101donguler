import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int a;
        Scanner input=new Scanner(System.in);
        int toplam=0;
        do{
            System.out.println("bir sayı giriniz");
            a = input.nextInt();
            if(a%2==0 && a%4==0){
            toplam=toplam+a;
            }

        }while(a%2==0);
        System.out.println("girdiginiz sayılardan çift ve 4 ün katı olanların toplamı:" +toplam);
    }
}
