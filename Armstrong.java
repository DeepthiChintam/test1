package math2;
import java.util.*;
public class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int s = 0, re = 0, arm = 0, k = n;
        while(n>0)
        {
            re = n % 10;
            s = re * re * re;
            arm = arm + s;
            n = n / 10;
        }
            if (arm == k)
                System.out.println("Armstrong number");
            else
                System.out.println("Not armstrong");
        }
    }
