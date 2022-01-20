import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int sayı;
        Scanner input =new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        sayı= input.nextInt();
        int toplam=0;
        for(int i=1;i<sayı;i++){
            if(sayı%i==0){
                toplam+=i;
            }
        }
        if(toplam==sayı){
            System.out.println("girdiginiz sayı mükemmel sayıdır.");

        }
        else{
            System.out.println("girdiginiz sayı mukemmel sayı degildir.");
        }
    }
}
