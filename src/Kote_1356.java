import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kote_1356 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String N= bf.readLine();
        if(N.length()==1){
            System.out.println("NO");
        }else {
            int a=1;
            for(int i=0;i<N.length();i++){
                a=a*Integer.parseInt(String.valueOf(N.charAt(i)));
                int b=1;
                for(int j=0;j<N.length()-1-i;j++){
                    b=b*Integer.parseInt(String.valueOf(N.charAt(i+j+1)));
                }
                if(a==b){
                    System.out.println("YES");
                    return;
                }
            }
            System.out.println("NO");
        }

    }
}
