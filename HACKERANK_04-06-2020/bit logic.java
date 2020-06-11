
class Result {

    public static int maxXor(int lo, int hi, int k) {
    // Write your code here
    int size = (hi-lo) +1;
    int[] a = new int[size];
    int maxp = 0;
    a[0]=lo;
    for(int i=1;i<size;i++){
        a[i] =a[i-1] + 1;
    }
    
    for(int i=0;i<size-1;i++){
        for(int j=i+1;j<size;j++){
            int l= a[i]^a[j];
            if(l<= k && l>maxp){
                maxp =l;
            }
        }
    }
    return (maxp);

    }

}
