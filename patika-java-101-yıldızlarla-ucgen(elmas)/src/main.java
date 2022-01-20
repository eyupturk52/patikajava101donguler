import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int satır;
        Scanner input=new Scanner(System.in);
        System.out.println("satır sayısını giriniz:");
        satır= input.nextInt();
        for(int i=0;i<satır;i++){
            for(int j=0;j<satır-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
       for(int i=1;i<satır;i++){
           for(int j=0;j<i;j++){
               System.out.print(" ");
           }
           for(int k=(2*(satır-i)-1);k>0;k--){
               System.out.print("*");
           }
           System.out.println();
       }

    }
}
