package org.example;

// 문제 : `안녕하세요.`를 10번 출력해주세요.

class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(1); // 실행순서 1 : 숫자는 " 로 감싸지 않아도 됩니다.
        System.out.println("2");
        System.out.println("3");
        System.out.println("사");

        System.out.print("안녕\n안녕\n안녕");
    }
}