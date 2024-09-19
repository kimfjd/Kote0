import java.util.Scanner;

public class Kote_1267 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] li = new int[N];
        for(int i=0;i<N;i++){
            li[i]=sc.nextInt();
        }
        int dudtlr=0;
        int alstlr=0;
        int Y=10;
        int M=15;
        for(int i=0;i<li.length;i++){
            int dudtlrdyrma=(li[i]/30)+1;
            dudtlr=dudtlr+(Y*dudtlrdyrma);
            int alstlrdyrma=(li[i]/60)+1;
            alstlr=alstlr+(M*alstlrdyrma);
        }
        if(dudtlr==alstlr){
            System.out.print("Y "+"M "+dudtlr);
        } else if (dudtlr>alstlr) {
            System.out.print("M "+alstlr);
        }else {
            System.out.print("Y "+dudtlr);
        }
    }
}
