import java.util.Scanner;

public class Kote_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int di1=sc.nextInt();
        int di2=sc.nextInt();
        int di3=sc.nextInt();
        int mon;
        if(di1==di2&&di1==di3){
            mon=10000+di1*1000;
            System.out.println(mon);
        } else if (di1==di2||di1==di3) {
//            int ma=Math.max(di1,di2);
            mon=1000+di1*100;
            System.out.println(mon);
        } else if (di2==di3) {
            mon=1000+di2*100;
            System.out.println(mon);
        }else {
            int ma=Math.max(di1,Math.max(di2,di3));
            mon=ma*100;
            System.out.println(mon);
        }
    }
}
