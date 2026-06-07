class Solution {
    public boolean isValid(String s) {
        if(s.length()<=1) return false;
        HashMap<Character, Character> openClose = new HashMap<>();
        openClose.put(']','[');
        openClose.put('}','{');
        openClose.put(')','(');

        Stack<Character> stack = new Stack<>();
        
        for(Character c: s.toCharArray()){
            if(openClose.keySet().contains(c)){
                if(!stack.isEmpty() && stack.peek()==openClose.get(c))
                    stack.pop();
                else
                    return false;
            }
            else
                stack.push(c);
            System.out.println(stack);
        }
        System.out.println(stack);
        if(stack.size()!=0) return false;
        return true;
    }
}
