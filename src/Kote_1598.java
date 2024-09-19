import java.util.Scanner;

public class Kote_1598 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T1=sc.nextInt();
        int T2=sc.nextInt();
        int L=0;
        int S=0;
        int X=0;
        int Y=0;
        int Q=0;
        if(T1>T2){
            L=T1;
            S=T2;
        }else if(T1<T2){
            L=T2;
            S=T1;
        }
        while (true){
            if(S>L){
                break;
            }else {
                S=S+4;
                Q++;
            }
        }
        Y=Math.abs((S-4)-L);
        X=Q;
        System.out.println(X+Y);
    }
}
