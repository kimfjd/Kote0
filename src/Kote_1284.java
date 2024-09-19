import java.util.Scanner;

public class Kote_1284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String num=sc.next();
            if(num.equals("0")){
                break;
            }else {
                int[] li = new int[num.length()];
                int wkfl=num.length()-1;
                int sum=0;
                for(int i=0;i<num.length();i++){
                    li[i]=num.charAt(i)-48;
                    if(li[i]==1){
                        sum=sum+2;
                    } else if (li[i]==0) {
                        sum=sum+4;
                    }else {
                        sum=sum+3;
                    }
                }
                System.out.println(sum+wkfl+2);
            }
        }

    }
}
