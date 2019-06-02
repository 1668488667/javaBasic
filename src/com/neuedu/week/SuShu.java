package com.neuedu.week;

public class SuShu {
    public static void main(String[] args) {
//        2 判断101-200之间有多少个素数，并输出所有素数。
//        素数是什么：
//                质数又称素数。一个大于1的自然数，除了1和它自身外，
//                不能被其他自然数整除的数叫做质数；否则称为合数。
        int count = 0;
        for (int i=101;i<=200;i++){
            boolean b=false;
            for (int j=2;j<=Math.sqrt(i);j++){
                if (i%j==0){
                    b=false;
                    break;
                }else {
                    b=true;
                }
            }
            if (b){
                count++;
                System.out.println(i+"\t");
            }
        }
        System.out.println("一共有"+count+"个素数");
    }
}
