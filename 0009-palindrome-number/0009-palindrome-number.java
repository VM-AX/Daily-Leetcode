class Solution {
    public boolean isPalindrome(int x) {
        int m = 0;
        int n = x;

        if( x<0){
            return false;
        }

        while(n>0){
            int d = n%10;
            n = n/10;
            m = (m*10)+d;
        }

        if(x == m){
            return true;
        }else{
            return false;
        }
    }
}