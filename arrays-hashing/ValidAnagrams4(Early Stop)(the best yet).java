class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            int ps=s.charAt(i)-'a';
            arr[ps]++;
        }
        for(int i=0;i<s.length();i++){
            int pt=t.charAt(i)-'a';
            arr[pt]--;
            if(arr[pt]<0){
                return false;
            }
        }
        return true;
    }
}
