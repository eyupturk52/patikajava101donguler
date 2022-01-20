import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double sayı;
        double toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        sayı= input.nextDouble();
        double i;
        for(i=1;i<=sayı;i++){
            toplam+=1/i;
        }
        System.out.println("girdiginiz sayının harmonik toplamı:"+toplam);
    }
}
