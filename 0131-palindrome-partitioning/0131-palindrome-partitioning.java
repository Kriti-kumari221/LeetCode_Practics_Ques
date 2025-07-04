class Solution {
    void rec(String s,List<List<String>>res,List<String>output,int index){
        if(index==s.length()){
            res.add(new ArrayList(output));
        }
        for(int i=index;i<s.length();i++){
           String sub=s.substring(index,i+1);
           if(isPalinDrome(sub)){
                output.add(sub);
                rec(s,res,output,i+1);
                output.remove(output.size()-1);
            }
        }
    }
    boolean isPalinDrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }

            }
            return true ;
        }
    
    public List<List<String>> partition(String s) {
        List<List<String>>res=new ArrayList<>();
        List<String>output=new ArrayList<>();
        rec(s,res,output,0);
      return res;
      
    }
}