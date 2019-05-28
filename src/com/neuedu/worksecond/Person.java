package com.neuedu.worksecond;

public class Person {
//    4、定义两个类，描述如下：
//    4.1定义一个人类Person：
//    4.1.1定义一个方法sayHello()，可以向对方发出问候语“hello,my name is XXX”
//    4.1.2有三个属性：名字、身高、体重
//    4.2定义一个PersonCreate类：
//    4.2.1创建两个对象，分别是zhangsan，33岁，1.73；
//      lishi，44，1.74 5.2.2分别调用对象的sayHello()方法。

    String name;
    int height;
    int weight;
    int age;
    public void sayhello(){
        System.out.println("hello,my name is"+name);
    }

    public  String getName(){
        return name;
    }
    public void setName(String name1){
        this.name=name1;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int height1){
        this.height=height1;
    }

    public int getWeight(){
        return weight ;
    }
    public void setWeight(int weight1){
        this.weight=weight1;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age1){
        this.age=age1;
    }
}
