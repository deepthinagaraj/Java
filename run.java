 /*/ import java.util.*;
class combinationNumber {
  static ArrayList<String> getCombination(int[] number, int n, String[] keys) {
    ArrayList<String> getList = new ArrayList<>();
    Queue<String> que = new LinkedList<>();
    que.add("");
    while (!que.isEmpty()) {
      String temp = que.remove();
      if (temp.length() == n)
        getList.add(temp);
      else {
        String copy = keys[number[temp.length()]];
        for (int i = 0; i<copy.length(); i++) {
          que.add(temp + copy.charAt(i));
        }
      }
    }
    return getList;
  }
  static void combination(int[] inputValue, int n) {
    String[] keyWords = {
      "", "", "abc", "def", "ghi", "jkl",
      "mno", "pqrs", "tuv", "wxyz"
    };
    ArrayList<String> output = getCombination(inputValue, n, keyWords);
    for (int i = 0; i<output.size(); i++) {
      System.out.print(output.get(i) + " ");
    }
  }
  public static void main(String args[]) {
    String s = "123";
    int numb = Integer.valueOf(s);
    int i = 0;
    int[] inputValue = new int[s.length()];
    while (numb > 0) {
      inputValue[s.length() - i - 1] = numb % 10;
      numb /= 10;
      i++;
    }
    int lengths = inputValue.length;approach
    combination(inputValue, lengths);
  }
}
 */

/* 
// Java program to implement the
// above approach
import java.util.*;
import java.lang.*;
import java.io.*;
class phone{
       
static Character[][] numberToCharMap;
  
private static List<String> printWords(int[] numbers, int len, int numIndex, String s)
{
  if(len == numIndex)
  {
    return new ArrayList<>(Collections.singleton(s));
  }
    
  List<String> stringList = new ArrayList<>();
    
  for(int i = 0; 
          i < numberToCharMap[numbers[numIndex]].length; i++)
  {
    String sCopy =  String.copyValueOf(s.toCharArray());
    sCopy = sCopy.concat( numberToCharMap[numbers[numIndex]][i].toString());
    stringList.addAll(printWords(numbers, len, numIndex + 1,  sCopy));
  }
  return stringList;
}
      
private static void printWords(int[] numbers)
{
  generateNumberToCharMap();
  List<String> stringList = 
       printWords(numbers, numbers.length, 0, "");
  stringList.stream().forEach(System.out :: println);
}
  
private static void generateNumberToCharMap()
{
  numberToCharMap = new Character[10][5];
  numberToCharMap[0] = new Character[]{'\0'};
  numberToCharMap[1] = new Character[]{'\0'};
  numberToCharMap[2] = new Character[]{'a','b','c'};
  numberToCharMap[3] = new Character[]{'d','e','f'};
  numberToCharMap[4] = new Character[]{'g','h','i'};
  numberToCharMap[5] = new Character[]{'j','k','l'};
  numberToCharMap[6] = new Character[]{'m','n','o'};
  numberToCharMap[7] = new Character[]{'p','q','r','s'};
  numberToCharMap[8] = new Character[]{'t','u','v'};
  numberToCharMap[9] = new Character[]{'w','x','y','z'};
}
  
// Driver code  
public static void main(String[] args) 
{
  int number[] = {2, 3, 4};
  printWords(number);
}
}
*/





// Java program for the above approach
import java.util.*;
class phone
{
 
// Function to print the valid and formatted phone number
static void Validate(String M)
{
   
    // Length of given String
    int len = M.length();
 
    // Store digits in temp
    String temp = "";
 
    // Iterate given M
    for (int i = 0; i < len; i++)
    {
       
        // If any digit, append it to temp
        if (Character.isDigit(M.charAt(i)))
            temp += M.charAt(i);
    }
 
    // Find new length of String
    int nwlen = temp.length();
 
    // If length is not equal to 10 * validation
    if (nwlen != 10)
    {
        System.out.print("Invalid\n");
        return;
    }
 
    // Store final result
    String res = "";
 
    // Make groups of 3 digits and
    // enclose them within () and
    // separate them with "-"
    // 0 to 2 index 1st group
    String x = temp.substring(0, 3);
    res += "(" + x + ")-";
 
    // 3 to 5 index 2nd group
    x = temp.substring(3, 6);
    res += "(" + x + ")-";
 
    // 6 to 9 index 3rd group last group
    x = temp.substring(6, 10);
    res += "(" + x + ")";
 

    // Print final result
    System.out.print("the final output (phone number) is:" +res+ "\n");
}
 
// Driver Code
public static void main(String[] args)
{
 
    // Given String
    String M = "91ak23527281";
 
    // Function Call
    Validate(M); // it should be exactly 10 numbers, can have special char, 
}
}