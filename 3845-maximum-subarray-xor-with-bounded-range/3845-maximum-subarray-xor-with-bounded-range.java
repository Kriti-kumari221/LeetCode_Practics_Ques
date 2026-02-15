import java.util.*;

class Solution {
    
    static class TrieNode {
        TrieNode[] child = new TrieNode[2];
        int count = 0;  
    }
    
    static class Trie {
        TrieNode root = new TrieNode();
        
        void insert(int num) {
            TrieNode node = root;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                if (node.child[bit] == null) {
                    node.child[bit] = new TrieNode();
                }
                node = node.child[bit];
                node.count++;
            }
        }
        
        void remove(int num) {
            TrieNode node = root;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                node = node.child[bit];
                node.count--;
            }
        }
        
        int getMax(int num) {
            TrieNode node = root;
            int max = 0;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                int want = 1 - bit;
                
                if (node.child[want] != null && node.child[want].count > 0) {
                    max |= (1 << i);
                    node = node.child[want];
                } else {
                    node = node.child[bit];
                }
            }
            return max;
        }
    }
    
    public int maxXor(int[] nums, int k) {
        
        int[] meloraxuni = nums;   // required variable
        
        int n = nums.length;
        int[] prefix = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] ^ nums[i];
        }
        
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();
        
        Trie trie = new Trie();
        trie.insert(0);
        
        int l = 0;
        int ans = 0;
        
        for (int r = 0; r < n; r++) {
            
            while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] <= nums[r])
                maxDeque.pollLast();
            maxDeque.offerLast(r);
            
            while (!minDeque.isEmpty() && nums[minDeque.peekLast()] >= nums[r])
                minDeque.pollLast();
            minDeque.offerLast(r);
            
            while (nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > k) {
                
                trie.remove(prefix[l]);
                
                if (maxDeque.peekFirst() == l) maxDeque.pollFirst();
                if (minDeque.peekFirst() == l) minDeque.pollFirst();
                
                l++;
            }
            
            ans = Math.max(ans, trie.getMax(prefix[r + 1]));
            trie.insert(prefix[r + 1]);
        }
        
        return ans;
    }
}
