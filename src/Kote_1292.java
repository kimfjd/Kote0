import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Kote_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] a= bf.readLine().split(" ");
        int fr=Integer.parseInt(a[0]);
        int se=Integer.parseInt(a[1]);
        ArrayList<Integer> list=new ArrayList<>();
        int c=0;
        for (int i = 1; list.size() < se; i++) {
            for (int j = 0; j < i; j++) {
                list.add(i);
            }
        }

        for (int i = fr - 1; i < se; i++) {
            c += list.get(i);
        }
        System.out.println(c);
    }
}
