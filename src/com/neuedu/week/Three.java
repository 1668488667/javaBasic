package com.neuedu.week;

public class Three {
// 输入两个正整数m和n，求其最大公约数和最小公倍数。
    public int division(int x,int y){
        int t;
        if (x<y){
            t=x;
            x=y;
            y=t;
        }
        while (y!=0){
            if (x==y){
                return 1;
            }else {
                int k=x%y;
                x=y;
                y=k;
            }
        }
        return x;
    }
}
