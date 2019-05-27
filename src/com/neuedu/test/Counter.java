package com.neuedu.test;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
//    3 定义一个计算器类，包括加、减、乘、除运算。
//   并对其进行测试
        Scanner m = new Scanner(System.in);
        System.out.println("请输入第一个要计算的数：");
        Double num1 = m.nextDouble();
        System.out.println("输入运算符+ - * /(不输入默认为+).");
        char z = '+';
        try {
            char[] x = m.next().toCharArray();
            z = x[0];
        } catch (Exception e) {
            System.out.println("运算符输入错误");
        }
        System.out.println("请输入第二个要计算的数：");
        double num2 = m.nextDouble();
        switch (z) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("你输入了不存在的符号");
        }
    }
}