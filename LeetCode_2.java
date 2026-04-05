import java.util.Scanner;

public class LeetCode_2 {

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array length");
           int n=sc.nextInt();
           int nums[] = new int[n];
        System.out.println("Enter Elemennt in Array");
          for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
         System.out.println("Sum is SubArray"+ subarraySum(nums));
    }
   static public int subarraySum(int[] nums) {
        
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            int start = Math.max(0,i-nums[i]);
            int sum =0;
            for(int j=start;j<=i;j++)
               sum+=nums[j];
            total+=sum;
        }
        return total;
    }
}
