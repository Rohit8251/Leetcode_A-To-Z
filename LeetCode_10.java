import java.util.Scanner;

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
