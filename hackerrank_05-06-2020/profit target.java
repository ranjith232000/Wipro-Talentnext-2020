

class Result {

    /*
     * Complete the 'stockPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY stocksProfit
     *  2. LONG_INTEGER target
     */

    public static int stockPairs(List<Integer> stocksProfit, long target) {
    // Write your code here
    int s = stocksProfit.size();
    List<Integer> c = new ArrayList<Integer>();
    c.add(0);
    int count =0;
    for(int i=0;i<s-1;i++){
        for(int j=i+1;j<s;j++){
            int check = stocksProfit.get(i)+stocksProfit.get(j);
            if(check==target){
                boolean  x= c.contains(stocksProfit.get(i));
                boolean  y= c.contains(stocksProfit.get(j));
                if(x==false || y==false){
                    count=count+1;
                    c.add(stocksProfit.get(i));
                    c.add(stocksProfit.get(j));
                }

            }
        }
    }

    return (count);

    }

}
public class Solution {
