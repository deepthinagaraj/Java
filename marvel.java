// ironman is fighting  and requires jarvis help but jarvis busy computing palindron for alpha numeric  characters . ironman needs to activite the sonic punch to kill thanos but needs javis help who is  stuck with computing panledoron . 
//the owns is on you the marvel fan to compute the palendrom so that jarvis can save ironman. 

//write a function called SAVE IRON-MAN which will return a value true if the input string is a palendrome. 

class PalindromeEg{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=4564;       //It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("IRON MAN SAVED ");    // input is palindrome
  else    
   System.out.println("IRON MAN NOT SAVED");    
}  
}  




