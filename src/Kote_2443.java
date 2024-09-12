import java.util.Scanner;

public class Kote_2443 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cou= sc.nextInt();
        int z=cou;
        for(int i=0;i<(2*cou-1);i++){
            System.out.print("*");
        }
        System.out.println();
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
