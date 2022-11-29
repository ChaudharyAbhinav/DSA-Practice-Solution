//*
//*	*
//*	*	*
//*	*	*	*
//*	*	*	*	*

import java.util.*;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // write ur code here
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }
}