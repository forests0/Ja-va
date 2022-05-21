package com.company.example.ch14.simpletests;
import java.util.*;
public class HashMaps {
    public static void main(String[] args) {
        //문제8
        HashMap<String, Integer> grades =new HashMap<>();
        grades.put("A", 90);
        grades.put("B", 80);
        grades.put("C", 70);
        grades.remove("b", 80);
        System.out.println(grades);

        //문제9
        ArrayList<Integer> numbers =new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> hashSet = new HashSet<>();
        for(Integer item : numbers){
            hashSet.add(item);
        }
        System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력
    }
}
