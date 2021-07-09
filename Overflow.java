class Overflow{
//8.Write a program in java to check overflow/underflow during various arithmetical operation.   

   public static void main(String []args){
     System.out.println("maximum limit of int: 2147483647 minimum limit: -2147483648");
     int n1=2147483647;
     System.out.println("Increasing from its minimum range : "+(n1+1)+" /"+(n1+2));
     System.out.println(" Product is :" +(n1*n1));
     int n2=-2147483648;
     System.out.println("Decreasing from its maximum range : "+(n2-1)+" /"+(n2-2));
     System.out.println(" Product is :" +(n2*n2));
   }
}