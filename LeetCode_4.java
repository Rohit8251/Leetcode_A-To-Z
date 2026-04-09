import java.util.Scanner;

/*3736. Minimum Moves to Equal Array Elements III
https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/description/?envType=problem-list-v2&envId=array */

public class LeetCode_4 {
   public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array length is ");
           int n=sc.nextInt();
           int nums[] = new int[n];
        System.out.println("Enter Elemennt in Array");
          for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
         System.out.println("minimum total "+ minMoves(nums));
    }
     public static int minMoves(int[] nums) {
        
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
             max = nums[i];
        }
        int total = 0;
        for(int i=0;i<nums.length;i++)
        {
           total+=(max-nums[i]);
        }
        return total;
    }
}
