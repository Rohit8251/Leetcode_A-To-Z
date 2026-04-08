import java.util.Scanner;

public class LeetCode_5 {
    
     public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array length is ");
           int n=sc.nextInt();
           int nums[] = new int[n];
        System.out.println("Enter Elemennt in Array");
          for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
         System.out.println("minimum sum "+ minElement(nums));
    }
    public static int minElement(int[] nums) {
        
        int sum = 10000;
        for(int i=0;i<nums.length;i++)
        {
            int n = nums[i];
            int count = 0;
            while(n>0)
            {
                int rem = n%10;
                count +=rem;
                n/=10;
            }
            if(sum>count)
            sum = count;
        }
        return sum;
    }
}
