public class SumSquareInteger {
    public static void main(String[] args) {
      int m= 5;
      int n= 7;
      System.out.println(arr(m,n));
    }
    public static int arr(int m, int n)
    {
        int ans=0;
      if(m>n)
      {
        return 0;
      }
      else{
        for(int i=m;i<=n;i++)
        {
          ans=ans+(i*i*i);  
        }
      }
      return ans;
    }
}
