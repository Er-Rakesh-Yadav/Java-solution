class Solution
{
    public static int sumoflength(long arr[] ,int n)
    {
      Set<Long> s=new HashSet<>();
      int j=0;
      int ans=0;

      for(int i=0;i<arr.length;i++){
          while(j<n && !s.contains(arr[j])){
          s.add(arr[j]);
          j++;
          }
      ans+=((j-i)*(j-i+1))/2;
      s.remove(arr[i]);
      }
      
    return ans;
  }
  
  public static void main (String[] args){
    long[] arr = {1,2,3};
    int n;
    System.out.println(sumoflength(arr,n));
  }
}
