package _0009PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        //特殊情况1：0是回文数
        if (x == 0) return true; 
        //特殊情况2：负数不是回文数
        if (x < 0) return false;
        //特殊情况3：以0结尾的数都不是回文数
        if (x % 10 ==0) return false;

        //偶数情况
        int sum = 0;
        while (x > sum){
            sum = sum*10 + x%10;
            x/=10;
        }
        return (x == sum) || (x == sum/10);
    }
}
