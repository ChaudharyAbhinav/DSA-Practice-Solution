
import java.io.*;
        import java.util.*;

public class RotateByK{
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a, int first , int last){
        while ( first < last ) {
            int temp = a[first];
            a[first] = a[last];
            a[last] = temp;
            first++;
            last--;
        }
    }

    public static void rotate(int[] a, int k){
        k = k%a.length;
        if(k<0){
            k += a.length;
        }
        // write your code here
        reverse(a,0, a.length -1);
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }

}