import java.util.ArrayList;
import java.util.Scanner;

public class Kote_1032 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String a=sc.next();
        String[] list=new String[a.length()];
        if(N==1){
            System.out.println(a);
        }else {
            for(int i=0;i<a.length();i++){
                list[i]= String.valueOf(a.charAt(i));
            }
            for(int i=0;i<N-1;i++){
                String fi=sc.next();
                for(int j=0;j<list.length;j++){
                    if(list[j].equals(String.valueOf(fi.charAt(j)))){

                    }else {
                        list[j]="?";
                    }
                }
        }
        for(int i=0;i< list.length;i++){
            System.out.print(list[i]);
        }
        }
    }
}
