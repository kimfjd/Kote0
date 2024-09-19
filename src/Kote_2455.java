import java.util.Scanner;

public class Kote_2455 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a1= sc.nextInt();
        int a2= sc.nextInt();
        int b1= sc.nextInt();
        int b2= sc.nextInt();
        int c1= sc.nextInt();
        int c2= sc.nextInt();
        int d1= sc.nextInt();
        int d2= sc.nextInt();
        int toa;
        int tob;
        int toc;
        int tod;
        toa=a2;
        tob=toa-b1+b2;
        toc=tob-c1+c2;
        tod=toc-d1+d2;
        int t4;
        int t5;
        int t;
        if(toa>tob){
            t4=toa;
        }else {
            t4=tob;
        }
        if(toc>tod){
            t5=toc;
        }else {
            t5=tod;
        }
        if(t4>t5){
            System.out.println(t4);
        }else {
            System.out.println(t5);
        }
    }
}
