package com.ohgiraffers.java.practice.chanwool.chap03.conditional.normal;

import java.util.Scanner;

public class Normal02 {

    public static void main(String[] args) {

        /* BMI(신체질량지수)를 계산하고, 계산된 값에 따라
         * 저체중(20 미만)인 경우 "당신은 저체중 입니다.",
         * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
         * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
         * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
         *
         * 계산 예시) BMI = 67 / (1.7 * 1.7)
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("체중을 입력하세요 : ");
        int weight = sc.nextInt();
        System.out.print("키를 입력하세요 : ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);
        String condition = "";

        if ( bmi >= 30 ) {
            condition += "비만";
        } else if ( bmi >= 25 && bmi < 30) {
            condition += "과체중";
        } else if ( bmi >= 20 && bmi < 25) {
            condition += "정상체중";
        } else {
            condition += "저체중";
        }

        System.out.println("당신은 " + condition + " 입니다.");

    }
}
