// lab 4
// 1st question
import java.util.*;

    // Main class
class MyStatic {
   
    // Static block
    static
    {
        // Print statement
        System.out.print(
            "My name is Deepthi Nagaraj, \n my favourite cartoon character is ELSA \n  and favourite food is MOM's FOOD \n " );
    }
    public static void main(String[] args)
    {
        int n;
        n = 5;
         
        // Here n/2 is done to count the number 2's
        // in n 1 is added for case where there is no 2.
        // eg: if n=4 ans will be 3.
        // {1,1,1,1} set having no 2.
        // {1,1,2} ans {2,2} (n/2) sets containing 2.
        System.out.print("Number of ways when order of steps " +
                         "does not matter is : " + (1 + (n / 2)));
    }


    // A recursive function used by countWays method 2
    static int WaysToClimb(int n, int m)
    {
        int res[] = new int[n];
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i < n; i++) {
            res[i] = 0;
            for (int j = 1; j <= m && j <= i; j++)
                res[i] += res[i - j];
        }
        return res[n - 1];
    }
 
    // Returns number of ways to reach s'th stair
    static int countWays(int s, int m)
    {
        return countWays(s + 1, m);
    }
 
    // Driver method DriverMyStatic
    public static void DriverMyStatic(String[] args)
    {
        int s = 4, m = 2;
        System.out.println("Number of ways = "
                           + countWays(s, m));
    }
}



// Java program to find nth ugly number
class GFG {
  
    /*This function divides a by greatest
    divisible power of b*/
    static int maxDivide(int a, int b)
    {
        while (a % b == 0)
            a = a / b;
        return a;
    }
  
    /* Function to check if a number
    is ugly or not */
    static int UglyNumber(int no)
    {
        no = maxDivide(no, 2);
        no = maxDivide(no, 3);
        no = maxDivide(no, 5);
  
        return (no == 1) ? 1 : 0;
    }
  
    /* Function to get the nth ugly
    number*/
    static int getNthUglyNo(int n)
    {
        int i = 1;
  
        // ugly number count
        int count = 1;
  
        // check for all integers
        // until count becomes n
        while (n > count) {
            i++;
            if (UglyNumber(i) == 1)
                count++;
        }
        return i;
    }
  
    /* Driver Code*/
    public static void main(String args[])
    {
        int no = getNthUglyNo(150);
        
        // Function call
        System.out.println("150th ugly "
                           + "no. is " + no);
    }
}



 
