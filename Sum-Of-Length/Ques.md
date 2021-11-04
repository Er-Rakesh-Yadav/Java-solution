Given an array. Calculate the sum of lengths of contiguous subarrays having all distinct elements.

<h4>Example 1:</h4>

Input:<br>
N=3<br>
arr[] = { 1,2,3 }<br><br>
Output:<br> 10
<br><br>
<b>Explanation: </b><br>
{1, 2, 3} is a subarray of length 3 with distinct elements. Total length of length three = 3. {1, 2}, {2, 3} are 2 subarray 
of length 2 with distinct elements. Total length of lengths two = 2 + 2 = 4
{1}, {2}, {3} are 3 subarrays of length 1 with distinct element. Total lengths of length one = 1 + 1 + 1 = 3
Sum of lengths = 3 + 4 + 3 = 10 

<h4>Example 2:</h4>

Input:<br>
N=1<br>
arr[] = { 1 }<br><br>
Output:<br> 1
<br><br>
<b>Explanation: </b><br>
{1} is the only subarray with distinct elements of length 1.  

<hr><b>Your Task:</b><br><br>
You don't need to read input or print anything. Your task is to complete the function sumoflength() that takes array arr and integer N as input parameters and returns the sum of lengths of contiguous subarrays having all distinct elements.
<br><br>
Expected Time Complexity: O(N).<br>
Expected Auxiliary Space: O(N).

 <br><br><br>

Constraints:<br>
1 ≤ N ≤ 106
