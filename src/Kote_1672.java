import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Kote_1672 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String a=bf.readLine();
        int N=Integer.parseInt(a);
        HashMap<Integer, Character> map=new HashMap<Integer, Character>();
        map.put(130,'A');
        map.put(136,'C');
        map.put(132,'A');
        map.put(149,'G');
        map.put(134,'C');
        map.put(138,'T');
        map.put(151,'G');
        map.put(142,'G');
        map.put(155,'A');
        map.put(168,'T');
        char[] list=new char[N];
        String b=bf.readLine();
        for(int i=0;i<list.length;i++){
            list[i]=b.charAt(i);
        }
        for(int i= list.length-1;i>0;i--){
            int abc=list[i]+list[i-1];
            list[i-1]=map.get(abc);
        }
        System.out.println(list[0]);
    }
}
