import java.util.Scanner;

public class Kote_2083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String name = sc.next();
            int age = sc.nextInt();
            int we=sc.nextInt();
            if(name.equals("#")&&age==0&&we==0){
                break;
            }else if(age>17||we>=80){
                System.out.print(name+" ");
                System.out.println("Senior");
            }else{
                System.out.print(name+" ");
                System.out.println("Junior");
            }
        }
    }
}
