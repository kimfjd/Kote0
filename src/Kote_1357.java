import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kote_1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] a=bf.readLine().split(" ");
        String N1=a[0];
        String N2=a[1];
        if(N1.length()==1){
            N1=N1+"0";
        }
        if(N2.length()==1){
            N2=N2+"0";
        }
        StringBuilder sb1=new StringBuilder(N1);
        String reverseN1=sb1.reverse().toString();
        StringBuilder sb2=new StringBuilder(N2);
        String reverseN2=sb2.reverse().toString();

        int IN1=Integer.parseInt(reverseN1);
        int IN2=Integer.parseInt(reverseN2);
        int reverseSum=IN1+IN2;

        StringBuilder sb3=new StringBuilder(Integer.toString(reverseSum));
        int sum=Integer.parseInt(sb3.reverse().toString());

        System.out.println(sum);
    }
}
