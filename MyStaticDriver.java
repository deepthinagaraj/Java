

// lab 4
// 1st question
import java.util.*;

    // Main class
class MyStatic {
   
    static
    {
        System.out.println("My name is Deepthi Nagaraj , my favourite cartoon character is ELSA and favourite food is MOM's FOOD");
        
    } 
    
    
    static int fib(int n)
    {
        // Print statement
          
            if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
    }

	// Returns number of ways to reach s'th stair
	static int countWays(int s)
	{
		return fib(s + 1);
	}

    static boolean isUgly(int n)
    {
        for(int i= 2;i<=n;i++)
        {
            if(n%i==0)
            {
                boolean t = true;
                for(int j = 2;j<i;j++)
                {
                    if(i%j == 0)
                    {
                        t = false;
                        break;
                    }
                }
                if(t == true)
                {
                    if(i>5)
                        return false;
                }

            }
        }
        return true;
    }

	/* Driver program to test above function */
	
} 

class MyStaticDriver
{
    public static void main(String args[])
	{
		MyStatic obj = new MyStatic();
		System.out.println("Number of ways = " + obj.countWays(5));
        System.out.println("6 is an uglyNumber?: "+obj.isUgly(6));
        System.out.println("13 is an uglyNumber?: "+obj.isUgly(13));
	}
}


