package com.company.example.ch10.Generics;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int []arr = {1, 5, 2, 6, 3, 7, 4};
        int [][]com = {{2,5,3},{4,7,2},{1,7,3}};

    }
}
/*
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        int[] alw = {};
        int[] ali = {};
        int ans = 0;
        for(int i = 0; i < 3; i++) {
            int ca = 0;
            for(int j = 0; j < 3; j++) {
                ali[j] = commands[i][j];
            }
            for(int v = ali[0]; v <= ali[1]; v++) {
                alw[ca] = array[v];
                ca++;
            }

            Arrays.stream(answer).sorted();


        }
        return answer;
    }
  }
*/
/*
    class Solution {

        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            for(int i=0; i <commands.length; i++){
                int min = commands[i][0];
                int max = commands[i][1];
                int k = commands[i][2]-1;

                int[] a = new int[max - min + 1];

                for(int j = 0; j < a.length; j++) {
                    a[j] = array[j + min - 1];
                }
                Arrays.sort(a);
                answer[i] = a[k];
            }

            return answer;
        }
    }
*/
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}