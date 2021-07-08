class QnA18{
//Write a program in C++ to find the area of any triangle using Heron's Formula.   

  public static void main(String [] args){
    double x=5,y=5,z=5;
    System.out.println("Input the length of 1st side of the triangle :"+x);
    System.out.println("Input the length of 2nd side of the triangle :"+y);
    System.out.println("Input the length of 3rd side of the triangle :"+z);
    double s=(x+y+z)/2;
    double areatr=Math.sqrt(s*(s-x)*(s-y)*(s-z));
    System.out.println("The area of the triangle is : "+areatr);

  }
}