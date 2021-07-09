class Increment{
//9.Write a program in java to display the operation of pre and post increment and decrement.   
  
  public static void main(String[] args){
     int a=57;
     a++;
     System.out.println("After post increment by 1 the number is :"+a);
     ++a;
     System.out.println("After pre increment by 1 the number is :"+a);
     a=a+1;
     System.out.println("After increasing by 1 the number is :"+a);
     a--;
     System.out.println("After post decrement by 1 the number is : "+a);
     --a;
     System.out.println("After pre decrement by 1 the number is : "+a);
     a=a-1;
     System.out.println("After decreasing by 1 the number is :"+a);
   }
}