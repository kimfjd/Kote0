import java.util.Arrays;
import java.util.Scanner;

public class Kote_2476 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] st=new int[n];
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a==b&&a==c){
                st[i]=10000+a*1000;
            } else if (a==b||a==c) {
                st[i]=1000+a*100;
            } else if (b==c) {
                st[i]=1000+b*100;
            } else {
                if(a>b&&a>c){
                    st[i]=a*100;
                } else if (b>a&&b>c) {
                    st[i]=b*100;
                }else {
                    st[i]=c*100;
                }
            }
        }
        Arrays.sort(st);
        System.out.println(st[n-1]);
    }
}
