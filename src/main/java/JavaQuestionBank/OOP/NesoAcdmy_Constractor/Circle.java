package JavaQuestionBank.OOP.NesoAcdmy_Constractor;

import java.awt.*;

public class Circle {

    public Point center;

    public double radius;
    Circle(){
        center=new Point(0,0);
        radius=0;
    }
    Circle(Point c, double r){
      center=c;
           radius=r;
    }

    double getPerimeter()
    {
       return 2*Math.PI*radius;
    }
    double getArea(){

        return Math.PI*radius*radius;
    }
    void setRadius(double newRadius){

        radius=newRadius;
    }
    void setCenter(Point newCenter){
        center=newCenter;
    }





}
