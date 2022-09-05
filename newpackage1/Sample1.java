package newpackage1;
import java.util.Arrays;
import java.util.Scanner;
public class Sample1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        MovablePoint obj=new MovablePoint();
        int a;
        System.out.println("Enter the operation:\n1.Display initial points\n2.Display initial speed\n3.Set points\n4.Set Speed\n5.Display final moveable point\n6.Insert 2 points value\n7.Insert 2 speed value");
        a=s.nextInt();
        switch(a)
        {
            case 1:
                System.out.println("X="+obj.getX());
                System.out.println("Y="+obj.getY());
                break;
            case 2:
                System.out.println("Xspeed="+obj.getXSpeed());
                System.out.println("Yspeed="+obj.getYSpeed());
                break;
            case 3:
                System.out.println("Enter x=");
                float b=s.nextFloat();
                obj.setX(b);
                System.out.println("Enter y=");
                float c=s.nextFloat();
                obj.setY(c);
                break;
            case 4:
                System.out.println("Enter xSpeed=");
                float d=s.nextFloat();
                obj.setXSpeed(d);
                System.out.println("Enter ySpeed=");
                float e=s.nextFloat();
                obj.setYSpeed(e);
                break;
            case 5:
                System.out.println(obj.move());
            case 6:
                System.out.println("Enter x and y:");
                float f=s.nextFloat();
                float g=s.nextFloat();
                obj.setXY(f, g);
                System.out.println(Arrays.toString(obj.getXY()));
            case 7:
                System.out.println("Enter x and y speeds:");
                float h=s.nextFloat();
                float i=s.nextFloat();
                obj.setSpeed(h, i);
                System.out.println(Arrays.toString(obj.getSpeed()));   
            case 8:
                System.out.println("Enter x,y,xspeed and yspeed:");
                float j=s.nextFloat();
                float k=s.nextFloat();
                float l=s.nextFloat();
                float m=s.nextFloat();
                MovablePoint obj1=new MovablePoint(j,k,l,m);
                System.out.println(obj1.toString());
                MovablePoint obj2=new MovablePoint(l,m);
                System.out.println(obj2.toString());
        }
       
    }    
}
class Point
{
    float x=0.0f,y=0.0f;

    Point(){}
    float getX()
    {
        return this.x;
    }
    void setX(float x)
    {
        this.x=x;
    }
    float getY()
    {
        return this.y;
    }
    void setY(float y)
    {
        this.y=y;
    }
    void setXY(float x,float y)
    {
        this.x=x;
        this.y=y;
    }
    float[] getXY()
    {
        float a[]=new float[2];
        a[0]=this.x;
        a[1]=this.y;
        return a;
    }
    @Override
    public String toString()
    {
       return "("+x+","+y+")";
    }
}
class MovablePoint extends Point
{
    float xSpeed=0.0f,ySpeed=0.0f;
    MovablePoint(float x,float y,float xSpeed,float ySpeed)
    {
        super.x=x;
        super.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    MovablePoint(float xSpeed,float ySpeed)
    {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    MovablePoint(){}
    float getXSpeed()
    {
        return this.xSpeed;
    }
    void setXSpeed(float x)
    {
        this.xSpeed=x;
    }
    float getYSpeed()
    {
        return this.ySpeed;
    }
    void setYSpeed(float y)
    {
        this.ySpeed=y;
    }
    void setSpeed(float x,float y)
    {
        this.xSpeed=x;
        this.ySpeed=y;
    }
    float[] getSpeed()
    {
        float a[]=new float[2];
        a[0]=xSpeed;
        a[1]=ySpeed;
        return a;
    }
    String move()
    {
        System.out.println("Movable point:");
        super.x+=this.xSpeed;
        super.y+=this.ySpeed;
        return this.x+","+this.y;
    }
    @Override
    public String toString()
    {
       return "("+x+","+y+")"+","+"speed"+"="+"("+xSpeed+","+ySpeed+")";
    }
   
}