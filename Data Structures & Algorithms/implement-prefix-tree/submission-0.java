public class TreeNode{
    TreeNode children[] = new TreeNode[26];
    boolean endOfWord = false;
}
class PrefixTree {
    private TreeNode root;
    public PrefixTree() {
        root = new TreeNode();
    }

    public void insert(String word) {
        TreeNode cur = root;
        for(char c: word.toCharArray()){
            int i = c-'a';
            if(cur.children[i] == null){
                cur.children[i] = new TreeNode();
            }
            cur = cur.children[i];
        }
        cur.endOfWord = true;
    }

    public boolean search(String word) {
        TreeNode cur = root;
        for(char c: word.toCharArray()){
            int i = c-'a';
            if(cur.children[i] == null){
                return false;
            }
            cur = cur.children[i];
        }
        return cur.endOfWord;
    }

    public boolean startsWith(String prefix) {
        TreeNode cur = root;
        for(char c: prefix.toCharArray()){
            int i = c-'a';
            if(cur.children[i] == null){
                return false;
            }
            cur = cur.children[i];
        }
        return true;
    }
}
