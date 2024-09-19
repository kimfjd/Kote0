import java.util.Scanner;

public class Kote_2490 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] aa =new String[3];
        int[] st=new int[4];
        for (int i=0; i<3;i++){
            int a=0;
            for(int j=0;j<4;j++){
                st[j]=sc.nextInt();
                if(st[j]==1){
                    a++;
                }
            }
            if(a==0){
                aa[i]="D";
            } else if (a==1) {
                aa[i]="C";
            }else if (a==2){
                aa[i]="B";
            } else if (a==3) {
                aa[i]="A";
            } else if (a==4) {
                aa[i]="E";
            }
        }
        for(int i=0;i<aa.length;i++){
            System.out.println(aa[i]);
        }
    }
}
