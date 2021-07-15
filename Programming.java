class Programming{

/* 4. Create a class named 'Programming'. While creating an object of the class, 
if nothing is passed to it, then the message "I love programming languages" should be printed. 
If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
For example, while creating the object if we pass "cpp", then "I love cpp" should be printed. */

 public Programming(){
   System.out.println("I love programming languages" );
 }

 public Programming(String s){
   System.out.println("I love "+ s );
 }

 public static void main(String []args){
   Programming p1= new Programming();
   Programming p2= new Programming("Cpp");
 }
}