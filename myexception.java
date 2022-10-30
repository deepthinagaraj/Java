// write a class as myexcpetion which has 2 methods counttheletters() which takes in the string and returns back no. of english alphabets in the given string ensure that only letters are counted and user defined exceptionnis raised if an non - english letter is encounted .
// method2 takes in arthimatic expression and returns the result . use an user defined expression to validate whether the given expression is arth
// or not 

// create a driver class called MyExcpetion implementation and call the methods 




//program to print the exception information using printStackTrace() method

import java.io.*;

class myexception{ 
    public counttheletters (String[] args){

    }
	public static void main (String[] args) {



	int a=5;
	int b=0;
		try{
		System.out.println(a/b);
		}
	catch(ArithmeticException e){
		e.printStackTrace();
	}
	}
}


// Java Program to Check If String Contains Only Alphabets
// Using Regular Expression

// Main class
class GFG {

	// Method 1
	// To check String for only Alphabets
	public static boolean isStringOnlyAlphabet(String str)
	{

		return ((str != null) && (!str.equals(""))
				&& (str.matches("^[a-zA-Z]*$")));
	}

	// Method 2
	// Main driver method
	public static void main(String[] args)
	{

		// Calling out methods over string
		// covering all scenarios

		// Use case 1
		System.out.println("Test Case 1:");
		// Input string
		String str1 = "GeeksforGeeks";
		System.out.println("Input: " + str1);

		System.out.println("Output: "
						+ isStringOnlyAlphabet(str1));

		// Use case 2
		// Checking for String with numeric characters
		System.out.println("\nTest Case 2:");
		// Input string
		String str2 = "Geeks4Geeks";
		System.out.println("Input: " + str2);
		System.out.println("Output: "
						+ isStringOnlyAlphabet(str2));

		// Use Case 3
		// Checking for null String
		System.out.println("\nTest Case 3:");
		// Input string
		String str3 = null;
		System.out.println("Input: " + str3);
		System.out.println("Output: "
						+ isStringOnlyAlphabet(str3));

		// Use Case 4
		// Checking for empty String
		System.out.println("\nTest Case 4:");
		// Input string
		String str4 = "";
		System.out.println("Input: " + str4);
		System.out.println("Output: "
						+ isStringOnlyAlphabet(str4));
	}
}
