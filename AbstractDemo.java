import java.util.*;
class AbstractDemo{
public static void main(String args[])
{
Rectangle r=new Rectangle(10,20);
System.out.println("Area of rectangle:"+r.area());
Triangle t=new Triangle(10,20);
System.out.println("ARea of triangle:"+t.area());
Circle c=new Circle(5,5);
System.out.println("Area of circle:"+c.area());
}
}
abstract class Shape{
int a,b;
Shape(int x,int y)
{
a=x;
b=y;
}
abstract double area();
}
class Rectangle extends Shape{
Rectangle(int x,int y)
{
super(x,y);
}
double area()
{
return a*b;
}
}
class Triangle extends Shape{
Triangle(int x,int y)
{
super(x,y);
}
double area()
{
return 0.5*a*b;
}
}
class Circle extends Shape{
Circle(int x,int y)
{
super(x,y);
}
double area()
{
return 3.14*a*b;
}
}
