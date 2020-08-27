import java.util.Scanner;
class Shape{
protected String shapeName;
public Shape(String str)
{
shapeName=str;
}
double calculateArea()
{
return 0;
}
}
class Square extends Shape{
private int side;
public Square(int a)
{
	super("Square");
    side=a;
	
}
double calculateArea()
{
 return side*side;

}}
class Rectangle extends Shape{
private int length;
private int breadth;
public Rectangle(int a,int b)
{
	super("Rectangle");
    length=a;
    breadth=b;
	
 }
double calculateArea()
{
 return length*breadth;

}}
class Circle extends Shape{
private int radius;
public Circle(int a)
{
    super("Circle");
	radius=a;
	
}
double calculateArea()
{
return 3.14*radius*radius;

}}
class Main{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("1. Rectangle"+"\n"+"2. Square"+"\n"+"3. Circle"+"\n"+"Area Calculator --- Choose your shape");
int a=sc.nextInt();

switch(a)
{
case 1:
{
System.out.println("Enter length and breadth:");
int l=sc.nextInt();
int b=sc.nextInt();
Shape obj1=new Rectangle(l,b);
double area=obj1.calculateArea();
System.out.println("Area of Rectangle is:"+area);
break;
}
case 2:
{
System.out.println("Enter side:");
int s=sc.nextInt();
Shape obj1=new Square(s);
double area=obj1.calculateArea();
System.out.println("Area of Square is:"+area);
break;
}
case 3:
{
System.out.println("Enter Radius:");
int r=sc.nextInt();
Shape obj1=new Circle(r);
double area=obj1.calculateArea();
System.out.println("Area of Circle is:"+area);
return;
}
}}}}
