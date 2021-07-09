class Size{
//3. Write a program in java to find Size of fundamental data types.   
 
  public static void main(String []args){
     System.out.println("size of integer: "+ (Integer.SIZE/8)+"bytes"); 
     System.out.println("size of byte: "+ (Byte.SIZE/8)+"bytes"); 
     System.out.println("size of float: "+ (Float.SIZE/8)+"bytes"); 
     System.out.println("size of double: "+ (Double.SIZE/8)+"bytes"); 
     System.out.println("size of Short: "+ (Short.SIZE/8)+"bytes"); 
     System.out.println("size of long: "+ (Long.SIZE/8)+"bytes"); 
     System.out.println("size of char: "+ (Character.SIZE/8)+"bytes"); 
  }
}