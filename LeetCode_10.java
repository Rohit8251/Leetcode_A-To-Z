import java.util.Scanner;
/*1295. Find Numbers with Even Number of Digits
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?envType=problem-list-v2&envId=array */
public class LeetCode_10 {
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array length is ");
           int n=sc.nextInt();
           int nums[] = new int[n];
        System.out.println("Enter Elemennt in Array");
          for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
         System.out.println("All even digits is "+ findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
          int sum = 0;         
         for(int i=0;i<nums.length;i++)
         {
           int n = nums[i];
           int count = 0;
            while(n>0){
                n/=10;
                count++;
            }
            if(count%2==0)
                sum++;
         }
         return sum;
    }
}
