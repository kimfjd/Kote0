import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kote_1526 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String N=bf.readLine();
        int intN=Integer.parseInt(N);
        for(int i=intN;i>3;i--){
            String Sti=Integer.toString(i);
            int[] list=new int[Sti.length()];
            for(int j=0;j<Sti.length();j++){
                int aa=Integer.parseInt(String.valueOf(Sti.charAt(j)));
                if(aa==7||aa==4){
                    list[j]=aa;
                }else {
                    break;
                }
            }
            if(list[list.length-1]==7||list[list.length-1]==4){
                for(int j=0;j< list.length;j++){
                    System.out.print(list[j]);
                }
                return;
            }
        }
    }
}
