import java.util.Scanner;

public class Kote_2446 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cou= sc.nextInt();
        int z=cou;
        int x=0;
        for(int i=0;i<(2*cou-1);i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=1;i<cou;i++){
            for(int j=0;j<x+1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<(2*z-3);j++){
                System.out.print("*");
            }
            z--;
            x++;
            System.out.println();
        }
        for(int i=2;i<=cou;i++){
            for(int j=0; j<cou-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
