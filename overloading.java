import java.util.*;
public class MyOverloadingClass{
    String message="";
    Integer lottery[];
    String[] fruitlist;
    int lowerlimit,upperlimit=0;
    
    MyOverloadingClass(String m){
        message=m;
        System.out.println("\n");
        System.out.println("Constructor output");
        System.out.println(message);
        System.out.println("\n");
    }
     MyOverloadingClass(String[] frr){
         fruitlist=frr;
         System.out.print("\nThe list is : ");
         for(int i =0;i<fruitlist.length;i++){
         System.out.print(fruitlist[i]+",");
         }
     }

    MyOverloadingClass(Integer[] lo,int l,int u){
        lowerlimit=l;
        upperlimit=u;
        lottery=lo;
        for(int i=0;i<lo.length;i++){
            System.out.print(lo[i]+",");
            }
    }

    public Boolean validate(String message) {
      String[] part = message.split("(?<=\\D)(?=\\d)");
      int check=0;
      for(int i=0;i<part.length;i++){
        System.out.print("\t"+part[i]);
        String str=part[i];
        char c= str.charAt(0);
        int num=Integer.parseInt(String.valueOf(c));
        //System.out.println(num);
        String sub=str.substring(1);
        //System.out.print("\t"+sub);
        if(sub.length()==num){
          check=check+1;
        }
        else{
          check=check;
        }
      }
      // System.out.println(check);
      // System.out.println(part.length);
      if(check==part.length){
        return true;
      } 
      else{
        return false;
      }             
    }

      public void validate(String[] fruitlist) {
        String rotten="";
        int check=0;
        for (int i = 0; i < fruitlist.length; i++) {
          if (fruitlist[i].contains("rotten")==true) {
            rotten=fruitlist[i];
            rotten = Character.toUpperCase((rotten.charAt(6))) + rotten.substring(7) +" "+ "is rotten";
            check=1;
          } 
          else{
            check=check;
          }
          
        }
        if(check==0){
          System.out.println("\n");
          System.out.print("No rotten fruit");
        }
        else{
          System.out.println("\n");
          System.out.print("rotten fruit : ");
          System.out.println(rotten);
        }
    
      }

    public boolean validate(Integer lotter[]){
        // String[] lottery=lot.split(",",0);
        int len=lotter.length;
        Set<Integer> s = new HashSet<Integer>(Arrays.asList(lotter));
        int a=s.size();
        if(len>=5 && len<=90 && a==len){
            return true;
        }
        else{
            return false;
        }        
    }


    public static void lottery(){
        Integer lot[]={1,2,3,4,5,6,7,8}; 
        // System.out.println("Enter lottery number");
        int lowlm = 0;
        int uplm=5;                
        // lot=sc.next();
        // System.out.println("\nThe length of the lottery number is");
        
        System.out.println("\n");
        MyOverloadingClass ob=new MyOverloadingClass(lot,lowlm,uplm);
        Boolean res=ob.validate(lot);
        System.out.println("\n"); 
        System.out.println(res);
    }

    public static void message(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the message");
        String msg=sc.next();
        MyOverloadingClass ob1=new MyOverloadingClass(msg);        
        Boolean res=ob1.validate(msg);
        System.out.println("\n"); 
        System.out.println(res);
    }

    public static void fruit(){
        Scanner sc=new Scanner(System.in);
        String[] frr = new String[3];
        System.out.println("Enter a String");
        for (int i = 0; i < 3; i++) {
          frr[i] = sc.next();
        }
        
        MyOverloadingClass ob2 = new MyOverloadingClass(frr);
        ob2.validate(frr);
        //MyOverloadingClass.validate(frr);
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a choice :\n");
        System.out.println("1. MESSAGE\n2. FRUITLIST\n3. LOTTERY\n");
        int ch=sc.nextInt();
        
        switch(ch){
            case 1: message();
            break;
            case 2:fruit();
            break;
            case 3:lottery();
            break;
        }       
    }
}



