import java.util.Scanner;

public class Kote_1546 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        double[] list=new double[a];
        double b=0;
        double c=0;
        for(int i=0;i<a;i++){
            list[i]=sc.nextInt();
            if(list[i]>b){
                b=list[i];
            }
        }
        for(int i=0;i< list.length;i++){
            list[i]=(list[i]/b)*100;
            c=c+list[i];
        }
        System.out.println(c/a);

    }
}
