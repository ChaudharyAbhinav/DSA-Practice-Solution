
import java.io.*;
        import java.util.*;

public class SpanOfArray{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        int maxi = arr[0];
        int mini = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }

        int span = maxi - mini;
        System.out.println(span);

    }
}