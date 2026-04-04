import java.util.Scanner;

/*2574. Left and Right Sum Differences
 https://leetcode.com/problems/left-and-right-sum-differences/description/?envType=problem-list-v2&envId=array*/

public class LeetCode_1 {

       public static void main(String args[])
       {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int nums[] = new int[n];
          for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
            int[] sum=LeetCode_1.leftRightDifference(nums);
          for(int i=0;i<n;i++)
              System.out.print(sum[i]+" ");

       }
        public static int[] leftRightDifference(int[] nums) {

            int []leftsum=new int[nums.length];
            int []rightsum=new int[nums.length];
            for(int i=0,j=nums.length-1;i<nums.length && j>0;i++,j--)
            {
                leftsum[i+1]=leftsum[i]+nums[i];
                rightsum[j-1]=rightsum[j]+nums[j];
            }
            for(int i=0;i<nums.length;i++)
            {
                leftsum[i]=Math.abs(leftsum[i]-rightsum[i]);
            }
            return leftsum;


    }
}

