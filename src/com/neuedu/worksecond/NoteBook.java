package com.neuedu.worksecond;

public class NoteBook {
//  2、定义一个笔记本类，该类有颜色（char）和cpu型号（int）两个属性。
//  2.1 无参和有参的两个构造方法；有参构造方法可以在创建对象的同时为每个属性赋值；
//  2.2 输出笔记本信息的方法 3.3 然后编写一个测试类，测试笔记本类的各个方法。
    char color;
    int type;
//    无参构造方法
    public NoteBook(){

    }
//    有参构造方法
    public NoteBook(char color,int type){
        this.color=color;
        this.type=type;
    }
//    输出
    public void print(){
        System.out.println("笔记本的颜色是："+color+"笔记本的型号是："+type);
    }
}
