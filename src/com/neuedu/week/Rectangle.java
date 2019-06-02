package com.neuedu.week;

public class Rectangle extends Shape {
       public String qiuZC(double width,double height) {
           if (width > 0 && height > 0) {
               return "矩形的周长为：" + 2 * (width + height);
           } else {
               return "该矩形的长和宽不合法，长和宽必须大于0";
           }
       }
}
