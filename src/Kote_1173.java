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
        int t=0;
        for (int i=0;i<=N;i++){
            if(x+T>M){
                i--;
                t++;
            } else if (x-R<m) {
                t++;
            }else if(x-R>m&&x+T<M){
                t++;
            }else {
                System.out.println("-1");
            }
        }
        System.out.println(t);
    }
}
