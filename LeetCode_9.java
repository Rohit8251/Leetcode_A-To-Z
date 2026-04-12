import java.util.Scanner;
/*3550. Smallest Index With Digit Sum Equal to Index
https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/description/?envType=problem-list-v2&envId=array */
public class Leetcode_9 {
    
  public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array length is ");
           int n=sc.nextInt();
           int nums[] = new int[n];
        System.out.println("Enter Elemennt in Array");
          for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
         System.out.println("sum of digits is "+ smallestIndex(nums));
    }
    public static int smallestIndex(int[] nums) {
        
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum=0;
            int n = nums[i];
            while(n>0)
            {
                int rem = n % 10;
                sum +=rem;
                n /= 10;
            }
            if(i==sum)
              break;
            else
              sum=-1;
        }
        return sum;
    }
}
