import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    int key = sc.nextInt();
    int start = 0;
    int end = n-1;
    int fi=-1,li=-1;
    
    while(start <= end){
        int mid = start - (start - end)/2; 
        if (key < arr[mid] ) {
            end= mid -1;
        } else if(arr[mid] < key) {
            start = mid +1;
        }else {
             fi=  mid;
            end = mid -1;
            
        }
    }

     start = 0;
     end = n-1;

    while(start <= end){
        int mid = start - (start - end)/2; 
        if (key < arr[mid] ) {
            end= mid -1;
        } else if(arr[mid] < key) {
            
            start = mid +1;
        }else {
            li =  mid;
            start = mid + 1;
            
        }
       
    }
     System.out.println(fi + "\n" +li);
 }


}
