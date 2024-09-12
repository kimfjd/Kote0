import java.util.Scanner;

public class Kote_2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cou = sc.nextInt();
        for (int i = 0; i < cou; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < cou - i; j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < cou; i++) {
            for (int j = 0; j < cou - i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            for(int j=0; j<cou-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
