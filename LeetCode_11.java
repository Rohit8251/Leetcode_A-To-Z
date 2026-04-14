import java.util.Scanner;
/*3432. Count Partitions with Even Sum Difference
https://leetcode.com/problems/count-partitions-with-even-sum-difference/description/?envType=problem-list-v2&envId=array */
public class LeetCode_11 {

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array length is ");
           int n=sc.nextInt();
           int nums[] = new int[n];
        System.out.println("Enter Elemennt in Array");
          for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
         System.out.println("All even digits is "+ countPartitions(nums));
    }
        public  static int countPartitions(int[] nums) {
        
        int uppersum = nums[0];
        int counteven = 0;
        for(int i=0;i<nums.length-1;i++)
         {
              int innersum = 0;
              for(int j=i+1;j<nums.length;j++)
                innersum +=nums[j];
               innersum = uppersum-innersum;
               if(innersum<0)
                  innersum = -innersum;
               if(innersum%2==0)
                  counteven++;
                uppersum+=nums[i+1];
         }
         return counteven;
    }
}