class IntNChar{

/*6. Create a class to print an integer and a character using two functions having the 
same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first function are of the form (int n, char c), 
then that of the second function will be of the form (char c, int n). */

 public IntNChar(int n, char c){
   System.out.println("integer is: "+ n+ " character is: "+c);
 }

 public IntNChar(char c, int n){
   System.out.println("character is: "+c+" integer is: "+ n);
 }

 public static void main(String []args){
   IntNChar obj= new IntNChar(12,'A');
   IntNChar obj1= new IntNChar('Z',36);
 }

}