import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

public class Kote_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> list=new HashMap<String,Integer>();
        String word= bf.readLine();
        word=word.toUpperCase();
        for(int i=0;i<word.length();i++){
            if(list.containsKey(String.valueOf(word.charAt(i)))){
                list.put(String.valueOf(word.charAt(i)),list.get(String.valueOf(word.charAt(i)))+1);
            }else {
                list.put(String.valueOf(word.charAt(i)),1);
            }
        }
        int count=0;
        String maxword=null;
        Set<String> key=list.keySet();
        for(String key1:key){
            if(count<list.get(key1)){
                count=list.get(key1);
                maxword=key1;
            } else if (count==list.get(key1)) {
                maxword="?";
            }
        }
        System.out.print(maxword);
    }
}
