class Solution {
    public int reverse(int x) {
        int revNum = 0;
        while( x!=0){
            int last_digit = x%10;
             if (revNum > 214748364 || revNum < -214748364) return 0;

            x = x/10;
            revNum =(revNum*10)+last_digit;
            
        }
        return revNum;
    }
}