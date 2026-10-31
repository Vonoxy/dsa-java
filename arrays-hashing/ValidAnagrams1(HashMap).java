import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] chs=new char[s.length()];
        for(int i=0;i<s.length();i++){
            chs[i]=s.charAt(i);
        }
        HashMap<Character, Integer> freqs = new HashMap<>();
        for(char ch:chs){
            if(freqs.containsKey(ch)){
                int count=freqs.get(ch);
                freqs.put(ch,count+1);
            }
            else{
                freqs.put(ch,1);
            }
        }
        char[] cht=new char[s.length()];
        for(int i=0;i<s.length();i++){
            cht[i]=t.charAt(i);
        }
        HashMap<Character, Integer> freqt = new HashMap<>();
        for(char ch:cht){
            if(freqt.containsKey(ch)){
                int count=freqt.get(ch);
                freqt.put(ch,count+1);
            }
            else{
                freqt.put(ch,1);
            }
        }
        if(freqs.equals(freqt)){
            return true;
        }
        else{
            return false;
        }
    }
}
