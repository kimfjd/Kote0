import java.util.Scanner;

public class kote_1085 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int w= sc.nextInt();
        int h= sc.nextInt();
        int x0=0;
        int y0=0;
        int z;
        int x1=Math.abs(w-x);
        int y1=Math.abs(h-y);
        int x2=Math.abs(x0-x);
        int y2=Math.abs(y0-y);
        int winx;
        int winy;
        if(x1>x2){
            winx=x2;
        }else {
            winx=x1;
        }
        if(y1>y2){
            winy= y2;
        }else {
            winy=y1;
        }
        if(winx>winy){
            z=winy;
        }else {
            z=winx;
        }
        System.out.println(z);
    }
}
