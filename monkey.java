//monkeyTrouble
import java.util.Scanner;
class Test
{
 public static void main(String [] args)   
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter bollean value for aSmile(true or false)= ");
  boolean aSmile=sc.nextBoolean();
  System.out.print("Enetr only booblean value for bSmile(true or false)=  ");
  boolean bSmile=sc.nextBoolean();
  if(aSmile && bSmile || !aSmile && !bSmile)
  {
   System.out.println("true");
  }
  else
  {
   System.out.println("false");
  }
 }
}

//write a program which takes in set of int no. and indentify if the series in arthimatic operations.