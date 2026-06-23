class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        char[] c=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(b);
        Arrays.sort(c);
        s=new String(c);
        t=new String(b);
        if(s.equals(t))
        return true;
        return false;

    }
}
