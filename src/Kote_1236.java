import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Kote_1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String[] b= bf.readLine().split(" ");
        int don = Integer.parseInt(b[0]);
        int we = Integer.parseInt(b[1]);
        int count = 0;
        String[][] li = new String[don][we];
        String[] l=new String[we];
        String[] oi=new String[don];
        for (int i = 0; i < don; i++) {
            String input = bf.readLine();
            for (int j = 0; j < we; j++) {
                li[i][j] = String.valueOf(input.charAt(j));
            }
        }
        for (int i = 0; i < don; i++) {
            for (int j = 0; j < we; j++) {
                if(li[i][j].equals("x")){

                }
            }

        }
    }
}

