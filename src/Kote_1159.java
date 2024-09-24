import java.util.Scanner;
import java.util.Arrays;

public class Kote_1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        char[] li=new char[N];
        for(int i=0;i<N;i++){
            String name=sc.next();
            li[i]=name.charAt(0);
        }
        int cnt=1;
        int cnt1=0;
        Arrays.sort(li);
        for(int i=0;i<li.length;i++){
            if(i==N-1){
                if(cnt>=5){
                    System.out.print(li[i]);
                    cnt=1;
                    cnt1++;
                }else {
                    cnt=1;
                }
            }else{
                if(li[i]==li[i+1]){
                    cnt++;
                } else if (li[i]!=li[i+1]) {
                    if(cnt>=5){
                        System.out.print(li[i]);
                        cnt=1;
                        cnt1++;
                    }else {
                        cnt=1;
                    }
                }
            }
        }
        if(cnt1<1){
            System.out.println("PREDAJA");
        }
    }
}
