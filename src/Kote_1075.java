import java.util.Scanner;

public class Kote_1075 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int F= sc.nextInt();
        String StrN=Integer.toString(N);
        String a=StrN.substring(0,StrN.length()-2)+"00";
        int inta=Integer.parseInt(a);
        int b=0;
        int c=1;
        while (true){
            if(c==0){
                break;
            }
            else {
                c=inta%F;
                inta++;
                b++;
            }
        }
        String Strb=Integer.toString(b);
        b=b-1;
        if(Strb.length()==1){
            System.out.println("0"+b);
        }else {
            System.out.println(b);
        }
    }
}
