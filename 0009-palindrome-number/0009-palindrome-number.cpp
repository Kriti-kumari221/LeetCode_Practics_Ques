
class Solution {
public:
    bool isPalindrome(int x) {
        int p=x;
        double r=0;
        while(x>0){
            int k=x%10;
            r=r*10+k;
             x=x/10;
        }
        if(p==r){
           
            return true;
        }
        else{
           
            return false;
        }
    }
};
