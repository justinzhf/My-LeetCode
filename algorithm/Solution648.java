import java.util.ArrayList;
import java.util.List;

public class Solution648 {
    public String replaceWords(List<String> dict, String sentence) {
        StringBuilder stringBuilder=new StringBuilder();
        String[] tokens=sentence.split(" ");
        TrieNode tree=constructTrieTree(dict);
        for(int i=0;i<tokens.length;i++){
            stringBuilder.append(findShortestWord(tokens[i],tree));
            stringBuilder.append(" ");
        }
        return stringBuilder.substring(0, stringBuilder.length()-1);
    }

    public String findShortestWord(String token,TrieNode tree){
        TrieNode node=tree;
        String shortWord="";
        for(char c:token.toCharArray()){
            if(node.nodes[c-'a']!=null){
                shortWord+=node.nodes[c-'a'].c;
            }else {
                break;
            }
            if(node.nodes[c-'a'].isWord){
                return shortWord;
            }
            node=node.nodes[c-'a'];
        }
        return token;
    }

    public TrieNode constructTrieTree(List<String> dict){
        TrieNode root=new TrieNode();
        TrieNode node=root;
        for(String word:dict){
            for(char c:word.toCharArray()){
                if(node.nodes[c-'a']==null){
                    node.nodes[c-'a']=new TrieNode(c,false);
                }
                node=node.nodes[c-'a'];
            }
            node.isWord=true;
            node=root;
        }
        return root;
    }

    private class TrieNode{
        char c;
        boolean isWord;
        TrieNode[] nodes;
        public TrieNode(){
            isWord=false;
            nodes=new TrieNode[26];
        }

        public TrieNode(char _c,boolean _isWord) {
            c=_c;
            isWord=_isWord;
            nodes=new TrieNode[26];
        }
    }
    public static void main(String[] args) {
        List<String> dict=new ArrayList<>();
        dict.add("bat");
        dict.add("cat");
        dict.add("ba");
        String sen="abcd batt catt";
        System.out.println(new Solution648().replaceWords(dict,sen));
    }
}
