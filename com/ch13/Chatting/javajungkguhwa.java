package com.company.example.ch13.Chatting;

public class javajungkguhwa {
    public static void main(String[] args) {
        int[] ans = {1,2,3,4,5};
        int[] sol =
    }

    class Solution {
        public int[] solution(int[] answers) {
            int[] answer = {};
            int[] st1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
            int[] st2 = {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
            int[] st3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
            int[] score = {};
            int max = -1, count = 0;
                //맞는개수
            for(int i = 0; i < answers.length; i++) {
                if(answers[i] == st1[i % st1.length]) score[0]++;
                if(answers[i] == st2[i % st2.length]) score[1]++;
                if(answers[i] == st3[i % st3.length]) score[2]++;
            }
            //가장 많이 맞힌 학생 배열에 넣기
            for(int i = 0; i < 3; i++) {
                if(score[i] > max) {
                    max = score[i];
                }
                if(score[i] == max) {
                    count++;
                }
            }
            if(count == 0) {
                answer = new int[]{score[max]};
            }
            return answer;
        }
    }
}
