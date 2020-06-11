
class Result {

    /*
     * Complete the 'itemsSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY items as parameter.
     */

    public static List<Integer> itemsSort(List<Integer> items) {
    // Write your code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> temp=new ArrayList<Integer>();
        int l = items.size();
        Map<Integer , Integer> map =new HashMap<Integer , Integer>();
        int i=0;
        while(i!=l){
            int val =items.get(i);
            if(!map.containsKey(val)){
                map.put(items.get(i),1);
            }
            else{
                int o=map.get(items.get(i));
                int ne=o+1;
                map.put(items.get(i),ne);       
            }
            ++i;
        }
        int max=0;
        Set<Map.Entry<Integer,Integer>> hmap=map.entrySet();
        for(Map.Entry<Integer,Integer> m: hmap){
            int s =m.getValue();
            if(s>max){
                max=s;
            }
        }
        int j=1;
        while(j<=max){
            for(Map.Entry<Integer,Integer> m: hmap){
                if(m.getValue()==j){
                    int key = m.getKey();
                    if(j==1){
                        temp.add(key);
                    }
                    else{
                        for(int f=0;f<j;f++){
                            temp.add(key);
                        }
                    }
                }
            }
            Collections.sort(temp);
            int tsize = temp.size();
            for(i=0;i<tsize;i++){
                int e = temp.get(i);
                list.add(e);
            }
            temp.clear();
            j++;
        }
        return(list);
    }

}

