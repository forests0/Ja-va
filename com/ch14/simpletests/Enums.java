package com.company.example.ch14.simpletests;
import java.util.HashMap;

import static com.company.example.ch14.simpletests.Enums.Price.*;

public class Enums {
    public static void main(String[] args) {

        printCoffeePrice(1);  // "가격은 3000원 입니다." 출력
        printCoffeePrice(99);

    }

    enum Price {
        Amer, IceAm, Caffe;
    }

    static void printCoffeePrice(int type) {
        //문제10에 쓰는 함수(매직넘버 제거)

        HashMap<Price, Integer> priceMap =new HashMap<>();
        priceMap.put(Amer,2000);  // 1: 아메리카노
        priceMap.put(IceAm, 4000);  // 2: 아이스 아메리카노
        priceMap.put(Caffe, 5000);  // 3: 카페라떼
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }
}
