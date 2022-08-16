
// Java Program to Illustrate Working of
// Parameterized Constructor
 
// Importing required inputoutput class
import java.io.*;

class MyOverloadingClass
{

MyOverloadingClass(String M)
    {
        this.message = M;
        
    }


MyOverloadingClass(String[] F)
    {
        this.fruitlist = F;
       
    }
   
MyOverloadingClass(int l,int u,String L)
    {
        this.lower = l;
        this.upper = u;
        this.lottery = L;
       
    }

public static void main(String[] args)
{
    MyOverloadingClass Me = new MyOverloadingClass("welcome") ;
    MyOverloadingClass ip = new MyOverloadingClass("welcome") ;
    System.out.println(message);
    System.out.println(fruitlist);
    System.out.println(lower);
    System.out.println(upper);
    System.out.println(lottery); 
}
}




void validate(String[] F){
	String t1; 

	for (int i=0; i<=F.length-1; i++) {
		if (F[i].length()>8){
			if ((F[i].substring(0,6)).equals("rotten")) {
				if (Character.isUpperCase(F[i].charAt(6))) {
				t1 = F[i].substring(6,F[i].length());
				System.out.println(t1 + " is rotten");
			}
			
		}}
		
	}
}




int validate(int l,int u,String L)
{
	int flag = 0;
	if (L.length() >= l && L.length() <= u)
	{
		for (int i = 0; i < L.length(); i++)
			if (L.charAt(i) != ',')
				{
					for (int j = i + 1; j < L.length(); j++)
						if (L.charAt(i) != ',')
							{
								if (L.charAt(i) == L.charAt(j))
									flag = 1;
							}}

			if (flag!= 1)
				{
					System.out.println("Valid lottery ticket");
					return 1;
				}

				else
					{
						System.out.print("Invalid lottery ticket");
						return 0;
					}
				}
			

			else
			{
				System.out.print("Invalid lottery ticket");
				return 0;
			}
		}




        void validate(String[] F){
            String t1; 
        
            for (int i=0; i<=F.length-1; i++) {
                if (F[i].length()>8){
                    if ((F[i].substring(0,6)).equals("rotten")) {
                        if (Character.isUpperCase(F[i].charAt(6))) {
                        t1 = F[i].substring(6,F[i].length());
                        System.out.println(t1 + " is rotten");
                    }
                    
                }}
                
            }
        }