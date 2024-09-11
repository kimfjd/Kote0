import java.math.BigInteger;
import java.util.Scanner;

public class Kote_Extremely_Rich_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n;
        BigInteger m;

        while (true) {
            System.out.println("처음 가지고 있는 돈");
            n = sc.nextBigInteger();
            if (BigInteger.ONE.compareTo(n) <= 0) {
                break;
            } else {
                System.out.println("숫자를 잘못 입력함");
            }
        }

        while (true) {
            System.out.println("돈받으러 온 사람");
            m = sc.nextBigInteger();
            if (BigInteger.ONE.compareTo(m) <= 0 && m.compareTo(n) <= 0) {
                break;
            } else {
                System.out.println("m은 n보다 작거나 같고 1보다 크거나 같게 해주세요");
            }
        }

        // BigInteger 나눗셈 및 나머지 연산
        System.out.println(n.divide(m));
        System.out.println(n.mod(m));
    }
}
