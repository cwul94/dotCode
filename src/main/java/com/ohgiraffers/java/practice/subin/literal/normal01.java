package com.ohgiraffers.java.practice.subin.literal;

public class normal01 {
    public static void main(String[] args) {

        /* 문자형 변수를 하나 선언 후 'a'를 대입한 후
         * 출력은 문자 'a'가 가지는 유니코드값을 출력하도록 하세요
         *
         * -- 출력 예시 --
         * 문자 a의 unicode : 97
         * */

        char ch1 = 'a';
        int charNumber = ch1;

        System.out.println("문자" + ch1 + "의 unicode : " + charNumber);
    }
}
