import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Kote_1157_timeover {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String word= bf.readLine();
        String[] list=new String[word.length()];
        word=word.toUpperCase();
        for(int i=0;i<list.length;i++){
            list[i]= String.valueOf(word.charAt(i));
        }
        Arrays.sort(list);
        int count=0;
        int count1;
        String maxword=null;
        for(int i=0;i<list.length;i++){
            count1=0;
            for(int j=0;j< list.length;j++){
                try{
                    if(list[i].equals(list[j])){
                        count1++;
                    } else if (list[i].equals(list[i-1])) {
                        break;
                    }
                }catch (Exception e){

                }
            }
            if(count1>count){
                count=count1;
                maxword=list[i];
            } else if (count==count1) {
                maxword="?";
            }
        }
        System.out.print(maxword);
    }
}
