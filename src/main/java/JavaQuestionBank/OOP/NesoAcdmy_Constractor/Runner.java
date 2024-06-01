package JavaQuestionBank.OOP.NesoAcdmy_Constractor;

import java.awt.*;

public class Runner {
    public static void main(String[] args) {
        Circle c=new Circle();
        System.out.println(c.center);    //null
        System.out.println(c.radius);    //0.0
        System.out.println("c1.getPerimeter() = " + c.getPerimeter());
        Circle c1=new Circle(new Point(1,2),3);
        System.out.println(c1.center);    //null
        System.out.println(c1.radius);    //0.0
        System.out.println("c1.getPerimeter() = " + c1.getPerimeter());

        //c1.center=new Point(0,0);
      //c1.radius=3;
      //System.out.println(c1.center);    //java.awt.Point[x=0,y=0]
      //System.out.println(c1.radius);    //3.0

      //c1.setCenter(new Point(1,2));
      //c1.setRadius(10);
      //System.out.println(c1.center);
      //System.out.println(c1.radius);
      //System.out.println("c1.getArea() = " + c1.getArea());
      //System.out.println("c1.getPerimeter() = " + c1.getPerimeter());

        //Circle c=new Circle(new Point(1,2),3);

    }



}
