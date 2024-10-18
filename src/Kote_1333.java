import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Kote_1333 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String[] a= bf.readLine().split(" ");
        int N=Integer.parseInt(a[0]);
        int L=Integer.parseInt(a[1]);
        int D=Integer.parseInt(a[2]);
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<L ;j++){
                list.add(1);
            }
            for(int j=0;j<5;j++){
                list.add(0);
            }
        }
        ArrayList<Integer> bell=new ArrayList<>();
        for(int i=0;i<=((N-1)*5+L*N)/D;i++){
            for(int j=0;j<D-1;j++){
                bell.add(2);
            }
            bell.add(0);
        }
        int b= bell.size() - list.size();
        if(bell.size()>list.size()){

            for(int i=0;i<b+1;i++){
                list.add(0);
                }
        }
        list.add(0);

        int i=0;
        while (true){

            if(list.get(i)==bell.get(i)){
                if(list.get(i+1)==1){
                    i++;
                    count++;
                }  else {
                    break;
                }
            }else if (bell.get(i)==0 && list.get(i)==1&&list.get(i+1)==0) {
                break;
            }else {
                i++;
                count++;
            }
        }
        System.out.println(count+1);
    }
}
