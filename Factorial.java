package math;
import java.util.*;
public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int j = 1;
        for (int i = 1; i <= n; i++) {
            j = j * i;
        }
            System.out.println("The Factorial of  is " + j);

        }
    }


