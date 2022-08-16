import java.io.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


// Class Declaration of arch
public class Architect extends Wedenize
{
    // Instance Variables
    String Aname;
    String Aemail;
    Int Experience;
    String Archaddress;
    Int Arphone;
    String Password;
  
    // Constructor Declaration of Class
    public Architect(String Aname,String Aemail,Int Experience,
    String Archaddress,Int Arphone,String Password)
    {
        this.name = aname;
        this.email = Aemail;
        this.Experience = Experience;
        this.address = Archaddress;
	   this.phone = Arphone;
	   this.Password = Password;
    }
  
    // method 1
    public String getname()
    {
        return aname;
    }
  
    // method 2
    public String getemail()
    {
        return Aemail;
    }
  
    // method 3
    public int getExperience()
    {
        return Experience;
    }
  
    // method 4
    public String getphone()
    {
        return Arphone;
    }

    
  
                          



// Class Declaration of clients
public class Client
{
    // Instance Variables
    String Name;
    String Email;
    String Address;
    Int Phone;
    String Password;
  
    // Constructor Declaration of Class
    public Clients(String Name,String Email,
    String Address,Int Phone,String Password)
    {
        this.name = Name;
        this.email = Email;
        this.address = Address;
	   this.phone = Phone;
	   this.Password = Password;
    }
  
    // method 1
    public String getname()
    {
        return aname;
    }
  
    // method 2
    public String getemail()
    {
        return Aemail;
    }
    
    // method 4
    public String getphone()
    {
        return Arphone;
    }


@Override
    public String toString()
    {
        return("Hi my name is "+ this.getName()+
               ".\nMy email,phone and address are " +
               this.getEmail()+"," + this.getPhone()+
               ","+ this.getAdress());
    }
  






     // this is main class(WeDenize is my website name.
    public static void main WeDenize(String[] args)throws IOException
    {
        WEDENIZE wd = new Architect("DEEPTHI","DEEPTHINAGA", 9880310444, "KR PURAM");
        System.out.println(wd.toString());
    }
}