package com.neuedu.worksecond;

public class Student {
//    1 有五个学生，每个学生有3门课的成绩，从键盘输入以上数据
//   （包括学生号，姓名，三门课成绩），计算出平均成绩
    int num;
    String sname;
    double score1;
    double score2;
    double score3;
    public  Student(int num,String sname,double score1,double score2,double score3){
        this.num=num;
        this.sname=sname;
        this.score1=score1;
        this.score2=score2;
        this.score3=score3;
    }

}
