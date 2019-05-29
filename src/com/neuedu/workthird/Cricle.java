package com.neuedu.workthird;

public class Cricle extends Chart {
//    定义一个图形类
//2 创建图形 圆形 正方形 有自己的属性 例如圆形的特征
// 都有半径 分别定义自己的计算面积和计算周长
//3 创建main方法 进行测试 创建对象 调用方法计算面积和周长
    private double radius;
    double r=Math.PI;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double zhoucahng(){
        return c=2*r*radius;
    }

    public double mianji(){
        return s = r*(Math.pow(radius,1));
    }
}
