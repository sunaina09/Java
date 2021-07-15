class PrintNumber{

/* 5. Create a class named 'PrintNumber' to print various numbers of different datatypes by creating 
different functions with the same name 'printn' having a parameter for each datatype. */

 public static void printn(int a){
   System.out.println("int data type: "+a);  
 }

 public static void printn(double b){
   System.out.println("double data type: "+b);  
 }

 public static void printn(float c){
   System.out.println("float data type: "+c);  
 }

 public static void main(String []args){
  printn(2356);
  printn(25.6889);
  printn(2.1f);
 }
}