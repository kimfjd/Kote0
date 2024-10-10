import java.util.Scanner;

public class Kote_1110 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String N=sc.next();
        int S=0;
        if(N.equals("0")){
            S++;
            System.out.print(S);
        }else{
            String co;
            if(N.length()==1){
                N=0+N;
            }
            co= String.valueOf(N.charAt(0)+N.charAt(1)-96);
            S++;
            String c1;
            if(co.length()==1){
                co=N.charAt(1)+co;
            } else if (co.length()==2) {
                co= String.valueOf(N.charAt(1))+co.charAt(1);
            }

            while (true){
                if(N.equals(co)){
                    break;
                }else {
                    if(co.length()==1){
                        co=0+co;
                    }
                    c1= String.valueOf(co.charAt(1));
                    co=String.valueOf(co.charAt(0)+co.charAt(1)-96);
                    S++;
                    if(co.length()==1){
                        co=c1+co.charAt(0);
                    }else {
                        co = c1 + co.charAt(1);
                    }
                }
            }
            System.out.print(S);
        }
        }
    }