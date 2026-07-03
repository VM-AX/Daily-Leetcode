class Solution {
    public int reverse(int n) {
        int m =0 ;
        while(n!=0){
            int d = n%10;
            n = n/10;
            if (m > Integer.MAX_VALUE / 10 || (m == Integer.MAX_VALUE / 10 && d > 7)) {
    return 0;
}

if (m < Integer.MIN_VALUE / 10 || (m == Integer.MIN_VALUE / 10 && d < -8)) {
    return 0;
}
            m =(m*10)+d;
        }
        return m;
    }
}