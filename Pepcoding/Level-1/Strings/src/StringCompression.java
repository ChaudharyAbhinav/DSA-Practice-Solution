
import java.io.*;
        import java.util.*;

public class StringCompression {

    public static String compression1(String str){

        String com1 = str.charAt(0) +"";
        for (int i = 1; i < str.length(); i++) {

            if(str.charAt(i-1) != str.charAt(i)){
                com1 += str.charAt(i);
            }
        }

        return com1;
    }

    public static String compression2(String str){
        // write your code here
        String com2= "";
        com2 += str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {

            if(str.charAt(i-1) == str.charAt(i)){
                count ++;
            }else{

                if(count > 1){
                    com2 += count;
                    count = 1;
                }
                com2 += str.charAt(i);
            }
        }
        if(count > 1){
            com2 += count;
        }
        return com2;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }

}