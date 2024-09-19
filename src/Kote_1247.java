import java.math.BigInteger;
import java.util.Scanner;

public class Kote_1247 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger ze= BigInteger.valueOf(0);
        BigInteger[] aa = new BigInteger[3];
        for(int j=0;j<3;j++){
            int N= sc.nextInt();
            BigInteger sum= BigInteger.valueOf(0);
            BigInteger[] li = new BigInteger[N];
            for(int i=0;i<N;i++){
                li[i]=sc.nextBigInteger();
            }
            for(int i=0;i<li.length;i++){
                sum =sum.add(li[i]);
            }
            aa[j]=sum;
        }
        for(int i=0;i<3;i++){
            int compare=aa[i].compareTo(ze);
            if(compare==0){
                System.out.println("0");
            } else if (compare==1) {
                System.out.println("+");
            } else{
                System.out.println("-");
            }
        }

    }
}
