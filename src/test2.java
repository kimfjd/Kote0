import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b;
        String R;
        if (a.charAt(0)=='A'){
            b="A계열사";
        } else {
            b="등록안됨";
        }
        if(a.charAt(a.length()-1)=='S'){
            R="S랭크";
        }else {
            R="등록안됨";
        }
        System.out.println(b+R);
    }
}
