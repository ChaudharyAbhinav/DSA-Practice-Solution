
import java.io.*;
        import java.util.*;

public class FindElement{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();

        }
        int key = sc.nextInt();;

        int count = 0;
        for (int i = 0; i < arr.length ; i++) {

            if(key == arr[i]){
                System.out.println(i);
                return;
            }

        }
        System.out.println(-1);

    }

}