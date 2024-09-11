import java.util.Scanner;

public class Kote_gather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int count=0;
            String aa=sc.nextLine();
            if(aa.equals("#")){
                break;
            }
            else {
                for(int i=0;i<aa.length();i++){
                 if(aa.charAt(i)=='a'){
                     count++;
                 }
                }
                for(int i=0;i<aa.length();i++){
                    if(aa.charAt(i)=='e'){
                        count++;
                    }
                }
                for(int i=0;i<aa.length();i++){
                    if(aa.charAt(i)=='i'){
                        count++;
                    }
                }
                for(int i=0;i<aa.length();i++){
                    if(aa.charAt(i)=='o'){
                        count++;
                    }
                }
                for(int i=0;i<aa.length();i++){
                    if(aa.charAt(i)=='u'){
                        count++;
                    }
                }
                System.out.println(count);
            }

        }
    }
}
