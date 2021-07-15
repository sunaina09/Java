class Rectangle{

/* 2.Create a class named 'Rectangle' with two data members- length and breadth and a function to
calculate the area which is 'length*breadth'. The class has three constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas. */

int length;
int breadth;

public Rectangle(){
  length=0;
  breadth=0;
}

public Rectangle(int length,int breadth){
 this.length=length;
 this.breadth=breadth;
}

public Rectangle(int length){
 this.length=length;
 breadth=6;
}

public void area(){
  int area=length*breadth;
  System.out.println("area of the rectangle is: "+area);
}

 public static void main(String[] args){
    Rectangle r1= new Rectangle(5,6);
    r1.area();
    Rectangle r2= new Rectangle(8);
    r2.area();
    Rectangle r3= new Rectangle();
    r3.area();
 }


}