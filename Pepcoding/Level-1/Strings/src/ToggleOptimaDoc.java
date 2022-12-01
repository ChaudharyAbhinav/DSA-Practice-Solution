
import java.io.*;
        import java.util.*;

public class ToggleOptimaDoc {
    public static String toggleCase(String s){
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char ch =sb.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                char lc =(char)(ch - 'A' + 'a') ;
                sb.setCharAt(i,lc);
            }else{
                char uc =(char)(ch - 'a' +'A') ;
                sb.setCharAt(i,uc);
            }


        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

}
