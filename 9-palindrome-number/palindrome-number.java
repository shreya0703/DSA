class Solution {
    public boolean isPalindrome(int x) {
       int revNum = 0;
       int dup = x;
       while(x>0){
        int last_digit =x %10;
        revNum = (revNum*10) + last_digit;
        x = x/10;

       }
       return dup == revNum;
    }
}