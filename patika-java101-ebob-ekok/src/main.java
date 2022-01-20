import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int n1,n2;
        Scanner input=new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz:");
        n1=input.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        n2= input.nextInt();
        int ebob=1,ekok;
        int i=1;
        while(i<n1){
            if(n1%i==0 && n2%i==0){
            ebob=i;
            }
            i++;
        }
        System.out.println("ebob:" +ebob);
        ekok=(n1*n2)/ebob;
        System.out.println("ekok:" +ekok);
    }
}
