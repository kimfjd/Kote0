import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kote_1551 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] aa=bf.readLine().split(" ");
        int a=Integer.parseInt(aa[0]);
        int b=Integer.parseInt(aa[1]);
        String[] cc=bf.readLine().split(",");
        int[] list=new int[a];
        for(int i=0;i< list.length;i++){
            list[i]=Integer.parseInt(cc[i]);
        }
        for(int i=0;i<b;i++){
            for(int j=0;j<list.length;j++){
                if(i==list.length-(1+j)){
                    list[j]= 0;
                    break;
                }else {
                    list[j]=list[j+1]-list[j];
                }
            }
        }
        for(int i=0;i< list.length-b;i++){
            if(list.length-b-1==i){
                System.out.print(list[i]);
            }else {
                System.out.print(list[i]+",");
            }
        }
    }
}
