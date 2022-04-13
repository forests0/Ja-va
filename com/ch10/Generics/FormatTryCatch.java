package com.company.example.ch10.Generics;

public class FormatTryCatch {
    public static void main(String[] args) {
        String sNum = "123";
        String nNum = "h";
        try {
            int a = Integer.parseInt(sNum);
            System.out.println(a);
        }catch (NumberFormatException ee) {
            System.out.println("Is it int?");
            System.err.println(ee.getMessage());
        }catch (Exception ee) {
            System.out.println("수행되지 않았습니다");
        } finally {
            System.out.println("무조건 수행하야만 하는 개체입니다");
        }
    }
}
