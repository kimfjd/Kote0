import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kote_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String po= bf.readLine();
            if(po.equals("0")){
                break;
            }else {
                String[] li=new String[po.length()];
                for(int i=0;i<li.length;i++){
                    li[i]= String.valueOf(po.charAt(po.length()-1-i));
                }
                String comp=null;
                for(int i=0;i< li.length;i++){
                    if(i==0){
                        comp=li[i];
                    }else {
                        comp+=li[i];
                    }
                }
                if(po.equals(comp)){
                    System.out.println("yes");
                }else {
                    System.out.println("no");
                }
            }
        }
    }

}
