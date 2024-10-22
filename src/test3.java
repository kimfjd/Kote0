import java.util.HashSet;
import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        while(true){
            int a=(int)(Math.random()*44+1);
            set.add(a);
            if(set.size()==6){
                break;
            }
        }
        System.out.print(set);
    }
}
