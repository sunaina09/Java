class Area{

/* 7. Create a class to print the area of a square and a rectangle. The class has two functions with the 
same name but different number of parameters. The function for printing the area of rectangle has two 
parameters which are its length and breadth respectively while the other function for printing the area 
of square has one parameter which is the side of the square. */

 public static void area(int length, int breadth){
   int area= length*breadth;
   System.out.println("Area of the rectangle is: "+ area);
 }
 
 public static void area(int s){
   int area=s*s;
   System.out.println("Area of the square is: "+ area);
 }


 public static void main(String []args){
  area(25,12);
  area(6);
 }
}