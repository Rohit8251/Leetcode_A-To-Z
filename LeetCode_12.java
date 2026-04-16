import java.util.Scanner;

public class LeetCode_12 {

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Total Money "+totalMoney(n));
    }
        public static int totalMoney(int n) {
        int weeks = n / 7;      
        int days = n % 7;       
        
        int sum = 0;
        
        for(int i = 1; i <= weeks; i++) {
            int m = i;
            for(int j = 1; j <= 7; j++) {
                sum += m;
                m++;
            }
        }
        
        int start = weeks + 1;
        for(int i = 1; i <= days; i++) {
            sum += start;
            start++;
        }
        
        return sum;
    }

}