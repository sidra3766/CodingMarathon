class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] aChar= s.toCharArray();
        char[] bChar= t.toCharArray();
        
        Arrays.sort(aChar);
        Arrays.sort(bChar);

        return Arrays.equals(aChar,bChar);
    }
}
