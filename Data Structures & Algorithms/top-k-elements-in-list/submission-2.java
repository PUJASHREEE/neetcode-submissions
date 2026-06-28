class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i:nums){
            if(h.containsKey(i)){
                int n=h.get(i);
                h.put(i,n+1);
            }
            else
            h.put(i,1);
        }
        List<Integer>l=new ArrayList<>(h.values());
        Collections.sort(l);
        Collections.reverse(l);
        int[] a=new int[k];
        int i=0;
        List<Integer>f=new ArrayList<>();
        while(k>0){
           
            for(int j:h.keySet()){
                if(h.get(j)==l.get(0) && !f.contains(j)){
                   
                    f.add(j);
                    i++;
                    k--;
                    l.remove(0);
                    break;
                }
                j++;
            }
        }
        int j=0;
        for(int n:f){
a[j]=n;
j++;
        }
        return a;
    }
}
