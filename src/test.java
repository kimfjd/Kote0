import java.io.BufferedReader;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        String b= sc.next();
        int[] list = new int[a.length()];
        int[] list1 = new int[b.length()];
        for(int i=0;i<list.length;i++){
            list[i]=Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        for(int i=0;i<list1.length;i++){
            list1[i]=Integer.parseInt(String.valueOf(b.charAt(i)));
        }
        int c=0;
        int l=0;
        int s=0;
        if(a.length()>b.length()){
            l=a.length();
            s=b.length();
            for(int i=0;i<s;i++){
                for(int j=0;j<l;j++){
                    if(list1[i]==list[j]){
                        c=c+list1[i];
                    }
                }
            }
        } else if (a.length()<b.length()) {
            l=b.length();
            s=a.length();
            for(int i=0;i<s;i++){
                for(int j=0;j<l;j++){
                    if(list[i]==list1[j]){
                        c=c+list1[i];
                    }
                }
            }
        }else {
            l=a.length();
            s=b.length();
            for(int i=0;i<s;i++){
                for(int j=0;j<l;j++){
                    if(list1[i]==list[j]){
                        c=c+list1[i];
                    }
                }
            }
        }


        System.out.println(c);
    }
}
