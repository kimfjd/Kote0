import java.util.Scanner;

public class Kote_2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ho=sc.nextInt();
        int mi=sc.nextInt();
        int se= sc.nextInt();
        int se1= sc.nextInt();
        int seshare=(se+se1)/60;
        int seremain=(se+se1)%60;
        int mishare=(mi+seshare)/60;
        int miremain=(mi+seshare)%60;
        int ho1=ho+mishare;
        int ho2;
        if (ho1>=24){
            ho2=ho1%24;
            System.out.println(ho2+" "+miremain+" "+seremain);
        }else {
            System.out.println(ho1+" "+miremain+" "+seremain);
        }

    }
}
