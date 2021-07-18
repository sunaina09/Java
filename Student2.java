class Student1{

/* 8. Create a class 'Student' with three data members which are name, age and address. 
The constructor of the class assigns default values to name as "unknown", age as '0' 
and address as "not available". It has two functions with the same name 'setInfo'. 
First function has two parameters for name and age and assigns the same whereas the 
second function takes has three parameters which are assigned to name, age and address
 respectively. Print the name, age and address of 10 students.
Hint - Use array of objects */

 String name;
 int age;
 String address;

 public Student1(){
   name="Unknown";
   age=0;
   address="not available";
 }

 public Student1(String name, int age){
   this.name= name;
   this.age= age;
 }

 public Student1(String name, int age, String address){
   this.name= name;
   this.age= age;
   this.address= address;
 }
 
 public void display()  {  
   System.out.print("Name of the student is: "+ name+" ,Age is: "+age+" ,Address is: "+ address);  
   System.out.println();  
 }  
}

class Student2{

 public static void main(String[] args) {
  Student1[] obj= new Student1[10];
  
 // for(int i=0; i<obj.length;i++){
 //   obj[i]= new Student1();
 // }
		
     obj[0]=new Student1("Samaira",22,"Sadashiv peth, Pune");
     obj[1]=new Student1("Darsh", 25,"Bandra,mumbai");
     obj[2]=new Student1();
     obj[3]=new Student1("Prutha",25);
     obj[4]=new Student1("Ninad",24,"Karve nagar, Pune");
     obj[5]=new Student1("Shantanu",21,"Kothrud, Pune");
     obj[6]=new Student1();
     obj[7]=new Student1("Mishti",24,"Koregaon Park,Pune");
     obj[8]=new Student1("Astha",20,"Juhu,mumbai");
     obj[9]=new Student1("Pradyumn",22);

   for (int i=0; i<obj.length;i++) {
	obj[i].display();
   }
 }
}