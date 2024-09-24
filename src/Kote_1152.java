import java.util.Scanner;

public class Kote_1152 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a= sc.nextLine().trim();
        String [] li = a.split(" ");
        int b=li.length;
        if(li.length==1&&li[0].equals("")){
            b=0;
        }
        System.out.println(b);
        }
    }

