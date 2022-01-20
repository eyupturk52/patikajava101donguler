import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int adet;
        Scanner input=new Scanner(System.in);
        System.out.println("fibonacci serisinin eleman sayısnı girin:");
        adet= input.nextInt();
        int ilksayı=0;
        int ikincisayı=1;
        int toplam;
        System.out.println("fibonacci serisi:");
        System.out.print(ilksayı+ " ");
        System.out.print(ikincisayı+ " ");
        for(int i=2;i<adet;i++){
            toplam=ilksayı+ikincisayı;
            System.out.print(toplam+ " ");
            ilksayı=ikincisayı;
            ikincisayı=toplam;
        }
    }
}
