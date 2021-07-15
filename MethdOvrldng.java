class MethdOvrldng{

/*6. Create a class to print an integer and a character using two functions having the 
same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first function are of the form (int n, char c), 
then that of the second function will be of the form (char c, int n). */

 public static void functn(int n, char c){
   System.out.println("integer is: "+ n+ " character is: "+c);
 }

 public static void functn(char c, int n){
   System.out.println("character is: "+c+" integer is: "+ n);
 }

 public static void main(String []args){
   functn(12, 'A');
   functn('Z',36);
 }

}