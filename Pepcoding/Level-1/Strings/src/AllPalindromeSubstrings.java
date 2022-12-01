
import java.io.*;
import java.util.*;

public class AllPalindromeSubstrings {

    public static boolean isPallindrome(String s){
        int start =0;
        int end = s.length()-1;
        while ( start <= end ) {
            if(s.charAt(start) != s.charAt(end)){
                return false;

            }else{
                start++;
                end--;
            }

        }
        // Alternate Way
        // while ( start <= end ) {
        // 	char ch1= s.charAt(start);
        // 	char ch2 = s.charAt(end);
        // 	if(ch1 != ch2){
        // 		return false;

        // 	}else{
        // 	 	start++;
        // 	 	end--;
        // 	}

        // }
        return true;
    }

    public static void solution(String str){
        //write your code here
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String ss = str.substring(i,j);
                if(isPallindrome(ss) == true){
                    System.out.println(ss);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

}