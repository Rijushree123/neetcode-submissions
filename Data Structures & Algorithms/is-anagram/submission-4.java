class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> an1 = new HashMap<>();
        HashMap<Character, Integer> an2 = new HashMap<>();
        for(char c: s.toCharArray()) an1.put(c, an1.getOrDefault(c, 0)+1);
        
        for(char c: t.toCharArray()) an2.put(c, an2.getOrDefault(c, 0)+1);
        
        for(Map.Entry<Character, Integer> mp: an1.entrySet()){
            if(!an1.get(mp.getKey()).equals(an2.get(mp.getKey()))) return false;
        }
        return true;
    }
}
