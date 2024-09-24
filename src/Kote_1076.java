import java.util.Scanner;


public class Kote_1076 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        String b= sc.next();
        String c= sc.next();
        String d=null;
        String e=null;
        int f=0;
        switch (a){
            case "black":
                d="0";
                break;
            case "brown":
                d="1";
                break;
            case "red":
                d="2";
                break;
            case "orange":
                d="3";
                break;
            case "yellow":
                d="4";
                break;
            case "green":
                d="5";
                break;
            case "blue":
                d="6";
                break;
            case "violet":
                d="7";
                break;
            case "grey":
                d="8";
                break;
            case "white":
                d="9";
                break;
        }
        switch (b){
            case "black":
                e="0";
                break;
            case "brown":
                e="1";
                break;
            case "red":
                e="2";
                break;
            case "orange":
                e="3";
                break;
            case "yellow":
                e="4";
                break;
            case "green":
                e="5";
                break;
            case "blue":
                e="6";
                break;
            case "violet":
                e="7";
                break;
            case "grey":
                e="8";
                break;
            case "white":
                e="9";
                break;
        }
        switch (c){
            case "black":
                f=1;
                break;
            case "brown":
                f=10;
                break;
            case "red":
                f=100;
                break;
            case "orange":
                f=1000;
                break;
            case "yellow":
                f=10000;
                break;
            case "green":
                f=100000;
                break;
            case "blue":
                f=1000000;
                break;
            case "violet":
                f=10000000;
                break;
            case "grey":
                f=100000000;
                break;
            case "white":
                f=1000000000;
                break;
        }
        int de=Integer.parseInt(d+e);
        long adsada=(long)de*f;
        System.out.println(adsada);
    }
}
