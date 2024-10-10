import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] li=new int[5];
        for(int i=0;i<5;i++){
            li[i]=sc.nextInt();
        }
        int a=1;
        int aa=0;
        while (true){
            for(int i=0;i<5;i++){
                if(a%li[i]==0){
                    aa++;
                }
            }
            if(aa>=3){
                System.out.print(a);
                break;
            }
            aa=0;
            a++;
        }
    }
}
