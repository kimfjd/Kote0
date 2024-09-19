import java.util.Arrays;
import java.util.Scanner;

public class Kote_2460 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] st=new int[10];
        for(int i=0;i<10;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            if (i==0){
                st[i]=b;
            }
            else {
                st[i]= st[i-1]-a+b;
            }
        }
        Arrays.sort(st);
        System.out.println(st[9]);
    }
}
