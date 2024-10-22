import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kote_1816 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        boolean tf = true;
        for (long i = 0; i < N; i++) {
            long S = Long.parseLong(bf.readLine());
            for (int j = 2; j <= 1000000; j++) {
                if(j==S/2){
                    break;
                }else {
                    if (S % j == 0) {
                        tf=false;
                        break;
                    }
                }

            }
                if (tf) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
