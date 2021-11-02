import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    static public void printRev(int s, int[] x)
    {
        for(int i=s-1; i>=0; i--){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
  
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
            }
            printRev(size, arr);
            T--;
        }
	}
}
