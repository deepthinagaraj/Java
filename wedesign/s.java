public class Student {  
    //instance variables of the class  
    int id,passoutYear;  
    String name,contactNo,collegeName;  
      
    Student(String contactNo, String collegeName, int passoutYear){  
    this.contactNo = contactNo;  
    this.collegeName = collegeName;  
    this.passoutYear = passoutYear;  
    }  
      
    Student(int id, String name){  
    this("9899234455", "IIT Kanpur", 2018);  
    this.id = id;  
    this.name = name;  
    }  
      
    public static void main(String[] args) {  
    //object creation  
    Student s = new Student(101, "John");  
    System.out.println("Printing Student Information: \n");  
    System.out.println("Name: "+s.name+"\nId: "+s.id+"\nContact No.: "+s.contactNo+"\nCollege Name: "+s.contactNo+"\nPassing Year: "+s.passoutYear);  
    }  
    }  