

import java.util.*;

class Solution {
    public void singleElement(int[]A,int n) {
        //Write code here and print output
		// xor with each no then double time repeted no gives result 0 
		// 0^n=n;
		// n^n=0;
		// m^n^n=n;
		int res=0;
		for(int x : A) res^=x;
        System.out.println(res);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++)
                A[i] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.singleElement(A,n);
        sc.close();
    }
}

