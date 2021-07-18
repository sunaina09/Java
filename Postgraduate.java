class Degree{

/* 9. Create a class 'Degree' having a function 'getDegree' that prints "I got a degree". It has two 
subclasses namely 'Undergraduate' and 'Postgraduate' each having a function with the same name 
that prints "I am an Undergraduate" and "I am a Postgraduate" respectively. Call the function by 
creating an object of each of the three classes. */

 public Degree(){
   System.out.println("I got degree");
 }
} 


class Undergraduate extends Degree{

 public Undergraduate (){
     System.out.println("I am an Undergraduate");
 }
}

class Postgraduate extends Degree{

 public Postgraduate (){
     System.out.println("I am postgraduate");
 }

 public static void main(String []args){
   Postgraduate p= new Postgraduate ();
   Undergraduate u= new Undergraduate ();
   Degree g= new Degree();
 }
}

