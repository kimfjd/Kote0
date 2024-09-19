import java.util.Scanner;

public class Kote_1547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int x=1;
        for(int i=0;i<N;i++){
            int x2=sc.nextInt();
            int x3=sc.nextInt();
            if(x==x2){
                x=x3;
            } else if (x==x3) {
                x=x2;
            }
        }
        System.out.println(x);
    }
}
