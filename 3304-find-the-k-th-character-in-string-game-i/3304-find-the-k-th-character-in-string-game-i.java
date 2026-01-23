class Solution {
    public char kthCharacter(int k) {
        int shift=Long.bitCount(k-1);
        return (char)('a'+shift%26);
        }
    }
