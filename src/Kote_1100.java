import java.util.Scanner;

public class Kote_1100 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cnt=0;
        String[] user=new String[8];
        for(int i=0; i<8; i++){
            String a= sc.next();
            for(int j=0; j<8;j++){
                user[j]= String.valueOf(a.charAt(j));
                if(i%2==0&&j%2==0&&user[j].equals("F")){
                    cnt++;
                } else if (i%2==1&&j%2==1&&user[j].equals("F")) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
