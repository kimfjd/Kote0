import java.math.BigInteger;
import java.util.Scanner;

public class Kote_1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String SN=sc.nextLine();
        BigInteger a=new BigInteger(SN, 8);
        String b = a.toString(2);
        String[] c=new String[b.length()];
        for(int i=0;i<b.length();i++){
            c[i]= String.valueOf(b.charAt(i));
        }
        for(int i=0;i<c.length;i++){
            if(c[i].equals(0)){
                c[i]=null;
            } else if (c[i].equals(1)) {
                break;
            }
        }
        for(int i=0;i<c.length;i++){
            if(c[i].equals(null)){

            } else {
                System.out.print(c[i]);
            }
        }
    }
}
