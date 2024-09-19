import java.math.BigInteger;
import java.util.Scanner;

public class Kote_1837 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        BigInteger pq= sc.nextBigInteger();
        BigInteger k= sc.nextBigInteger();
        int k1 = k.intValue();
        BigInteger aa= BigInteger.valueOf(2);
        BigInteger a1= BigInteger.valueOf(1);
        BigInteger a2=BigInteger.valueOf(0);
        BigInteger a = null;
        BigInteger b = null;
        int int_bigNum=0;
        for(int i=0;i<k1;i++){
            a=pq.divide(aa);
            b=pq.remainder(aa);
            aa=aa.add(a1);
            int_bigNum = b.intValue();
            if(int_bigNum==0){
                break;
            }
        }
        BigInteger aaa=aa.subtract(a1);
        int compare =a.compareTo(k);
        int compare1 =aaa.compareTo(k);
        if(compare==-1||compare1==-1){
            int compare2=a.compareTo(aa);
            if(compare2==-1){
                System.out.println("BAD "+a);
            }else {
                System.out.println("BAD "+aaa);
            }
        } else {
            System.out.println("GOOD");
        }
    }
}
