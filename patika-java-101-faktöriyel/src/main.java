import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int n,r;
        Scanner input = new Scanner(System.in);
        System.out.println("kombinasyonu alınacak sayıyı giriniz:");
        n= input.nextInt();
        System.out.println("kaçıncı kombinasyonunu almak istiyorsunuz:");
        r= input.nextInt();
        int faktoriyel=1, faktoriyel1=1;
        int faktoriyel2=1;
        for(int i=1;i<=n;i++){
        faktoriyel *=i;
        }
        for(int i=1;i<=r;i++){
            faktoriyel1 *=i;
        }
        for(int i=1;i<=(n-r);i++){
            faktoriyel2 *=i;
        }
        double kombinasyon;
        kombinasyon=faktoriyel/(faktoriyel1*faktoriyel2);
        System.out.println("kombinasyon=" +kombinasyon);
    }
}
