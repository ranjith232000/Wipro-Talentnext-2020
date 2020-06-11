import java.util.*;
class Main{
  public static int anagramCheck(String a,String b){
    char[] x= a.toCharArray();
    char[] y= b.toCharArray();
    Arrays.sort(x);
    Arrays.sort(y);
    for(int l=0;l<x.length;l++){
      System.out.print(x[l]);
    }
    System.out.println();
    for(int l=0;l<y.length;l++){
      System.out.print(y[l]);
    }
    System.out.println();
    System.out.println();
    

    if(Arrays.equals(x,y)){
      System.out.println("equal");
      System.out.println();
      return(0);
    }
    else{
      System.out.println("notequal");
      System.out.println();
      return(1);
    }
    
  }
  public static void main(String[] args){
    List<String> str = new ArrayList<>();
    str.add("code");
    str.add("apple");
    str.add("doce");
    str.add("sam");
    str.add("pplae");
    str.add("mas");
    int size = str.size();
    for(int i=0;i<size-1;i++){
      for(int j=i+1;j<size;j++){
        int flag = anagramCheck(str.get(i),str.get(j));
        if(flag==0){
          str.remove(j);
          --size;
        }
      }
    }
    Collections.sort(str);
    for(String s:str){
      System.out.println(s);
    }
  }
}
