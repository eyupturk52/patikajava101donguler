import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int sayı;
        Scanner input=new Scanner(System.in);
        System.out.println("sayı giriniz:");
        sayı=input.nextInt();
        int i,j;
        System.out.println("4 un kuvvetleri");
        for(i=1;i<=sayı;i*=4){
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("5 ın kuvvetleri");
        for(j=1;j<=sayı;j*=5){
            System.out.print(j+ " ");
        }
    }
}
