  public static int minimizeBias(List<Integer> ratings) {
    // Write your code here
    Collections.sort(ratings);
    int size= ratings.size();
    int count=0;
    int i=0;
    while(i<size ){
        count = count +(ratings.get(i+1) - ratings.get(i));
        i=i+2; 
    }
    return(count);
    }
