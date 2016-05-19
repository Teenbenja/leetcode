class TrieNode {
    //  hashMap to store the list of children node
    //  the second method is better in space
    Map<Character, TrieNode> sons = new HashMap<Character, TrieNode>();
    boolean isWord;
    char val;
    
    public TrieNode() {
        
    }
    
    public TrieNode(char c) {
      this.val = c;
      this.isWord = false;
    }
    
}

public class Trie {
    public TrieNode root;
    
    public Trie() {
      root = new TrieNode();
    }
    
    public void insert(String word) {
      
      TrieNode node = root;
      //Map<Character, TrieNode> sons = root.sons;
      char[] letters = word.toCharArray();
      
      for(int i = 0; i < letters.length; i++) {
        char c = letters[i];
        if(node.sons.containsKey(c)) {
          node = node.sons.get(c);
        }else {
          TrieNode tmp = new TrieNode(c);
          node.sons.put(c, tmp);
          node = tmp;
        }
      }
      
      node.isWord = true;
      
    }
    
    public boolean search(String word) {
      
      if(word == null || word.length() == 0) {
        return false;
      }
      
      TrieNode node = root;
      char[] letters = word.toCharArray();
      
      for(int i = 0; i < letters.length; i++) {
        char c = letters[i];
        if(node.sons.containsKey(c)) {
          node = node.sons.get(c);
        }else {
          return false;
        }
      }
      
      return node.isWord;
      
    }
    
    public boolean startsWith(String prefix) {
      
      if(prefix == null || prefix.length() == 0) {
        return false;
      }
      
      TrieNode node = root;
      char[] letters = prefix.toCharArray();
      
      for(int i = 0; i < letters.length; i++) {
        char c = letters[i];
        if(node.sons.containsKey(c)) {
          node = node.sons.get(c);
        }else {
          return false;
        }
      }
      
      return true;
      
    }

}





// class TrieNode {
//     // use the array to store the list of children
//     int num;
//     TrieNode[] sons;
//     boolean isWord;
//     char val;
    
//     public TrieNode() {

//       this.num = 1;
//       this.sons = new TrieNode[26];
//       this.isWord = false;
        
//     }
// }

// public class Trie {
//     private TrieNode root;

//     public Trie() {
//         root = new TrieNode();
//     }

//     // Inserts a word into the trie.
//     public void insert(String word) {
      
//       if(word == null || word.length() == 0) {
//         return ;
//       }
      
//       TrieNode node = this.root;
//       char[] letters = word.toCharArray();
//       for(int i = 0; i < word.length(); i++) {
//         int pos = letters[i] - 'a';
//         if(node.sons[pos] == null) {
//           node.sons[pos] = new TrieNode();
//           node.sons[pos].val = letters[i];
//         }else {
//           node.sons[pos].num++;
//         }
//         node = node.sons[pos];
//       }
      
//       node.isWord = true;
      
//     }

//     // Returns if the word is in the trie.
//     public boolean search(String word) {
      
//       if(word == null || word.length() == 0) {
//         return false;
//       }
      
//       TrieNode node = root;
//       char[] letters = word.toCharArray();
//       for(int i = 0; i < letters.length; i++) {
//         int pos = letters[i] - 'a';
//         if(node.sons[pos] == null) {
//           return false;
//         }else {
//           node = node.sons[pos];
//         }
//       }
      
//       return node.isWord;
      
//     }

//     // Returns if there is any word in the trie
//     // that starts with the given prefix.
//     public boolean startsWith(String prefix) {
      
//       if(prefix == null || prefix.length() == 0) {
//         return false;
//       }
      
//       TrieNode node = root;
//       char[] letters = prefix.toCharArray();
//       for(int i = 0; i < letters.length; i++) {
//         int pos = letters[i] - 'a';
//         if(node.sons[pos] == null) {
//           return false;
//         }else {
//           node = node.sons[pos];
//         }
//       }
      
//       return true;
      
//     }
// }

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");