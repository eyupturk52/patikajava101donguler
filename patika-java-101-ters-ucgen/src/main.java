import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int sayı;
        Scanner input=new Scanner(System.in);
        System.out.println("basamak sayısını giriniz:");
        sayı= input.nextInt();
        int i=1;
        for(i=1;i<=sayı;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=2*(sayı-i)+1;k>0;k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
