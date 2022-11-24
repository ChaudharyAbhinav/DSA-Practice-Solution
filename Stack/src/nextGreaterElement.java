import java.util.*;

public class nextGreaterElement {
    public static void NGE(int[] arr){
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        nge[arr.length-1] = -1;
        st.push(arr[arr.length-1]);
        for (int i = arr.length-2; 0<= i ; i--) {
            while(st.size() > 0 && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.size() > 0){
                nge[i] = st.peek();
            }else{
                nge[i] = -1;
            }
            st.push(arr[i]);
        }

        System.out.println(Arrays.toString(nge));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scn.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        NGE(arr);

    }
}
