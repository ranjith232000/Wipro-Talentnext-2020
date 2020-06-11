
class Result {

    /*
     * Complete the 'priceCheck' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY products
     *  2. FLOAT_ARRAY productPrices
     *  3. STRING_ARRAY productSold
     *  4. FLOAT_ARRAY soldPrice
     */

    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
    // Write your code here
    int error =0;
    HashMap<String,Float> map = new HashMap<String,Float>(); 
    int size = productPrices.size();
    for(int i=0;i<size;i++){
        map.put(products.get(i), productPrices.get(i));
    }
    int size2=productSold.size();
    for (int i=0;i<size2;i++){
        String s = productSold.get(i);
        float original_price = map.get(s);
        if(original_price != soldPrice.get(i) ){
            error++;
        }
    }
    return (error);

    }

}
