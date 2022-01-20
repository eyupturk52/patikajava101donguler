import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int a;
        Scanner input=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        a= input.nextInt();
        System.out.println("girdiginiz sayıya kadar 3 e ve 4 e bölünen sayılar:");
        int sayac=0;
        int toplam=0;
        double ortalama;
        for(int i=1;i<=a;i++){
            if(i%3==0 && i%4==0){
                System.out.println(i);
                toplam+=i;
                sayac++;
            }
        }
        ortalama=toplam/sayac;
        System.out.println("ortalama=" +ortalama);
    }
}
