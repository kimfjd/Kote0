import java.util.Scanner;

public class Kote_2444 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cou= sc.nextInt();
        int z=cou;
        for(int i=1;i<=cou;i++){
            for(int j=0; j<cou-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<cou;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<(2*z-3);j++){
                System.out.print("*");
            }
            z--;
            System.out.println();
        }
    }
}
