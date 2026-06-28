class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h=new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String s1=new String(c);
            if(h.containsKey(s1)){
                List<String>l=h.get(s1);
                l.add(s);
                h.put(s1,l);
            }
            else{
                List<String>l=new ArrayList<>();
                l.add(s);
                h.put(s1,l);
            }
        }
         return new ArrayList<>(h.values());
    }
}