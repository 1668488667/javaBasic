package com.neuedu.workthird;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Cricle cle=new Cricle();
//        System.out.println("请输入圆的半径：");
//        Scanner c = new Scanner(System.in);
//        double radiuis = c.nextDouble();
//        System.out.println("面积为："+cle.mianji());
//        System.out.println("周长为："+cle.zhoucahng());
//        Square squ=new Square();
//        System.out.println("请输入正方形的边长：");
//        Scanner s= new Scanner(System.in);
//        double width=s.nextDouble();
//        System.out.println(squ.zhouchang());
//        System.out.println(squ.mianji());


        Instrument i;
        Wind w = new Wind();
        Brass b = new Brass();
        i = w;  i.play();
        i = b;  i.play();
    }


}
