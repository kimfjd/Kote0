import java.util.Scanner;

public class Kote_1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int m=sc.nextInt();
        int M=sc.nextInt();
        int T=sc.nextInt();
        int R=sc.nextInt();
        int x=m;
        int n=0;
        int t=0;
        while (true){
            if(n==N){
                break;
            }

            else {
                if(x+T>M&&m+T<=M){
                    x=x-R;
                    t++;
                    if(x<=m){
                        x=m;
                    }
                } else if (x+T<=M) {
                    x=x+T;
                    t++;
                    n++;
                }else {
                    t=-1;
                    break;
                }
            }
        }

        System.out.println(t);
    }
}
