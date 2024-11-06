import java.util.Arrays;

public class RiaGame {
    public static void main(String[] args) {
        int[]nums={4,6,8,3,9,5};
        System.out.println(arr(nums));
    }
    public static int arr(int[]nums)
    {
        int ans=0;
      Arrays.sort(nums);
      for (int i=nums.length-1;i>=0; i--) {
        ans= (ans*10) + nums[i];
      }
      return ans;
    }
}
