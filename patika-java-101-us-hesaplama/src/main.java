import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int taban,us;
        Scanner input=new Scanner(System.in);
        System.out.println("tabanı giriniz:");
        taban= input.nextInt();
        System.out.println("ussu giriniz:");
        us= input.nextInt();
        int i=1;
        int sonuc=1;
        for(i=1;i<=us;i++){
        sonuc*=taban;
        }
        System.out.println("sonuç="+sonuc);
    }
}
