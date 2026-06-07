class Solution {
    public String encode(List<String> strs) {
        if(strs.size()==0) return "";
        System.out.println(strs.get(0).length());
        if(strs.size()==1) {
            if(strs.get(0).length()==0) return " ";
            else return strs.get(0);
        }
        String str = "";
        str += strs.get(0);
        for(int i=1; i<strs.size();i++){
            str += "-"+strs.get(i);
        }
        System.out.println(strs.size()+" "+str);
        return str.length()>1?str:"";
    }

    public List<String> decode(String str) {
        if(str.length()<1) return new ArrayList<>();
        List<String> list = new ArrayList<>(Arrays.asList(str.split("-")));
        if(list.size()==1 && list.get(0).equals(" ")) return Arrays.asList("");
        return list;
    }
}
