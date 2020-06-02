import java.util.*;
import java.io.*;

class Main {
  public static boolean palindrome(String sub){
    String reverse =""; 
    for(int i=sub.length()-1;i>=0;--i){
      reverse = reverse + sub.charAt(i);
    }
    if(sub.equals(reverse)){
      System.out.println("true");
      System.out.println();
      return(true);
    }
    else{
      System.out.println("false");
      System.out.println();
      return(false);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the String");
    String s=sc.nextLine();
    int si= s.length();
    if(si>2){
      int count=si;
      for(int k=1;k<=si;k++){
        int i=0;
        int j=k+1;
        while(i<si && j<=si){
          boolean z=palindrome(s.substring(i,j));
          if(z==true){
            count++;
          }
          ++i;
          ++j;
        }
      }
      System.out.print(count);
    }
    else{
      System.out.print(si);
    }
  }
}
