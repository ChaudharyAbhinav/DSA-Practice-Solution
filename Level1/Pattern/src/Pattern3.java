
//*
//*	*
//*	*	*
//*	*	*	*
//*	*	*	*	*

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1;
        int nsr = 1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < nsp; j++) {
                System.out.print("\t");

            }
            for (int j = 0; j < nsr; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            nsp--;
            nsr++;


        }

    }
}


//Time Complexity: o(n2);
//Space Complexity: o(1);