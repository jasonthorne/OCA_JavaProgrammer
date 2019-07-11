package com.noel;

public class Triangle{
    public int base;
    public int height;
    public double area;
    
    public Triangle(int base, int height){
        this.base = base; this.height = height;
        updateArea();
    }

    void updateArea(){
        area = base*height/2;
    }
    public void setBase(int b){ base  = b; updateArea(); }
    public void setHeight(int h){ height  = h; updateArea(); }
}
