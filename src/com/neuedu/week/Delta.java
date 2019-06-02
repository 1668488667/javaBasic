package com.neuedu.week;

public class Delta extends Shape {
    public String qiuZC(double b1,double b2,double b3){
        if ((b1+b2)>b3&&(b1+b3)>b2&&(b2+b3)>b1){
            return "三角形的周长为："+(b1+b2+b3);
        }else {
            return "该三角形的边长不合法，两边之和必须大于第三边";
        }
    }
}
