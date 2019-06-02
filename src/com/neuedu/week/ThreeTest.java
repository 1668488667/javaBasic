package com.neuedu.week;

import java.util.Scanner;

public class ThreeTest {
    public static void main(String[] args) {
        int a,b;
        Scanner s1=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        a=s1.nextInt();
        b=s2.nextInt();
        Three th=new Three();
        int m=th.division(a,b);
        int n=a*b/m;
        System.out.println("最大公约数："+m);
        System.out.println("最小公倍数："+n);

    }
}
