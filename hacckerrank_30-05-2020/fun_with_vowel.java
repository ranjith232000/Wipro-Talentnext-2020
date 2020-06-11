import java.io.*;
class Result {

    public static int order(char[] seq,int l){
          Map<Character,Integer> map =new LinkedMap<>();
          int i=0;
          while(i!=l){
               if(map.containskey(seq[i])==false){
                  map.put(seq[i],1);
               }
               else{
                  int o=map.get(seq[i]);
                  int ne=o+1;
                  map.put(seq[i],ne);
               }
               ++i;
          }
          char[] k= new Char[l];
          int s=0;
          Set<Map.entry<Character,Integer>> hmap=map.entrySet();
          for(Map.entry<Character,Integer> data: hmap){
                k[s]=data.getKey();
          }
          String vo ="aeiou";
          String vow=k.toString();
          if(vo=vow){
               return(1);
          }   
          else{
              return(0);
          }

    }

    public static int longestVowelSubsequence(String s) {
       char[] a= s.toCharArray();
       int size=a.length;
       int flag=(order(a,size));
       if(flag==1){
          count=0;
          char[] b= new char[size];
          b[0]='a';
          int j=0;
          for(int i=0;i<size;i++){
              if((int)a[i]>=(int)b[j]){
                  b[j]=a[i];
                  j++;
              }
          }
          int r=(b.length)-1;
          return (r);
       
       }
       else{
          return(0);     
       }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str=next();
        int z= longestVowelSubsequence(str);
        System.out.println(z);
    }


}

