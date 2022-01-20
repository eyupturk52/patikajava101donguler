public class main {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        boolean asal;
        for(i=2;i<100;i++){
            asal=true;
            for (j=2;j<i;j++) {
                if (i % j == 0) {
                    asal=false;
                }
            }
        if(asal==true){
            System.out.print(i+ " ");
        }
        }
    }
}
