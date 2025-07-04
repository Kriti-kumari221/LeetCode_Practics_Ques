class Solution {
    void rec(List<String>res,int n,int close,int open, String curr){
        if(curr.length()==n*2){
            res.add(curr);
            return ;
        }
        if(open<n){
            rec(res,n,close,open+1,curr+"(");
        }
        if(close<open){
            rec(res,n,close+1,open,curr+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String>res=new ArrayList<>();
        rec(res,n,0,0,"");
        return res;
    }
}