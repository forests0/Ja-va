package com.company.example.ch14.simpletests;
import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        //문제6
        ArrayList<Integer> myList =new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        Collections.sort(myList, Collections.reverseOrder());
        System.out.println(myList);

        //문제7
        ArrayList<String> myLists =new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String join =  String.join(",", myLists);
        System.out.println(join); // [Life, is, too, short] 출력
    }
}
