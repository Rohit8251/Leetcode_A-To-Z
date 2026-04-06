import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*2859. Sum of Values at Indices With K Set Bits
https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/description/?envType=problem-list-v2&envId=array */

public class LeetCode_3 {
        public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter List length is ");
           int n=sc.nextInt();
           int k = sc.nextInt();
        List<Integer> arr =new ArrayList<>();
        System.out.println("Enter Elemennt in List");
          for(int i=0;i<n;i++)
            arr.add(sc.nextInt());
         System.out.println("Sum of "+ sumIndicesWithKSetBits(arr,k));
    }
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        
        int sum =0;
        for(int i=0;i<nums.size();i++)
        {
            int count=0;
            int n=i;
            while(n>0){
                int m = n%2;
                n = n/2;
                if(m==1)
                 count++;
            }
            if(count==k)
             sum += nums.get(i);
        }
        return sum;
    }
}
