class Solution {

    
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();

        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); 
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }
         String cleanedStr = sb.toString();
        return palindrome(cleanedStr, 0);
    }

    
    public boolean palindrome(String str, int i) {
        int n = str.length();
        if (i >= n / 2) return true;
        if (str.charAt(i) != str.charAt(n - i - 1)) return false;
        return palindrome(str, i + 1);
    }
}
