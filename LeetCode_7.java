import java.util.Scanner;
/*2114. Maximum Number of Words Found in Sentences
https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/?envType=problem-list-v2&envId=array */
public class LeetCode_7 {
    
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
         System.out.println("maximum word is "+ mostWordsFound(nums));
    }
    public static int mostWordsFound(String[] sentences) {
     
     int max = 0;
     for(int i=0;i<sentences.length;i++)
     {
        int count = sentences[i].split(" ").length;
        if(count>max)
          max = count;
     } 
     return max;
    }
}
