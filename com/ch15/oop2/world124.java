package com.company.example.ch15.oop2;

public class world124 {
    public static void main(String[] args) {
        Solution ab= new Solution();

    }
}

class Solution {
    public String Solution(int n) {
        String answer = "";
        String[] a = {"4","1","2"};
        while(n > 0) {
            answer += a[n % 3];
            n = (n - 1) / 3;
        }
        return answer;
    }
}
