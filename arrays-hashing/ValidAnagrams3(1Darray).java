class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] arrs=new int[26];int[] arrt=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char n=t.charAt(i);
            int pc= (int) c - 97;
            int pn= (int) n - 97;
            arrs[pc]=arrs[pc]+1;
            arrt[pn]=arrt[pn]+1;
        }
        if(Arrays.equals(arrs,arrt)){
            return true;
        }
        else{
            return false;
        }
    }
}
