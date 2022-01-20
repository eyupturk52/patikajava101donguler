import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int sayı;
        int enkucuk=0;
        int enbuyuk=0;
        Scanner input=new Scanner(System.in);
        System.out.println("kaç tane sayı gireceksiniz");
        sayı= input.nextInt();
        int tempnumber;
        for(int i=1;i<=sayı;i++){
            System.out.println(i+ "sayıyı girin:");
            tempnumber=input.nextInt();
            if(i==1) {
                enkucuk = tempnumber;
                enbuyuk = tempnumber;
            }
            if(tempnumber<enkucuk){
                enkucuk=tempnumber;
            }
            if(tempnumber>enbuyuk){
                enbuyuk=tempnumber;
            }
        }
        System.out.println("girdiginiz sayılardan en kücüğü:" +enkucuk);
        System.out.println("girdiginiz sayılardan en büyüğü:" +enbuyuk);
    }
}
