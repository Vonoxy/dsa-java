import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] chs=new char[s.length()];
        for(int i=0;i<s.length();i++){
            chs[i]=s.charAt(i);
        }
        Arrays.sort(chs);
        char[] cht=new char[t.length()];
        for(int i=0;i<t.length();i++){
            cht[i]=t.charAt(i);
        }
        Arrays.sort(cht);
        if(Arrays.equals(chs,cht)){
            return true;
        }
        else{
            return false;
        }
    }
}
