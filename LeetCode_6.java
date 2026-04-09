import java.util.Scanner;
/*3005. Count Elements With Maximum Frequency
https://leetcode.com/problems/count-elements-with-maximum-frequency/description/?envType=problem-list-v2&envId=array */
public class LeetCode_6 {
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array length is ");
           int n=sc.nextInt();
           int nums[] = new int[n];
        System.out.println("Enter Elemennt in Array");
          for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
         System.out.println("maximu frequency "+ maxFrequencyElements(nums));
    }
    public static int maxFrequencyElements(int[] nums) {
        
        int freq[] = new int[101];
        for(int num:nums) 
           freq[num]++;
        int max = freq[0];
        for(int f:freq)
          {
            if(max<f)
             max = f;
          }
          int total = 0;
        for(int i:freq)
        {
            if(max==i)
              total +=i;
        }
        return total;
    }
}
