import java.util.Scanner;
/*2744. Find Maximum Number of String Pairs
https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/?envType=problem-list-v2&envId=array*/

public class LeetCode_8 {

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array length is ");
           int n=sc.nextInt();
           sc.nextLine();
           String nums[] = new String[n];
        System.out.println("Enter Elemennt in Array");
          for(int i=0;i<n;i++)
            nums[i]=sc.nextLine();
         System.out.println("maximum count of pair "+ maximumNumberOfStringPairs(nums));
    }
    public static int maximumNumberOfStringPairs(String[] words) {
        
        int count = 0;
        boolean used[] = new boolean[words.length]; 
        for(int i=0;i<words.length;i++)
        {
            if(used[i]) continue;
            for(int j=i+1;j<words.length;j++)
            {
                if(used[j]) continue;

                if(words[i].charAt(0) == words[j].charAt(1) &&
                words[i].charAt(1) == words[j].charAt(0)){
                  count++;
                  used[i] = true;
                  used[j] = true;
                  break;
                }
            }
        }
        return count;
    }
}