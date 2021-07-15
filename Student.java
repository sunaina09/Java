class Student{

/* 1.Write a program to print the names of students by creating a Student class. 
If no name is passed while creating an object of the Student class, then the name should be "Unknown", 
otherwise the name should be equal to the String value passed while creating the object of the Student class.*/
 
 String name;

 public Student(String name) {
   this.name=name;
   System.out.println(name);
 }

 public Student() {
   System.out.println("unknown");
 }

 public static void main (String []args){
   new Student();
   new Student("Tom");
 }
 

}