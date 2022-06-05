package com.company.example.ch14.simpletests;

import java.util.Arrays;

public class Marathon {
    public static void main(String[] args) {
        String[] one = {"leo","kiki","eden"};
        String[] two = {"marina","josipa","nikola", "vinko","filipa"};

        String[] cone = {"eden","kiki"};
        String[] ctwo = {"josipa","filipa","marina", "nikola"};
        System.out.println();
    }

    class Solution {
        public String solution(String[] participant, String[] completion) {

            Arrays.sort(participant);
            Arrays.sort(completion);
            String name = "";

            for(int i = 0; i < participant.length; i++) {
                if(i == completion.length) {
                    name = participant[i];
                    break;
                }
                else if(!participant[i].equals(completion[i])) {
                    name = participant[i];
                    break;
                }

            }

            return name;

        }
    }
}
