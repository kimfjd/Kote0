import java.math.BigInteger;
import java.util.Scanner;

public class Kote_1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long[] li=new long[n];
        for(int i=0;i<n;i++) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            li[i]= ((long) Math.pow(a,b))%10;
        }
        for (int i=0;i<n;i++){
            System.out.println(li[i]);
        }
    }
}
