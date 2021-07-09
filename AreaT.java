class AreaT{
//Write a program in java to find the area of any triangle using Heron's Formula.   

  public static void main(String [] args){
    double x=5,y=5,z=5;
    double s=(x+y+z)/2;
    double areatr=Math.sqrt(s*(s-x)*(s-y)*(s-z));
    System.out.println("The area of the triangle is : "+areatr);

  }
}