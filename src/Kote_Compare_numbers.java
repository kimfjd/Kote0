import java.util.Random;
import java.util.Scanner;

public class Kote_Compare_numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0&&b==0){
                break;
            }else if(a>b){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
