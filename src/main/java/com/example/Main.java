package com.example;

public class Main {
    public static void main(String[] args) {
        //i<11ならばhelloworld,i>10ならばhelloを表示する
        for (int i = 0; i < 20; i++) {
            if (i < 11) {
                System.out.println("hello world");
            } else {
                System.out.println("Hello");
            }
        }
    }
}