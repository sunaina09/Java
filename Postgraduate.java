class Degree{

/* 9. Create a class 'Degree' having a function 'getDegree' that prints "I got a degree". It has two 
subclasses namely 'Undergraduate' and 'Postgraduate' each having a function with the same name 
that prints "I am an Undergraduate" and "I am a Postgraduate" respectively. Call the function by 
creating an object of each of the three classes. */

 public void getDegree(){
   System.out.println("I got degree");
 }
} 


class Undergraduate extends Degree{

 public void getDegree(){
     System.out.println("I am an Undergraduate");
 }
}

class Postgraduate extends Degree{

 public void getDegree(){
     System.out.println("I am postgraduate");
 }

 public static void main(String []args){
   Postgraduate p= new Postgraduate ();
   p.getDegree();
   Undergraduate u= new Undergraduate ();
   u.getDegree();
   Degree g= new Degree();
   g.getDegree();
 }
}

