import java.io.*;

class Solution{
    public static int missingNumber(int A[], int N)
    {
        // Your code goes here
        int sum=0;
        for(int i=0; i<A.length; i++){
            sum += A[i];
        }
        int total = N*(N+1)/2;
        return total-sum;
    }
    
	public static void main (String[] args) {
	    int[] arr = {1,2,4};
	    int n = 4;
	    System.out.println(missingNumber(arr, n));
	} 
}
