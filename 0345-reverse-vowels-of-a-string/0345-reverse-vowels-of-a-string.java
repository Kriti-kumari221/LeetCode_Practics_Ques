class Solution {
    public String reverseVowels(String s) {
        int length = s.length();
        int left = 0, right = length - 1;
        StringBuilder builder = new StringBuilder(s);
        while (left < right) {
            char leftChar = ' ', rightChar = ' ';
            while (left < length) {
                leftChar = builder.charAt(left);
                if (leftChar == 'a' || leftChar == 'e' || leftChar == 'i' ||
                    leftChar == 'o' || leftChar == 'u' ||
                    leftChar == 'A' || leftChar == 'E' || leftChar == 'I' ||
                    leftChar == 'O' || leftChar == 'U') {
                    break;
                }
                left++;
            }

            // Move right pointer to previous vowel
            while (right >= 0) {
                rightChar = builder.charAt(right);
                if (rightChar == 'a' || rightChar == 'e' || rightChar == 'i' ||
                    rightChar == 'o' || rightChar == 'u' ||
                    rightChar == 'A' || rightChar == 'E' || rightChar == 'I' ||
                    rightChar == 'O' || rightChar == 'U') {
                    break;
                }
                right--;
            }
            if (left < right) {
                builder.setCharAt(left, rightChar);
                builder.setCharAt(right, leftChar);
                left++;
                right--;
            }
        }

        return builder.toString();
    }
}