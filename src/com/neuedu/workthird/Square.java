package com.neuedu.workthird;

public class Square extends Chart {
    private double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public double zhouchang(){
       return 4*width;
    }
    public double  mianji(){
        return width*width;
    }

}
