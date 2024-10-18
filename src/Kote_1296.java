import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kote_1296 {
    public static void main(String[] args) throws IOException {
        int L=0;
        int O=0;
        int V=0;
        int E=0;

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String Gr= bf.readLine();
        for(int i=0;i<Gr.length();i++){
            String na= String.valueOf(Gr.charAt(i));
            if(na.equals("L")){
                L++;
            } else if (na.equals("O")) {
                O++;
            } else if (na.equals("V")) {
                V++;
            } else if (na.equals("E")) {
                E++;
            }
        }
        String a= bf.readLine();
        int N=Integer.parseInt(a);
        int su=0;

        String fname = null;
        for(int i=0;i<N;i++){
            int l=0;
            int o=0;
            int v=0;
            int e=0;
            String tname=bf.readLine();
            for(int j=0;j<tname.length();j++){
                String ttname= String.valueOf(tname.charAt(j));
                if(ttname.equals("L")){
                    l++;
                } else if (ttname.equals("O")) {
                    o++;
                } else if (ttname.equals("V")) {
                    v++;
                } else if (ttname.equals("E")) {
                    e++;
                }

            }
            l=l+L;
            o=o+O;
            v=v+V;
            e=e+E;
            int aa=0;
            aa=((l+o) * (l+v) * (l+e) * (o+v) * (o+e) * (v+e)) % 100;
            if(i==0){
                su=aa;
                fname=tname;
            } else if (aa>su) {
                su=aa;
                fname=tname;
            }
        }
    System.out.println(fname);
    }
}
