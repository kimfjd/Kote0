import java.util.Scanner;

public class Kote_chess {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("킹 갯수");
        int k = sc.nextInt();
        System.out.println("퀸 갯수");
        int q = sc.nextInt();
        System.out.println("룩 갯수");
        int l = sc.nextInt();
        System.out.println("비숍 갯수");
        int b = sc.nextInt();
        System.out.println("나이트 갯수");
        int kn=sc.nextInt();
        System.out.println("폰 갯수");
        int p= sc.nextInt();

        int king=1-k;
        int queen=1-q;
        int look=2-l;
        int bishop=2-b;
        int knight=2-kn;
        int pawn = 8-p;

        System.out.print(king);
        System.out.print(queen);
        System.out.print(look);
        System.out.print(bishop);
        System.out.print(knight);
        System.out.print(pawn);

    }
}
