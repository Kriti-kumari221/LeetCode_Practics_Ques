class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String s1[]=s.split("\\s+");
        StringBuilder sk=new StringBuilder();
        for(int i=s1.length-1;i>=0;i--){
            sk.append(s1[i]);
            if(i!=0)sk.append(" ");
        }
        return sk.toString();
    }
}