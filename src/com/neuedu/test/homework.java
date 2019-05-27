package com.neuedu.test;

public class homework {
    public static void main(String[] args) {
//    打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
// 例如： 153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
//1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
//    for (int i=100;i<=999;i++) {
//        int a=i%10;
//        int b=i%100/10;
//        int c=i/100;
//        if (i==a*a*a+b*b*b+c*c*c) {
//            System.out.println(i);
//        }else {
//            continue;
//        }
//    }

//       题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，
//             60-89分之间的用B表示，60分以下 的用C表示。
//    Scanner input = new Scanner(System.in);
//    int result = input.nextInt();
//    if (result>=90){
//        System.out.println("A");
//    }else if (result>=60&&result<90){
//        System.out.println("B");
//    }else if (result<60) {
//        System.out.println("C");
//    }

//    题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
//    1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。
//        int a=0;
//        int b=0;
//        int c=0;
//        int d=0;
//        for (a=1;a<=4;a++){
//            for (b=1;b<=4;b++) {
//                for (c = 1; c <= 4; c++) {
//                    if (a != b && b != c && a != c) {
//                        d += 1;
//                        System.out.println(a * 100 + b * 10 + c);
//                    }
//                }
//            }
//        }
//        System.out.println("总共你呢能够组成"+d+"个数字");

// 计算9！
//        Scanner s = new Scanner(System.in);
//        System.out.println("请输入阶乘的数");
//        int a = s.nextInt();
//        long sum = 1;
//        for (int i = 1; i <= 1; i++) {
//            sum = sum * i;
//        }
//        System.out.println(a + "!=" + sum);

//        分别计算1-100之间的奇数和 和偶数和
//        int sum = 0;
//        for (int i=1;i<+100;i++){
//            if (i%2==0){
//                sum += i;
//                System.out.println("1-100之间的偶数和为"+sum);
//            }else  if (i%2!=0){
//                sum +=i;
//                System.out.println("1-100之间的奇数和为"+sum);
//            }
//        }

//        一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
//        Scanner sum = new Scanner(System.in);
//         int h = sum.nextInt();
//         int a=h%10;
//         int b=h%100/10;
//         int c=h%1000/100;
//         int d=h%10000/1000;
//         int e=h/10000;
//          if (h>100000||h<10000){
//              System.out.println("不是五位数");
//          }else  if (a==e&&b==d){
//              System.out.println(h+"为回文数");
//          }else {
//              System.out.println(h+"不是回文数");
//          }

//        判断一个年份是平年还是闰年
//        Scanner sc=new Scanner(System.in);
//        System.out.println("year=");
//        int year=sc.nextInt();
//        if ((year%4==0&&year%100!=0)||year%400==0){
//            System.out.println(year+"是闰年");
//        }else {
//            System.out.println(year+"是平年");
//        }
        
        

//        编写程序，输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换
//        Scanner input = new Scanner(System.in);
//        String data = input.next();
//        char[] c = data.toCharArray();
//        if (c[0]>=97&&c[0]<=122){
//            char result = (char)(c[0]-32);
//            System.out.println(result);
//        }else if (c[0]>=65&&c[0]<=90){
//            System.out.println(data);
//        }else {
//            System.out.println("不是英文字母，请重新输入！！！");
//        }

        
//        用 while 循环，计算 1~200 之间所有 3 的倍数之和。
//        int sum = 0;
//        for (int i=1;i<=200;i++){
//            if (i%3==0){
//                sum += i;
//            }
//        }
//        System.out.println(" 1~200 之间所有 3 的倍数之和为"+sum);

//        一个整数的各位数字之和能被 9 整除，则该数也能被 9 整除。编程验证给定的整数能否被 9 整除。
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        boolean flag = false;
//        int temp = 0;
//        while(input%10>0){
//            temp += input%10;
//            input = input/10;
//        }
//        temp = temp + input;
//        if(temp%9==0){
//            flag = true;
//        }
//        System.out.println(flag?"能整除":"不能整除");

    }
}
