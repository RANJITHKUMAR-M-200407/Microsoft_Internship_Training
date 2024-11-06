public class RedPenGreenPen {
    public static void main(String[] args) {
        int[]arr={1,2,1,2,3};
        System.out.println(sum(arr));
    }
    public static int sum(int[]arr)
    {
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1])
            {
                if((arr[i]%2!=0 && arr[i+1]%2==0) || (arr[i]%2==0 && arr[i+1]!=0))
                {
                    count++;
                }
            }
        }
        return count;
    }
}
