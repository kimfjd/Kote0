import java.util.Scanner;

public class Kote_1703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int age =sc.nextInt();
            int leaf=0;
            if(age==0){
                break;
            }else {
                for(int i=0;i<age;i++){
                    int branch= sc.nextInt();
                    int pronunciation= sc.nextInt();
                    if(leaf==0){
                        leaf=branch-pronunciation;
                    }else {
                        leaf=leaf*branch-pronunciation;
                    }
                }
            }
            System.out.println(leaf);
        }
    }
}
