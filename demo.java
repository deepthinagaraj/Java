import java.util.*;

public class WordChallenge {
    String strarray [];
    Char CharArray[];
    String maskarry[]:

    public static void main(String[] args){
        strarraychar[]= {'red', 'cee', 'cede', 'code', 'read','creed'};  
        System.out.println(strarray.length);  
        boolean x = false; //initializing x to false  
        int in = 0; //declaration of index variable  
        String s = "red";  // String to be searched  
        // Iteration of the String Array  
        for (int i = 0; i < strarray.length; i++) {  
            if(s.equals(strarray[i])) {  
                in = i; x = true; break;  
            }  
        }  
        if(x)  
            System.out.println(s +" String is found at index "+in);  
        else  
            System.out.println(s +" String is not found in the array");  
    }  
}

    
   
    








/* static method - identifyword name
3 paramters = string array 
char array  = "red"
mask  =   "length is 3 and "
 * char array = string array(input in should be)
 * onther string which is mask .
 *  
 * 
 * 1 .
 */


 /* create a class called as sandwich which has got private data memebers of types string main ingredent bread , double price(string) . write a following getter and setter methods . 
    set main ingredent 
    get main ingredent
    set bread
    get bread
    set price and
    get price.
    create an interface called as fast food indentify appropriate methods, sandwich implements fast food . create a driver class to show the working of the class and interface(fast food). 
  * 

      methods - customise , price, types of bread
  */

  //Interface declaration: by first user  
interface sandwich{  
    void data();  
    }  
    //Implementation: by second user  
    class fastfood implements sandwich{  
    public void draw(){System.out.println("drawing rectangle");}  
    }  
    class Circle implements Drawable{  
    public void draw(){System.out.println("drawing circle");}  
    }  
    //Using interface: by third user  
    class TestInterface1{  
    public static void main(String args[]){  
    Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
    d.draw();  
    }}  



   