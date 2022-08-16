// write a prg which will print a factorial of a no., n ficbonnoci series in numbers , checks whether no is prime or not . Use switch statement accept input from user 

import java.util.*;  
class prime {
    public String reverseString(String str) {
  
    {  
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter a number : ");  
       int n = s.nextInt();  
       if (isPrime(n)) {  
           System.out.println(n + " is a prime number");  
       } else {  
           System.out.println(n + " is not a prime number");  
       }  
   }  
  
   public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i < Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  


   }  
}  

int fib {
{

    int i = 1, n = 10, firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    while (i <= n) {
      System.out.print(firstTerm + ", ");

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;

      i++;
    }
  }
}


int Factorial
{
  {
    int n, c, f = 1; // initiall to 1 or else garbage value

    System.out.println("Enter an integer to calculate its factorial");
    Scanner in = new Scanner(System.in);

    n = in.nextInt();

    if (n < 0)
      System.out.println("Number should be non-negative.");
    else
    {
      for (c = 1; c <= n; c++)
        f = f*c;

      System.out.println("Factorial of "+n+" is = "+f);
    }
  }
}




import java.util.*;

class Jarvis {
    public String reverseString(String str) {
        String reverved_str;
        if (str.length() == 1) {
            reverved_str = str;
            return reverved_str;
        } else {
            reverved_str = reverseString(str.substring(1)) + str.charAt(0);
            return reverved_str;
        }
    }

    public String input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        return str;
    }

    void saveIronman(String str1, String str2) {
        if (!str1.equals(str2)) {
            System.out.println("Ironman is Dead!!");
        } else {
            System.out.println("Ironman is saved!!");
        }
    }
}

public class ironmanDriver {
    public static void main(String[] args) {
        Jarvis help = new Jarvis();
        String str1 = help.input();
        String str2 = help.reverseString(str1);
        System.out.println(str2);
        help.saveIronman(str1, str2);
    }
}
