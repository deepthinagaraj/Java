 /* Abtrast class where u dont need to create objects in class
    like abstract class ANIMAL 
    abstract method eat , sounds -  which are abstact in nature or may not
    extends  - keywords
     * implements i inheretance
     * in driver class create instance and run 
     * 
     */



     /*create a class   abtract class called amiprime which has methods absract bollean , isprime which takes in an inegere value pulic int value which takes in int and return back int this method removes all space , special char and returns back integer
public string is a  prime takes in a string value will use the above 2 methods and returns back a string not prime 

*input in prime or not 
* remove all spaces and special char 
for spaces - use replaceAll()
special char - 

*/


public class amiprime 

{  
public static void main(String args[])   
{  
String str= "This#string%contains^special*characters&.1232";   
str = str.replaceAll("[^a-zA-Z0-9]", " "); 
str =  str.replaceAll("\\s+","");
System.out.println(str);  
}  
}  
