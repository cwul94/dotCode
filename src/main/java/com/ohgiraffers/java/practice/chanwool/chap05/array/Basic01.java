package com.ohgiraffers.java.practice.chanwool.chap05.array;

public class Basic01 {

    public static void main(String[] args) {

        /* 길이가 10인 정수형 배열을 선언 및 할당한 뒤
         * 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요
         * */

        int iarr[] = new int[10];

        for (int i = 0; i < iarr.length; i++ ) {
            iarr[i] = i+1;
            System.out.print(iarr[i] + " ");
        }

    }

}