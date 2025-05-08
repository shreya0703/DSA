class Solution {
    public int reverse(int x) {
        int revNum = 0;
        while( x!=0){
            int last_digit = x%10;
             

            x = x/10;
            if (revNum > Integer.MAX_VALUE / 10 || (revNum == Integer.MAX_VALUE / 10 && last_digit > 7))
                return 0;
            if (revNum < Integer.MIN_VALUE / 10 || (revNum == Integer.MIN_VALUE / 10 && last_digit < -8))
                return 0;
            revNum =(revNum*10)+last_digit;
            
           
        }
        return revNum;
    }
}