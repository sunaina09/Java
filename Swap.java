class Swap{
//13. Write a program in java to swap two numbers.   

 public static void main(String []args){
    int a=10, b=20, c;
    System.out.println("Before swapping 1st number :"+a);
    System.out.println("Before swapping 2nd number :"+b);
    c=a;
    a=b;
    b=c;
    System.out.println("After swapping the 1st number is :"+a);
    System.out.println("After swapping the 2nd number is :"+b);
 }
}