import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Kote_1019 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        List<Character> l = new ArrayList<>();
        for(int i=1;i<=N;i++){
            String SN=Integer.toString(i);
            if(SN.length()==1){
                l.add((char) Integer.parseInt(String.valueOf(SN.charAt(0))));
            }else {
                for(int j=0;j<SN.length();j++){
                    l.add((char) Integer.parseInt(String.valueOf(SN.charAt(j))));
                }
            }
        }
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        HashMap<String,Integer>h1=new HashMap<String,Integer>();
        for(int i=0;i<10;i++){
            h1.put(String.valueOf(i),0);
        }

        for(int i=0;i<l.size();i++){
            int cnt=1;
            int x=l.get(i);
            if(h1.containsKey(String.valueOf(x))){
                cnt += h1.get(String.valueOf(x));
            }
            h1.put(String.valueOf(x),cnt);
        }
        for(int i=0;i<h1.size();i++){
            int x=l.get(i);
            System.out.print(h1.get(String.valueOf(x))+" ");
        }
    }
}
