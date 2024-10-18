import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kote_1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String N=bf.readLine();
        while (true){
            if(N.length()%3==0){
                break;
            }else {
                N="0"+N;
            }
        }
        int[] fi=new int[N.length()/3];
        int a=fi.length-1;
        for(int i=N.length()-1;i>=0;i=i-3){
            while (true){
                fi[a]=(N.charAt(i)-'0')*1+(N.charAt(i-1)-'0')*2+(N.charAt(i-2)-'0')*4;
                a--;
                break;
            }
//            if(i==N.length()-1){
//                fi=String.valueOf((N.charAt(i)-'0')*1+(N.charAt(i-1)-'0')*2+(N.charAt(i-2)-'0')*4);
//            }else{
//                fi= String.valueOf((N.charAt(i)-'0')*1+(N.charAt(i-1)-'0')*2+(N.charAt(i-2)-'0')*4)+fi;
//            }
        }

        for(int i=0;i<fi.length;i++){
            System.out.print(fi[i]);
        }

    }
}
