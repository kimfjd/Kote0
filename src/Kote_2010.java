import java.util.Scanner;

public class Kote_2010 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m = sc.nextInt();
        int n=0;
        for(int i=0;i<m;i++){
            int z= sc.nextInt();
            if(n==0){
                n=z;
            }else {
                n=n-1+z;
            }
        }
        System.out.println(n);
    }
}
